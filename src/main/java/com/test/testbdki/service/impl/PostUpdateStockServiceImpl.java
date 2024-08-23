package com.test.testbdki.service.impl;

import com.test.testbdki.entity.StockEntity;
import com.test.testbdki.model.request.UpdateStock;
import com.test.testbdki.model.response.EmptyVO;
import com.test.testbdki.repository.StockRepository;
import com.test.testbdki.service.PostUpdateStockService;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class PostUpdateStockServiceImpl implements PostUpdateStockService {

    private final StockRepository stockRepository;

    public PostUpdateStockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public EmptyVO updateStock(UpdateStock request) {

        StockEntity stockEntity = stockRepository.findById(request.getId());

        if(stockEntity != null) {
            stockEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            stockEntity.setUpdatedBy(request.getUserId());
            stockEntity.setStockItem(request.getItemStock());
            stockEntity.setImageItem(request.getItemImage());
            stockEntity.setItemName(request.getItemName());
            stockEntity.setNoSeriItem(request.getNoSeriItem());
//            stockEntity.setAdditionalInfo(request.getAdditionalInfo());
            stockEntity.setAdditionalInfo1(request.getAdditionalInfo().toString());
            stockRepository.save(stockEntity);
        }

        return EmptyVO.builder().status("UPDATE SUCCESS").build();

    }
}

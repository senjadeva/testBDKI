package com.test.testbdki.service.impl;

import com.test.testbdki.entity.StockEntity;
import com.test.testbdki.model.request.CreateStock;
import com.test.testbdki.model.response.EmptyVO;
import com.test.testbdki.repository.StockRepository;
import com.test.testbdki.service.PostCreateStockService;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;

@Service
public class PostCreateStockServiceImpl implements PostCreateStockService {

    private final StockRepository stockRepository;

    public PostCreateStockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public EmptyVO createStock(CreateStock request){

        StockEntity stockEntity = StockEntity.builder()
                .itemName(request.getItemName())
                .stockItem(request.getItemStock())
                .noSeriItem(request.getNoSeriItem())
//                .additionalInfo(request.getAdditionalInfo())
                .imageItem(request.getItemImage())
                .createdAt(new Timestamp(System.currentTimeMillis()))
                .createdBy(request.getUserId())
                .build();

        stockRepository.save(stockEntity);
        return EmptyVO.builder().status("CREATED SUCCESS").build();
    }
}

package com.test.testbdki.service.impl;

import com.test.testbdki.entity.StockEntity;
import com.test.testbdki.model.request.DetailStock;
import com.test.testbdki.repository.StockRepository;
import com.test.testbdki.service.GetDetailStockService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetDetailStockServiceImpl implements GetDetailStockService {

    private final StockRepository stockRepository;

    public GetDetailStockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public StockEntity findDetailStock(DetailStock request) {

        StockEntity stockEntity = stockRepository.findById(request.getId());

        return stockEntity;
    }
}

package com.test.testbdki.service.impl;

import com.test.testbdki.entity.StockEntity;
import com.test.testbdki.repository.StockRepository;
import com.test.testbdki.service.GetListStockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetListStockServiceImpl implements GetListStockService {

    private final StockRepository stockRepository;

    public GetListStockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<StockEntity> getListStock() {

        return stockRepository.findAllStock();

    }
}

package com.test.testbdki.service.impl;

import com.test.testbdki.model.request.DetailStock;
import com.test.testbdki.model.response.EmptyVO;
import com.test.testbdki.repository.StockRepository;
import com.test.testbdki.service.PostDeleteStockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostDeleteStockServiceImpl implements PostDeleteStockService {

    private final StockRepository stockRepository;

    public PostDeleteStockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public EmptyVO deleteStock(DetailStock request) {

        stockRepository.deleteById(Integer.valueOf(String.valueOf(request.getId())));

        return EmptyVO.builder().status("DELETE SUCCESS").build();
    }
}

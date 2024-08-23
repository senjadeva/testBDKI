package com.test.testbdki.service;

import com.test.testbdki.entity.StockEntity;
import com.test.testbdki.model.request.DetailStock;

public interface GetDetailStockService {

    public StockEntity findDetailStock(DetailStock request);
}

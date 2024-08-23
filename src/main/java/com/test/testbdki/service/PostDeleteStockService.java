package com.test.testbdki.service;

import com.test.testbdki.model.request.DetailStock;
import com.test.testbdki.model.response.EmptyVO;

import java.util.List;

public interface PostDeleteStockService {

    public EmptyVO deleteStock(DetailStock request);
}

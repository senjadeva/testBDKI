package com.test.testbdki.service;

import com.test.testbdki.model.request.CreateStock;
import com.test.testbdki.model.response.EmptyVO;

import java.util.List;

public interface PostCreateStockService {
    EmptyVO createStock(CreateStock request);
}

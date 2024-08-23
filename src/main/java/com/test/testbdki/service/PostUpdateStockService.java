package com.test.testbdki.service;

import com.test.testbdki.model.request.CreateStock;
import com.test.testbdki.model.request.UpdateStock;
import com.test.testbdki.model.response.EmptyVO;

public interface PostUpdateStockService {

    public EmptyVO updateStock(UpdateStock request);
}

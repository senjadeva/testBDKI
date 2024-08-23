package com.test.testbdki.service;

import com.test.testbdki.model.CustomError;

import java.util.List;

public interface ValidationService {

    List<CustomError> checkExtentionFile(String fileName);
}

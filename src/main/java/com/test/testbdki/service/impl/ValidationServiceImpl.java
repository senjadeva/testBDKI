package com.test.testbdki.service.impl;

import com.test.testbdki.service.ValidationService;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;

public class ValidationServiceImpl implements ValidationService {

    @Value("$file.extension-allowed")
    private String fileExtensionAllowed;

    @Override
    public void checkExtentionFile(String imageItem) {
        FilenameUtils
    }
}

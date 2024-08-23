package com.test.testbdki.service.impl;

import com.test.testbdki.model.CustomError;
import com.test.testbdki.service.ValidationService;
import com.test.testbdki.util.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService {

    @Value("${file.extension-allowed}")
    private String fileExtensionAllowed;

    @Override
    public List<CustomError> checkExtentionFile(String imageItem) {

        FileUtil fileUtil = new FileUtil(imageItem);

        String fileType = fileUtil.getFileExtension();

        String[] allowedTypes = fileExtensionAllowed.split(",");
        boolean allowed = Arrays.stream(allowedTypes).anyMatch(allowedType -> allowedType.equalsIgnoreCase(fileType));
        if (!allowed) {
            List<CustomError> errors = new ArrayList<>();
            errors.add(CustomError.builder().code("ERR0001").message("Invalid image extension").type(String.valueOf(HttpStatus.BAD_REQUEST.value())).build());
            return errors;
        }
        return Collections.emptyList();
    }
}

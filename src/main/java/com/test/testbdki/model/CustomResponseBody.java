package com.test.testbdki.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomResponseBody<T> {

    private List<T> payload;
    private List<CustomError> errors;
    private String correlationId;
    private String timestamp;
}

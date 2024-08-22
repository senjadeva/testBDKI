package com.test.testbdki.util;

import com.test.testbdki.model.CustomError;
import com.test.testbdki.model.CustomResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class ResponseBuilder<T> {

    public ResponseBuilder(){
    }

    public CustomResponse<T> buildResponse(List<T> payload, List<CustomError> errors){

        String correlationId = String.valueOf(System.currentTimeMillis());
        CustomResponse<T> response = (CustomResponse<T>) CustomResponse.builder().correlationId(correlationId).errors(errors).payload((List<Object>) payload).timestamp(LocalDateTime.now().toString()).build();
        return response;
    }
}

package com.test.testbdki.controller;

import com.test.testbdki.model.CustomResponse;
import com.test.testbdki.model.request.CreateStock;
import com.test.testbdki.model.response.EmptyVO;
import com.test.testbdki.service.PostCreateStockService;
import com.test.testbdki.util.ResponseBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping(path = "dki/v1", produces = "application/json", consumes = "application/json")
public class StrockController {

    private final PostCreateStockService postCreateStockService;

    public StrockController(PostCreateStockService postCreateStockService) {
        this.postCreateStockService = postCreateStockService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<CustomResponse<EmptyVO>> createStock(@RequestBody CreateStock request){

        return ResponseEntity.ok().body(new ResponseBuilder<EmptyVO>().buildResponse(postCreateStockService.createStock(request), Collections.emptyList()));
    }
}

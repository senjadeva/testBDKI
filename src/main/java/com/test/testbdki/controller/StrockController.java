package com.test.testbdki.controller;

import com.test.testbdki.entity.StockEntity;
import com.test.testbdki.model.CustomResponse;
import com.test.testbdki.model.request.CreateStock;
import com.test.testbdki.model.request.DetailStock;
import com.test.testbdki.model.request.UpdateStock;
import com.test.testbdki.model.response.EmptyVO;
import com.test.testbdki.service.*;
import com.test.testbdki.util.ResponseBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path = "dki/v1", produces = "application/json", consumes = "application/json")
public class StrockController {

    private final PostCreateStockService postCreateStockService;
    private final GetListStockService getListStockService;
    private final PostDeleteStockService postDeleteStockService;
    private final PostUpdateStockService postUpdateStockService;
    private final GetDetailStockService getDetailStockService;

    public StrockController(PostCreateStockService postCreateStockService, GetListStockService getListStockService, PostDeleteStockService postDeleteStockService, PostUpdateStockService postUpdateStockService, GetDetailStockService getDetailStockService) {
        this.postCreateStockService = postCreateStockService;
        this.getListStockService = getListStockService;
        this.postDeleteStockService = postDeleteStockService;
        this.postUpdateStockService = postUpdateStockService;
        this.getDetailStockService = getDetailStockService;
    }

    @PostMapping(value = "/create-stock")
    public ResponseEntity<CustomResponse<EmptyVO>> createStock(@RequestBody CreateStock request){

        return ResponseEntity.ok().body(new ResponseBuilder<EmptyVO>().buildResponse(Collections.singletonList(postCreateStockService.createStock(request)), Collections.emptyList()));
    }

    @GetMapping(value = "/list-stock")
    public ResponseEntity<CustomResponse<List<StockEntity>>> listStock(){

        return ResponseEntity.ok().body(new ResponseBuilder<List<StockEntity>>().buildResponse(Collections.singletonList(getListStockService.getListStock()), Collections.emptyList()));
    }

    @GetMapping(value = "/detail-stock")
    public ResponseEntity<CustomResponse<StockEntity>> detailStock(@RequestBody DetailStock request){

        return ResponseEntity.ok().body(new ResponseBuilder<StockEntity>().buildResponse(Collections.singletonList(getDetailStockService.findDetailStock(request)), Collections.emptyList()));
    }

    @PostMapping(value = "/update-stock")
    public ResponseEntity<CustomResponse<EmptyVO>> updateStock(@RequestBody UpdateStock request){

        return ResponseEntity.ok().body(new ResponseBuilder<EmptyVO>().buildResponse(Collections.singletonList(postUpdateStockService.updateStock(request)), Collections.emptyList()));
    }

    @PostMapping(value = "/delete-stock")
    public ResponseEntity<CustomResponse<EmptyVO>> deleteStock(@RequestBody DetailStock request){

        return ResponseEntity.ok().body(new ResponseBuilder<EmptyVO>().buildResponse(Collections.singletonList(postDeleteStockService.deleteStock(request)), Collections.emptyList()));
    }
}

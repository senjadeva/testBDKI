package com.test.testbdki.repository;

import com.test.testbdki.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StockRepository extends JpaRepository<StockEntity, Integer> {

    StockEntity findById(Long id);

    @Query("select a from StockEntity a order by a.id")
    List<StockEntity> findAllStock();
}

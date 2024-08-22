package com.test.testbdki.repository;

import com.test.testbdki.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<StockEntity, Integer> {

}

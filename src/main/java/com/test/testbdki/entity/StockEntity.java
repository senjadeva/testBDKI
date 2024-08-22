package com.test.testbdki.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stock_item")
public class StockEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_item_id_seq")
    @SequenceGenerator(name = "stock_item_id_seq", sequenceName = "stock_item_id_seq", allocationSize = 1)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "stock_item")
    private Long stockItem;

    @Column(name = "no_seri_item")
    private String noSeriItem;

    @Column(name = "additional_item", columnDefinition = "jsonb")
    private HashMap<String, String> additionalInfo;

    @Column(name = "image_item")
    private String imageItem;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;
}

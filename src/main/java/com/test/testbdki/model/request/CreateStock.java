package com.test.testbdki.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateStock implements Serializable {

    private String itemName;
    private Long itemStock;
    private String noSeriItem;
    private JSONObject additionalInfo;
    private String itemImage;
    private String userId;
}

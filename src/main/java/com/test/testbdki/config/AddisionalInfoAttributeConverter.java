package com.test.testbdki.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.boot.configurationprocessor.json.JSONObject;

@Converter
public class AddisionalInfoAttributeConverter implements AttributeConverter<JSONObject, String> {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(JSONObject address) {
        try {
            return objectMapper.writeValueAsString(address);
        } catch (JsonProcessingException jpe) {
//            log.warn("Cannot convert Address into JSON");
            return null;
        }
    }

    @Override
    public JSONObject convertToEntityAttribute(String value) {
        try {
            return objectMapper.readValue(value, JSONObject.class);
        } catch (JsonProcessingException e) {
//            log.warn("Cannot convert JSON into Address");
            return null;
        }
    }
}

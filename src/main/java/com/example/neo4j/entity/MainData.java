package com.example.neo4j.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data

public class MainData {

    Long id;
    @JsonProperty("temp")
    private float temp;
    @JsonProperty("feels_like")
    private float feels_like;
    @JsonProperty("temp_min")
    private float temp_min;
    @JsonProperty("temp_max")
    private float temp_max;
    @JsonProperty("pressure")
    private float pressure;
    @JsonProperty("humidity")
    private float humidity;
}

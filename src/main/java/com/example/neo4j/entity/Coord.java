package com.example.neo4j.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;


@Data
@Node
public class Coord {

    Long id;
    @JsonProperty("lon")
    private int lon;
    @JsonProperty("lat")
    private int lat;
}

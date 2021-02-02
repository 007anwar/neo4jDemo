package com.example.neo4j.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@Node
public class Temprature {
    @Id
    private
    Long id;
    @JsonProperty("coord")
    private Coord coord;
    @JsonProperty("main")
    private MainData main;
}

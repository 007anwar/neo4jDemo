package com.example.neo4j.controller;

import com.example.neo4j.entity.Temprature;
import com.example.neo4j.service.ClimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class TempratureController {
  @Autowired
    private ClimateService climateService;


    @GetMapping("/{log}/{lat}")
    public Temprature getTemprature(@PathVariable("log") String log,@PathVariable("lat") String lat)
    {
     return climateService.getTemprature(log,lat);
    }
}

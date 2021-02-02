package com.example.neo4j.service;

import com.example.neo4j.entity.Temprature;
import com.example.neo4j.repo.TempratureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ClimateService {
    private String apiid="435fb43f66be7dfa7c11e488bda7a7c2";
    @Autowired
    TempratureRepo tempratureRepo;
    @Autowired
    RestTemplate restTemplate;
    public Temprature getTemprature(String log,String lat)
    {
        Temprature temp = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+log+"&appid="+apiid, Temprature.class);
        System.out.println(temp);
        Temprature save = tempratureRepo.save(temp);
        System.out.println(save);
        return save;

    }
}

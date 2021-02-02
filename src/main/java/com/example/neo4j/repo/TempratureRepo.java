package com.example.neo4j.repo;

import com.example.neo4j.entity.Temprature;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempratureRepo extends Neo4jRepository<Temprature,Long> {
}

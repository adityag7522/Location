package com.personal.visited.repository;

import com.personal.visited.model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface locationRepository extends MongoRepository<Location, String> {

}
package com.example.mongodbtest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDbRepository extends MongoRepository<Study, String> {

}

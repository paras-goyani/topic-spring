package com.example.demo.topics.topicMongoDB;


import com.example.demo.topics.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface TopicRepositoryMongoDB extends MongoRepository<Topic,String> {

    @Query("{id:'?0'}")
    Optional<Topic> findById(String id);
}

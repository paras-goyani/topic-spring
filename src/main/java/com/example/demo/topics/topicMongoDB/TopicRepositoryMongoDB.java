package com.example.demo.topics.topicMongoDB;


import com.example.demo.topics.Topic;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TopicRepositoryMongoDB extends CrudRepository<Topic,String> {

}

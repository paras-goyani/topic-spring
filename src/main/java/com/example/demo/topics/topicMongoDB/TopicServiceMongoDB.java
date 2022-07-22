package com.example.demo.topics.topicMongoDB;

import com.example.demo.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


@Service
public class TopicServiceMongoDB {

    @Autowired
    private TopicRepositoryMongoDB topicRepositoryMongoDB;

    public List<Topic> getAllTopics(){

        return new ArrayList<>((Collection) topicRepositoryMongoDB.findAll());

    }

    public Optional<Topic> getTopic(String id){

        return topicRepositoryMongoDB.findById(id);


    }

    public void addTopic(Topic topic) {

        topicRepositoryMongoDB.save(topic);
    }


    public Topic updateTopic(String id,Topic topic) {
        return topicRepositoryMongoDB.save(topic);



    }

    public void deleteTopic(String id) {

        topicRepositoryMongoDB.deleteById(id);
    }
}

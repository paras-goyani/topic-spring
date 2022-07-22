package com.example.demo.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceDB {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1","spring","Spring Description"),
            new Topic("2","java","java Description"),
            new Topic("3","python","python Description"),
            new Topic("4","Api","Api Description"),
            new Topic("5","spring boot","Spring boot Description")
    ));


    public List<Topic> getAllTopics(){

        List<Topic> topics = new ArrayList<>();

        topicRepository.findAll()
                .forEach(topics::add);

        return  topics;
    }

    public Optional<Topic> getTopic(String id){

        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id,Topic topic) {
        topicRepository.save(topic);

    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}

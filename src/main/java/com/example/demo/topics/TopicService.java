package com.example.demo.topics;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1","spring","Spring Description"),
            new Topic("2","java","java Description"),
            new Topic("3","python","python Description"),
            new Topic("4","Api","Api Description"),
            new Topic("5","spring boot","Spring boot Description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Optional<Topic> getTopic(String id){
        return Optional.of(topics.stream().filter(t -> t.getId().equals(id)).findFirst().get());
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id,Topic topic) {
        for(int i=0;i<topics.size();i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        for(int i=0;i<topics.size();i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.remove(i);
                return;
            }
        }
    }
}

package com.example.demo.topics;


import com.example.demo.topics.topicMongoDB.TopicServiceMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class TopicController {

    @Autowired
    private TopicServiceMongoDB topicService;

    @RequestMapping("/topics")

    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public Topic updateTopic(@PathVariable String id,@RequestBody Topic topic) {
        return topicService.updateTopic(id,topic);

    }

    @RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
    public String deleteTopic(@PathVariable String id){

        topicService.deleteTopic(id);

        return "Deleted";
    }



}

package com.mithu.controller;

import com.mithu.modelEntity.Topic;
import com.mithu.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;



//  @RequestMapping("/hello") // like GetMapping , There 3 are same
//  @GetMapping("/hello")
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String sayHi(){
        return "Hi Wasim";
    }

//    @RequestMapping("/topics")
//    public List<Topic> getAllTopics(){
//        return Arrays.asList(
//                new Topic("Java","Java1","Java Topic"),
//                new Topic("Python","Python1","Python Course")
//        );
//    }



//  @RequestMapping("/topics")  // There are 3 are same
//  @GetMapping("/topics")
    @RequestMapping(method = RequestMethod.GET,value ="/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }


//  @GetMapping("/topics/{id}")
//  @RequestMapping("/topics/{id}")
    @RequestMapping(method = RequestMethod.GET,value ="/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

//  @PostMapping("/topics")
    @RequestMapping(method = RequestMethod.POST,value ="/topics")
    public Topic addTopic(@RequestBody Topic topic){
        return topicService.addTopic(topic);
    }

//    @PutMapping("/topics")
//    public Topic updateTopic(@RequestBody Topic topic){
//        return topicService.updateTopic(topic);
//    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id){
        return topicService.updateTopic(id,topic);
    }

//    @DeleteMapping("/topics/{id}")
//    public ResponseEntity<HttpResponse> deleteTopic(@PathVariable String id){
//        try {
//            topicService.deleteTopic(id);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }


}

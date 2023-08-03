package com.mithu.services;

import com.mithu.modelEntity.Topic;
import com.sun.source.tree.BreakTree;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicServiceImpl implements TopicService{

    private List<Topic> topics= new ArrayList<>(Arrays.asList( //for making mutable I took new ArrayList
            new Topic("Java","Java1","Java Topics"),
            new Topic("Python","Python1","Python Topics"),
            new Topic("SpringBoot","SpringBoot1","SpringBoot Topics")
    ));

    @Override
    public List<Topic> getAllTopics() {
        return topics;
    }

//    @Override
//    public Topic getTopic(String id){
//        Topic t=null;
//        for (Topic topic1:topics) {
//            if (topic1.getId()==id){
//                t=topic1;
//                break;
//            }
//        }
//        return t;
//    }

    @Override
    public Topic getTopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    @Override
    public Topic addTopic(Topic topic){
        topics.add(topic);
        return topic;
    }

//    @Override
//    public Topic updateTopic(Topic topic){
//        topics.forEach(e->{
//            if (e.getId()==topic.getId()){
//                e.setName(topic.getName());
//                e.setDescription(topic.getDescription());
//            }
//        });
//        return topic;
//    }

    @Override
    public Topic updateTopic(String id, Topic topic){
        for (int i=0;i<topics.size();i++){
            Topic t=topics.get(i);
            if (t.getId().equals(id)){
                topics.set(i,topic);
            }
        }
        return  topic;
    }


//    @Override
//    public void deleteTopic(String id){
//        topics=topics.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
//    }

    @Override
    public void deleteTopic(String id){
         topics.removeIf(t->t.getId().equals(id));
    }
}

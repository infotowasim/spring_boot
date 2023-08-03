package com.mithu.services;


import com.mithu.modelEntity.Topic;

import java.util.List;

public interface TopicService {
    public List<Topic> getAllTopics();
    public Topic getTopic(String id);
    public Topic addTopic(Topic topic);
//  public Topic updateTopic(Topic topic);
    public Topic updateTopic(String id, Topic topic);
//    public void deleteTopic(String id);

    public void deleteTopic(String id);
}

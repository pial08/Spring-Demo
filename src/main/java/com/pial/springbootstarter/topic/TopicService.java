package com.pial.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic(1, "Spring-Boot", "Spring boot Tutorial"),
                new Topic(2, "JavaScript", "JS tutirial"),
                new Topic(3, "Python", "Python django tutorial")
        );

    public List<Topic> getTopics() {
        return topics;
    }
}

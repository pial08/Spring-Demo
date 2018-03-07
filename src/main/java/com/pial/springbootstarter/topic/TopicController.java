package com.pial.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> allTopic() {
        return Arrays.asList(
                new Topic(1, "Spring-Boot", "Spring boot Tutorial"),
                new Topic(2, "JavaScript", "JS tutirial"),
                new Topic(3, "Python", "Python django tutorial")
        );
    }
}

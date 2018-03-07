package com.pial.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";

    }

    @RequestMapping("/errorShit")
    public String errorShit() {
        return "This is an error page";
    }
}

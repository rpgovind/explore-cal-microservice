package com.iris.ec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello/{name}/{age}")
    public void insert(@PathVariable("name") String name,
                       @PathVariable("age") int age)
    {

        // Print and display name and age
        System.out.println(name);
        System.out.println(age);
    }
}

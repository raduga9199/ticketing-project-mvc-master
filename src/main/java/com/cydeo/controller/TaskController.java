package com.cydeo.controller;

import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/task")
public class TaskController {
    @GetMapping("create")
    public String createTask(){
        return "task/create";
    }
}

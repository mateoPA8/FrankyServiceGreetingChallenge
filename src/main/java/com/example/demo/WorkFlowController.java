package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/work-flow")
public class WorkFlowController {
    @Autowired
    WorkflowService workflowservice;
    @GetMapping()
    public List list(){
        return workflowservice.obtainList();
    }
    @PostMapping
    public void save(@RequestBody WorkflowDto workflowDto){
        WorkFlow workFlow =new WorkFlow(workflowDto.name(),workflowDto.description());
        this.workflowservice.create(workFlow);
    }

}

package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkflowService {
    List<WorkFlow> list=new ArrayList<>();
    public List obtainList(){
        return this.list;
    }
    public void create(WorkFlow workFlow){
        this.list.add(workFlow);
    }
    public void delete(String newName, WorkFlow workFlow){
        this.list.remove(workFlow.name().equals(newName));
    }
}

package com.wuyunbin.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Member {
    private Long id;
    private String name;

    private List<Object> domainEvents=new ArrayList<>();

    private void addEvent(Object e){
        domainEvents.add(e);
    }

    public List<Object> pullDomainEvents(){
        List<Object> events=new ArrayList<>(domainEvents);
        domainEvents.clear();
        return events;

    }
}

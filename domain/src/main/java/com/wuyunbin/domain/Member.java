package com.wuyunbin.domain;

import com.wuyunbin.event.CreateMemberEvent;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Member {
    private Long id;
    private String name;

    private List<Object> events = new ArrayList<>();

    public void create() {
        events.add(new CreateMemberEvent(id, name));
        System.out.println("create member " + id + " " + name);
    }

    public List<Object> pullEvents() {
        List<Object> events = this.events;
        this.events = new ArrayList<>();
        return events;
    }
}

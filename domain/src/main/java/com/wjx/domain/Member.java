package com.wjx.domain;

import com.wjx.events.MemberCreate;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王金鑫
 */
@Data
public class Member {
    private Long id;
    private String name;
    List<Object> domainEvents=new ArrayList();
    public void create(){
        addDomainEvent(new MemberCreate( this.id, this.name));
    }
    private void addDomainEvent(Object event){
        domainEvents.add(event);
    }
    public List<Object> pullDomainEvents(){
        List<Object> events= new ArrayList<>(domainEvents);
        domainEvents.clear();
        return events;
    }
}

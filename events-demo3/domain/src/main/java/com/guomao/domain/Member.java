package com.guomao.domain;


import com.guomao.event.CreateMemberEvents;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Member {

    private Long id;
    private String name;

    private List<Object> domainevents=new ArrayList<>();
    /**
     * 创建成员事件
      */
    public void create(){
        addDomainEvent(new CreateMemberEvents(this.id,this.name));
    }


    /**
     * 添加领域事件到事件集合中
     * @param event 需要添加的领域事件对象
     */
    private void addDomainEvent(Object event){
        domainevents.add(event);
    }

    /**
     * 清空领域事件集合
     *
     * @return
     */
    public List<Object> clearDomainEvents(){

        List<Object> events=new ArrayList<>(domainevents);
        domainevents.clear();
        return events;
    }
}

package com.wuyunbin.domain;

import com.wuyunbin.event.CreateMemberEvent;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Member {
    private Long id;
    private String name;
    private String password;
    private List<Object> domainEvents=new ArrayList<>();//不能让domainEvents为null
    //只实现方法本身，不关注要拿去干什么
    public void create(){
    //将创建会员事件放入队列
        addEvent(new CreateMemberEvent(this.id,this.name));
    }

    private void addEvent(Object e){
        System.out.println("add event:"+e);
        domainEvents.add(e);
    }
    //获取事件并清空队列
    public List<Object> pullDomainEvents(){
        List<Object> events=new ArrayList<>(domainEvents);
        domainEvents.clear();
        return events;
    }
}

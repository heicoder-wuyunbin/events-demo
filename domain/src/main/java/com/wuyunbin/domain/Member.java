package com.wuyunbin.domain;

import com.wuyunbin.event.CreateMemberEvent;
import com.wuyunbin.port.MemberRepository;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Member {
    private Long id;
    private String name;
    private String password;
    private MemberRepository memberRepository;
    private String email;

    private List<Object> domainEvents=new ArrayList<>();
    /**
     * 创建成员事件
     * <p>
     * 该方法用于创建一个新的成员事件，并将其添加到事件队列中。
     * 通过传入当前对象的id和name属性来构造CreateMemberEvent事件对象。
     */
    public void create(){

        addEvent(new CreateMemberEvent(this.id,this.name));
    }

    /**
     * 添加事件到领域事件集合中
     * @param e 要添加的事件对象
     */
    private void addEvent(Object e){
        System.out.println("add event:"+e);
        domainEvents.add(e);
    }


    /**
     * 获取领域事件列表
     * <p>
     * 该方法用于获取当前对象中存储的所有领域事件，并在获取后清空事件列表。
     * 返回的事件列表是当前事件列表的一个副本，不会影响原始数据。
     *
     * @return List<Object> 领域事件对象列表的副本
     */
    public List<Object> pullDomainEvents(){
        // 创建当前领域事件列表的副本并清空原列表
        List<Object> events=new ArrayList<>(domainEvents);
        domainEvents.clear();
        return events;

    }
}

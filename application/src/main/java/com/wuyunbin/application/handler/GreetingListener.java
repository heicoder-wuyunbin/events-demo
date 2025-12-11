package com.wuyunbin.application.handler;

import com.wuyunbin.event.CreateMemberEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GreetingListener {// 监听CreateMemberEvent事件
    @EventListener
    public void handler(CreateMemberEvent event){
        System.out.println("GreetingListener:"+event.name());
    }
}

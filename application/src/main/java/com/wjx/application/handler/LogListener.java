package com.wjx.application.handler;

import com.wjx.events.MemberCreate;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LogListener {
    @EventListener
    public void handle(MemberCreate event){
        System.out.println("日志监听到:"+event.name());
    }
}

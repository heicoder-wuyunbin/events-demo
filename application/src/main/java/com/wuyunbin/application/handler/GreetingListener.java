package com.wuyunbin.application.handler;

import com.wuyunbin.event.CreateMemberEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GreetingListener {
    @EventListener
    public void handle(CreateMemberEvent event) {
        System.out.println("GreetingListener: " + event.getClass().getSimpleName());
    }
}

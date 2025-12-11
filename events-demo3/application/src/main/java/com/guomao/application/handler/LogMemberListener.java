package com.guomao.application.handler;


import com.guomao.event.CreateMemberEvents;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LogMemberListener {

    @EventListener
    public void handle(CreateMemberEvents event){
        System.out.println("LogMemberListener");
    }
}

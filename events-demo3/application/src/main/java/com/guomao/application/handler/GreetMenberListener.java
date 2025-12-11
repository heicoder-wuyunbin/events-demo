package com.guomao.application.handler;

import com.guomao.event.CreateMemberEvents;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GreetMenberListener {

    @EventListener
    public void handler(CreateMemberEvents  events){
        System.out.println("哈喽"+events.name());

    }
}

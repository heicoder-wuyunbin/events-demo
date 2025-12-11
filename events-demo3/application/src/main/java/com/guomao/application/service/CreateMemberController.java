package com.guomao.application.service;


import com.guomao.application.usecase.CreateMemberUseCase;
import com.guomao.domain.Member;
import com.guomao.port.MemberRepository;
import jakarta.annotation.Resource;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateMemberController implements CreateMemberUseCase {

    @Resource
    private MemberRepository memberRepository;


    @Resource
    private ApplicationEventPublisher publisher;



    @Override
    public void excute(Member member){

        memberRepository.save(member);

        member.create();

        List<Object> events = member.clearDomainEvents();
        events.forEach(event -> {publisher.publishEvent(event);});



    }
}

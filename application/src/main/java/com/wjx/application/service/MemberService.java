package com.wjx.application.service;

import com.wjx.application.usecase.MemberUsecase;
import com.wjx.domain.Member;
import com.wjx.port.MemberRepository;
import jakarta.annotation.Resource;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements MemberUsecase {
    @Resource
    private MemberRepository memberRepository;
    @Resource
    private ApplicationEventPublisher applicationEventPublisher;
    public void execute(Member  member){
        memberRepository.save( member);
        member.create();
        List<Object> events=member.pullDomainEvents();
        if(!events.isEmpty()){
            events.forEach(( event-> applicationEventPublisher.publishEvent(event)));
        }
    }
}

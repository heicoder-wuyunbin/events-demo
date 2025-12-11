package com.wuyunbin.application.service;

import com.wuyunbin.application.usecase.CreateMemberUseCase;
import com.wuyunbin.domain.Member;
import com.wuyunbin.port.MemberRepository;
import jakarta.annotation.Resource;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateMemberService implements CreateMemberUseCase {
    @Resource
    private MemberRepository memberRepository;

    @Resource
    private ApplicationEventPublisher publisher;
    @Override
    public void create(Member member) {
        member.create();
        memberRepository.save(member);

        List<Object> events = member.pullEvents();
        if(!events.isEmpty()) {
            events.forEach(e -> publisher.publishEvent(e));
        }
    }
}

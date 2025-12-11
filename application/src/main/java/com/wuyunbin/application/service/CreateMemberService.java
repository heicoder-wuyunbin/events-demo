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
    public void execute(Member member) {

        memberRepository.save(member);
        //将创建会员事件放入队列
        member.create();
        List<Object> events = member.pullDomainEvents();//获取会员事件
        //队列不为空时逐个发布事件
        if(!events.isEmpty()){
            //通过ApplicationEventPublisher发布事件
            events.forEach(e->{
                publisher.publishEvent(e);
            });
        }
    }
}

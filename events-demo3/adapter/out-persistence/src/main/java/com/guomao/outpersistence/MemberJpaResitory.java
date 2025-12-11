package com.guomao.outpersistence;


import com.guomao.domain.Member;
import com.guomao.port.MemberRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJpaResitory implements MemberRepository {


    @Override
    public void save(Member member) {
        System.out.println("保存会员"+member.getName()+member.getId());
    }
}

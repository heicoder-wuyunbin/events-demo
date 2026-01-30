package com.wjx.outpersistense;

import com.wjx.domain.Member;
import com.wjx.port.MemberRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJpaRepository implements MemberRepository {
    public void save(Member member) {
        System.out.println("保存会员信息"+member.getName());
    }
}

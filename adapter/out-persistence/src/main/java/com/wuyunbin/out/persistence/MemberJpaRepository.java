package com.wuyunbin.out.persistence;

import com.wuyunbin.domain.Member;
import com.wuyunbin.port.MemberRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJpaRepository implements MemberRepository {
    @Override
    public void save(Member member) {
        System.out.println("save member " + member);
    }
}

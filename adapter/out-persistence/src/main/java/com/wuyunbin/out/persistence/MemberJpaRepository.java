package com.wuyunbin.out.persistence;

import com.wuyunbin.domain.Member;
import com.wuyunbin.out.persistence.converter.MemberConverter;
import com.wuyunbin.out.persistence.entity.MemberEntity;
import com.wuyunbin.out.persistence.mapper.MemberMapper;
import com.wuyunbin.port.MemberRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJpaRepository implements MemberRepository {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public void save(Member member) {
        MemberEntity memberEntity = MemberConverter.toEntity(member);
        if(memberMapper.existsById(memberEntity.getId()) == true){
            throw new RuntimeException("会员已存在");
        }
        memberMapper.save(memberEntity);
        System.out.println("保存会员信息:"+member.getId()+" "+member.getName());
    }
}

package com.wuyunbin.out.persistence.converter;

import com.wuyunbin.domain.Member;
import com.wuyunbin.out.persistence.entity.MemberEntity;

/**
 * @author qiu
 * @date 2025/12/12
 * @description
 */
public class MemberConverter {

    /**
     * 领域对象转换为实体
     * @param member
     * @return
     */
    public static MemberEntity toEntity(Member member) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(member.getId());
        memberEntity.setName(member.getName());
        return memberEntity;
    }

    /**
     * 实体转换为领域对象
     * @param memberEntity
     * @return
     */
    public static Member toDomain(MemberEntity memberEntity) {
        if(memberEntity == null){
            return null;
        }
        Member member = new Member();
        member.setId(memberEntity.getId());
        member.setName(memberEntity.getName());
        return member;
    }
}

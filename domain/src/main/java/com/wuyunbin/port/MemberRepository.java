package com.wuyunbin.port;

import com.wuyunbin.domain.Member;

public interface MemberRepository {
    /**
     * 保存会员
     * @param member 会员的领域模型
     */
    void save(Member member);
}

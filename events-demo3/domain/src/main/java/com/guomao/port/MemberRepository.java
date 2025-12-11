package com.guomao.port;

import com.guomao.domain.Member;

public interface MemberRepository {


    /*
    * 保存会员
    * */
    void save(Member member);
}

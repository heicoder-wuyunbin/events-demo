package com.guomao.application.usecase;

import com.guomao.application.service.CreateMemberController;
import com.guomao.domain.Member;

public interface CreateMemberUseCase {

    void excute(Member member);
}

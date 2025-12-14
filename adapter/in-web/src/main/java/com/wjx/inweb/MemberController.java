package com.wjx.inweb;

import com.wjx.application.usecase.MemberUsecase;
import com.wjx.domain.Member;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    private MemberUsecase memberUsecase;
    @GetMapping("/index")
    public void index(){
        Member member = new Member();
        member.setId(System.currentTimeMillis());
        member.setName("xiaobing");
        memberUsecase.execute( member);
    }
}

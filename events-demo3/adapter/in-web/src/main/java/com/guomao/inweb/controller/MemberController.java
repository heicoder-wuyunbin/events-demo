package com.guomao.inweb.controller;


import com.guomao.application.usecase.CreateMemberUseCase;
import com.guomao.domain.Member;
import com.guomao.port.MemberRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private CreateMemberUseCase createMemberUseCase;


    @GetMapping("/index")
    public void index(){
        Member member = new Member();
        member.setName("guomao");
        member.setId(1L);

        createMemberUseCase.excute(member);

    }

}

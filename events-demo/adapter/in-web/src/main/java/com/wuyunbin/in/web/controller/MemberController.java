package com.wuyunbin.in.web.controller;

import com.wuyunbin.application.usecase.CreateMemberUseCase;
import com.wuyunbin.domain.Member;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 张震最近添加的测试4
 * aaaaa
 * @author wuyunbin
 */
@RequestMapping("member")
@RestController
public class MemberController {

    @Resource
    private CreateMemberUseCase createMemberUseCase;

    @GetMapping("index")
    public void index(){
      System.out.println("张震的test666");
        //todo 这里创建一个会员用来模拟前端传入的会员信息
        Member member =new Member();
        member.setId(System.currentTimeMillis());
        member.setName("xiaohei");
        createMemberUseCase.execute(member);
    }
}

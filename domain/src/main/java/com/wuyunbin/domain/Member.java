package com.wuyunbin.domain;

import com.wuyunbin.event.CreateMemberEvent;
import com.wuyunbin.port.MemberRepository;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 会员的领域模型
 * @author wuyunbin
 * @date 2023/04/05
 * 江鸿翌
 */
@Data
public class Member {
    private Long id;
    private String name;
    private String password;

    private List<Object> domainEvents=new ArrayList<>();

    public void create(){

        addEvent(new CreateMemberEvent(this.id,this.name));
    }

    private void addEvent(Object e){
        System.out.println("add event:"+e);
        domainEvents.add(e);
    }

    public List<Object> pullDomainEvents(){
        List<Object> events=new ArrayList<>(domainEvents);
        domainEvents.clear();
        return events;

    }

        /**
     * 保存当前成员对象到仓库中
     *
     * @param memberRepository 成员数据访问仓库，用于执行保存操作
     */
    public void save(MemberRepository memberRepository){
        memberRepository.save(this);
    }


}

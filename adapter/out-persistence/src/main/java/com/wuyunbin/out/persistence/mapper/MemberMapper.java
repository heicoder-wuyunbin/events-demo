package com.wuyunbin.out.persistence.mapper;


import com.wuyunbin.out.persistence.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qiu
 * @date 2025/12/12
 * @description
 */
@Mapper
public interface MemberMapper extends JpaRepository<MemberEntity, Long> {
}

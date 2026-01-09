package com.wuyunbin.out.persistence.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qiu
 * @date 2025/12/12
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("member")
public class MemberEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;
}

package com.yy.general.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
@TableName("miscellaneous.user")
@Data
public class User1 {
    @TableField("name")
    public String username;
    public Integer age;
    public Integer id;
    @TableField("last_update")
    public LocalDateTime lastUpdate;
}

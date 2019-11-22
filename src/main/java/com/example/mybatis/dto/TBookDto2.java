package com.example.mybatis.dto;

import com.example.mybatis.entity.TBook;
import com.example.mybatis.entity.TImage;
import lombok.Data;

/**
 * @Author zp
 * @create 2019/11/22 15:15
 */
@Data
public class TBookDto2 extends TBook {
    // 如果定义为一个字段，则驼峰设置生效，xml里不需要写resultMap
    private String smallImage;
}

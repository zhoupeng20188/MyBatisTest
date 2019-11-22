package com.example.mybatis.dto;

import com.example.mybatis.entity.TBook;
import com.example.mybatis.entity.TComment;
import com.example.mybatis.entity.TImage;
import lombok.Data;

import java.util.List;

/**
 * @Author zp
 * @create 2019/11/22 15:15
 */
@Data
public class TBookDto3 extends TBook {
    // 一对多结果集设为List
    private List<TComment> comment;
}

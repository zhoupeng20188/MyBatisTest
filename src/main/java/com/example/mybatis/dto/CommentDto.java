package com.example.mybatis.dto;

import com.example.mybatis.entity.MComment;
import lombok.Data;

@Data
public class CommentDto extends MComment {
    private String userName;
}

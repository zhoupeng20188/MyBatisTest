package com.example.mybatis.mapper;

import com.example.mybatis.entity.TComment;
import com.example.mybatis.entity.TCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCommentMapper {
    long countByExample(TCommentExample example);

    int deleteByExample(TCommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(TComment record);

    int insertSelective(TComment record);

    List<TComment> selectByExample(TCommentExample example);

    TComment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") TComment record, @Param("example") TCommentExample example);

    int updateByExample(@Param("record") TComment record, @Param("example") TCommentExample example);

    int updateByPrimaryKeySelective(TComment record);

    int updateByPrimaryKey(TComment record);
}
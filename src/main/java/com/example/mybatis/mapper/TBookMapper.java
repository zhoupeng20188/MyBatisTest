package com.example.mybatis.mapper;

import com.example.mybatis.dto.TBookDto2;
import com.example.mybatis.dto.TBookDto3;
import com.example.mybatis.entity.TBook;
import com.example.mybatis.entity.TBookExample;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TBookMapper {
    long countByExample(TBookExample example);

    int deleteByExample(TBookExample example);

    int deleteByPrimaryKey(Integer bookId);

    int insert(TBook record);

    int insertSelective(TBook record);

    List<TBook> selectByExample(TBookExample example);

    List<TBookDto2> selectByExampleWithImage(TBookExample example);

    TBook selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(TBook record);

    int updateByPrimaryKey(TBook record);

    List<TBookDto3> selectByExampleWithComment(TBookExample tBookExample);

    @Update("update t_book set author = 'a4' where author = #{author}")
    void updateByAuthor(String author);
}
package com.example.mybatis.mapper;

import com.example.mybatis.entity.TUser;
import com.example.mybatis.entity.TUserExample;

import java.util.List;

public interface TUserMapper {
    long countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}
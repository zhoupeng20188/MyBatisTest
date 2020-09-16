package com.example.mybatis.mapper;

import com.example.mybatis.entity.UserExtraInfo;
import com.example.mybatis.entity.UserExtraInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserExtraInfoMapper {
    long countByExample(UserExtraInfoExample example);

    int deleteByExample(UserExtraInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserExtraInfo record);

    int insertSelective(UserExtraInfo record);

    List<UserExtraInfo> selectByExample(UserExtraInfoExample example);

    UserExtraInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserExtraInfo record, @Param("example") UserExtraInfoExample example);

    int updateByExample(@Param("record") UserExtraInfo record, @Param("example") UserExtraInfoExample example);

    int updateByPrimaryKeySelective(UserExtraInfo record);

    int updateByPrimaryKey(UserExtraInfo record);
}
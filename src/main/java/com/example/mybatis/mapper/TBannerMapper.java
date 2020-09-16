package com.example.mybatis.mapper;

import com.example.mybatis.entity.TBanner;
import com.example.mybatis.entity.TBannerExample;

import java.util.List;

public interface TBannerMapper {
    long countByExample(TBannerExample example);

    int deleteByExample(TBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBanner record);

    int insertSelective(TBanner record);

    List<TBanner> selectByExample(TBannerExample example);

    TBanner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TBanner record);

    int updateByPrimaryKey(TBanner record);
}
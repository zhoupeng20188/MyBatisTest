package com.example.mybatis.mapper;

import com.example.mybatis.entity.TGoods;
import com.example.mybatis.entity.TGoodsExample;

import java.util.List;

public interface TGoodsMapper {
    long countByExample(TGoodsExample example);

    int deleteByExample(TGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGoods record);

    int insertSelective(TGoods record);

    List<TGoods> selectByExample(TGoodsExample example);

    TGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGoods record);

    int updateByPrimaryKey(TGoods record);
}
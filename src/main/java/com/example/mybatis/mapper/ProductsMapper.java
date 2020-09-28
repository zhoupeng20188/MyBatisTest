package com.example.mybatis.mapper;

import com.example.mybatis.entity.Products;
import com.example.mybatis.entity.ProductsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductsMapper {
    long countByExample(ProductsExample example);

    int deleteByExample(ProductsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Products record);

    int insertSelective(Products record);

    List<Products> selectByExample(ProductsExample example);

    Products selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByExample(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByPrimaryKeySelective(Products record);

    int updateByPrimaryKey(Products record);
}
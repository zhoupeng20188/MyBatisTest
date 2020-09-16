package com.example.mybatis.mapper;

import com.example.mybatis.entity.TBanner;
import com.example.mybatis.entity.TGoodsBanner;
import com.example.mybatis.entity.TGoodsBannerExample;
import com.example.mybatis.entity.TImage;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TGoodsBannerMapper {

    @Select("select * from t_banner a  inner join t_goods_banner b on a.id = b.banner_id  where b.goods_id = #{id}")
    List<TBanner> getGoodsBanner(Integer id);

    long countByExample(TGoodsBannerExample example);

    int deleteByExample(TGoodsBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGoodsBanner record);

    int insertSelective(TGoodsBanner record);

    List<TGoodsBanner> selectByExample(TGoodsBannerExample example);

    TGoodsBanner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGoodsBanner record);

    int updateByPrimaryKey(TGoodsBanner record);
}
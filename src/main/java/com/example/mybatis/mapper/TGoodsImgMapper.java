package com.example.mybatis.mapper;

import com.example.mybatis.entity.TGoodsImg;
import com.example.mybatis.entity.TGoodsImgExample;
import com.example.mybatis.entity.TImage;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TGoodsImgMapper {

    @Select("select * from t_image a  inner join t_goods_img b on a.image_id = b.image_id  where b.goods_id = #{id}")
    List<TImage> getGoodsImg(Integer id);

    long countByExample(TGoodsImgExample example);

    int deleteByExample(TGoodsImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TGoodsImg record);

    int insertSelective(TGoodsImg record);

    List<TGoodsImg> selectByExample(TGoodsImgExample example);

    TGoodsImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TGoodsImg record);

    int updateByPrimaryKey(TGoodsImg record);
}
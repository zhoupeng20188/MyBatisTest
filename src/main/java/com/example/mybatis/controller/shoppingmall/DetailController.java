package com.example.mybatis.controller.shoppingmall;

import com.example.mybatis.dto.GoodsDetail;
import com.example.mybatis.entity.TBanner;
import com.example.mybatis.entity.TGoods;
import com.example.mybatis.mapper.TGoodsBannerMapper;
import com.example.mybatis.mapper.TGoodsMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetailController {

    @Autowired
    TGoodsMapper tGoodsMapper;

    @Autowired
    TGoodsBannerMapper tGoodsBannerMapper;

    @RequestMapping("/detail")
    public Object detail(Integer id) {
        long start = System.currentTimeMillis();

        TGoods tGoods = tGoodsMapper.selectByPrimaryKey(id);

        List<TBanner> goodsBanner = tGoodsBannerMapper.getGoodsBanner(id);

        GoodsDetail goodsDetail = new GoodsDetail();
        BeanUtils.copyProperties(tGoods, goodsDetail);
        goodsDetail.setBanners(goodsBanner);

        long costTime = System.currentTimeMillis() - start;
        System.out.println("用时:" + costTime + "ms");
        return goodsDetail;
    }
}

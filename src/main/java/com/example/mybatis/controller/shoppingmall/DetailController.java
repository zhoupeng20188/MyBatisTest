package com.example.mybatis.controller.shoppingmall;

import com.example.mybatis.dto.GoodsDetail;
import com.example.mybatis.entity.*;
import com.example.mybatis.mapper.TGoodsBannerMapper;
import com.example.mybatis.mapper.TGoodsImgMapper;
import com.example.mybatis.mapper.TGoodsMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DetailController {

    @Autowired
    TGoodsMapper tGoodsMapper;

    @Autowired
    TGoodsBannerMapper tGoodsBannerMapper;

    @Autowired
    TGoodsImgMapper tGoodsImgMapper;

    @RequestMapping("/detail")
    public Object detail(Integer id) {
        long start = System.currentTimeMillis();

        TGoods tGoods = tGoodsMapper.selectByPrimaryKey(id);

        List<TBanner> goodsBanner = tGoodsBannerMapper.getGoodsBanner(id);
        List<TImage> goodsImg = tGoodsImgMapper.getGoodsImg(id);

        GoodsDetail goodsDetail = new GoodsDetail();
        BeanUtils.copyProperties(tGoods, goodsDetail);
        goodsDetail.setBanners(goodsBanner);
        goodsDetail.setImgs(goodsImg);

        long costTime = System.currentTimeMillis() - start;
        System.out.println("用时:" + costTime + "ms");
        return goodsDetail;
    }

    @RequestMapping("/getRecommandGoods")
    public Object getRecommandGoods(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        long start = System.currentTimeMillis();

        TGoodsExample tGoodsExample = new TGoodsExample();
        TGoodsExample.Criteria criteria = tGoodsExample.createCriteria();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(4);
        criteria.andIdIn(integers);

        Object o = new PageInfo<>(tGoodsMapper.selectByExample(tGoodsExample));
        long costTime = System.currentTimeMillis() - start;
        System.out.println("用时:" + costTime + "ms");
        return o;
    }
}

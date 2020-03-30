package com.example.mybatis.controller.shoppingmall;

import com.example.mybatis.entity.TGoods;
import com.example.mybatis.entity.TGoodsExample;
import com.example.mybatis.entity.TImage;
import com.example.mybatis.mapper.TGoodsMapper;
import com.example.mybatis.mapper.TImageMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    TImageMapper tImageMapper;

    @Autowired
    TGoodsMapper tGoodsMapper;

    @RequestMapping("/banner/list")
    public Object getBannerList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        long start = System.currentTimeMillis();
        Object o = new PageInfo<>(tImageMapper.selectAll());
        long costTime = System.currentTimeMillis() - start;
        System.out.println("用时:" + costTime + "ms");
        return o;
    }

    @RequestMapping("/recommand/list")
    public Object getRecommandList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(2, 4);
        long start = System.currentTimeMillis();
        Object o = new PageInfo<>(tImageMapper.selectAll());
        long costTime = System.currentTimeMillis() - start;
        System.out.println("用时:" + costTime + "ms");
        return o;
    }

    @RequestMapping("/data")
    public Object getRecommandList(Integer type, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        long start = System.currentTimeMillis();

        TGoodsExample tGoodsExample = new TGoodsExample();
        TGoodsExample.Criteria criteria = tGoodsExample.createCriteria();
        criteria.andTypeEqualTo(type);

        Object o = new PageInfo<>(tGoodsMapper.selectByExample(tGoodsExample));
        long costTime = System.currentTimeMillis() - start;
        System.out.println("用时:" + costTime + "ms");
        return o;
    }
}

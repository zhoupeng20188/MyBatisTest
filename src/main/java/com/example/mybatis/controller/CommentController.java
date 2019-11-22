package com.example.mybatis.controller;

import com.example.mybatis.entity.TBookExample;
import com.example.mybatis.mapper.TBookMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zp
 * @create 2019/10/16 11:38
 */
@RestController
public class CommentController {
    private static final Logger log = LoggerFactory.getLogger(CommentController.class);
    private int iii=0;

    @Autowired
    TBookMapper tBookMapper;

    /**
     * 一对多外连接
     * @return
     */
    @RequestMapping("/selectWithComment")
    public Object selectWithComment(){
        PageHelper.startPage(1,10);
        TBookExample tBookExample = new TBookExample();
        TBookExample.Criteria criteria = tBookExample.createCriteria();
//        criteria.andBookIdEqualTo(1);
        criteria.andTitleEqualTo("t2");
        return new PageInfo(tBookMapper.selectByExampleWithComment(tBookExample));
    }
}

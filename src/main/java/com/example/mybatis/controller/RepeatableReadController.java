package com.example.mybatis.controller;

import com.example.mybatis.service.RepeatableReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zp
 * @create 2020/6/18 10:00
 */
@RestController
public class RepeatableReadController {
    @Autowired
    RepeatableReadService repeatableReadService;

    /**
     * 幻读测试
     * 事务1 select-> 事务2 insert -> 事务1 select不会出现幻读
     */
    @RequestMapping("/huandu/test1")
    public void test1(){
        repeatableReadService.test1();
    }
    /**
     * 幻读测试
     * 事务1 select-> 事务2 insert -> 事务1 select不会出现幻读
     * 事务1 select-> 事务2 insert -> 事务1 update -> 事务1 select会出现幻读
     */
    @RequestMapping("/huandu/test2")
    public void test2(){
        repeatableReadService.test2();
    }

    /**
     * 幻读测试
     * 事务1 select-> 事务2 insert -> 事务1 update -> 事务1 select会出现幻读
     */
    @RequestMapping("/huandu/test3")
    public void test3(){
        repeatableReadService.test3();
    }
}

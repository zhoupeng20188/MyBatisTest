package com.example.mybatis.controller;

import com.example.mybatis.entity.TImage;
import com.example.mybatis.entity.TImageExample;
import com.example.mybatis.entity.UserExtraInfo;
import com.example.mybatis.entity.Users;
import com.example.mybatis.mapper.TImageMapper;
import com.example.mybatis.mapper.UserExtraInfoMapper;
import com.example.mybatis.mapper.UsersMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zp
 * @create 2019/10/16 11:38
 */
@RestController
public class UsersController {
    private static final Logger log = LoggerFactory.getLogger(UsersController.class);
    private int iii=0;

    @Autowired
    UsersMapper usersMapper;

    @Autowired
    UserExtraInfoMapper userExtraInfoMapper;

    @RequestMapping("/user/insert")
    public Object insertOne(Integer cnt){
        log.info("==============insertWithThreadPoolFixed start==============");
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < cnt; i++) {
            iii = i + 1;
            executorService.execute(()->{
                Users users = new Users();
                users.setName("name"+iii);
                users.setAge(iii);
                usersMapper.insert(users);
                UserExtraInfo userExtraInfo = new UserExtraInfo();
                userExtraInfo.setAddress("address"+iii);
                userExtraInfo.setUserId(users.getId());
                userExtraInfo.setLastLoginTime(new Date());
                userExtraInfoMapper.insert(userExtraInfo);
            });

        }
        long costTime = System.currentTimeMillis() - start;
        log.info("用时:" + costTime + "ms");
        return costTime;
    }
}

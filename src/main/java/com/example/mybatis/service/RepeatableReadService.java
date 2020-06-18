package com.example.mybatis.service;

import com.example.mybatis.entity.TBook;
import com.example.mybatis.entity.TBookExample;
import com.example.mybatis.mapper.TBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author zp
 * @create 2020/6/18 10:03
 */
@Service
public class RepeatableReadService {

    @Autowired
    TBookMapper tBookMapper;

    @Transactional(rollbackFor = Exception.class)
    public void test1() {
        TBookExample tBookExample = new TBookExample();
        List<TBook> tBooks = tBookMapper.selectByExample(tBookExample);
        System.out.println(tBooks.size());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " sleep done");
        List<TBook> tBooks2 = tBookMapper.selectByExample(tBookExample);
        System.out.println(tBooks2.size());
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public void test2() {
        TBook record = new TBook();
        record.setTitle("t3");
        record.setAuthor("a3");
        tBookMapper.insert(record);
        System.out.println(Thread.currentThread().getName() + " insert done");
    }

    public void test3() {
        TBookExample tBookExample = new TBookExample();
        List<TBook> tBooks = tBookMapper.selectByExample(tBookExample);
        System.out.println(tBooks.size());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " sleep done");
        tBookMapper.updateByAuthor("a3");
        List<TBook> tBooks2 = tBookMapper.selectByExample(tBookExample);
        System.out.println(tBooks2.size());
    }
}

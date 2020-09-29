package com.example.mybatis.controller;

import com.example.mybatis.entity.Comments;
import com.example.mybatis.entity.Products;
import com.example.mybatis.mapper.CommentsMapper;
import com.example.mybatis.mapper.ProductsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zp
 * @create 2020/9/28 12:55
 */
@RestController
@Slf4j
public class CommentsController {
    @Resource
    CommentsMapper commentsMapper;
    private int[] productIds = {1,2,3};
    private int[] isGoodComments = {0,1};
    @RequestMapping("/comments/insert")
    public String insert(){
        int cnt =100 * 10000;
        int iii=0;
        log.info("==============insertWithThreadPoolFixed start==============");
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int productIdSize = productIds.length;
        int isGoodCommentSize = isGoodComments.length;
        for (int i = 0; i < cnt; i++) {
            iii = i + 1;
            int finalIii = iii;
            executorService.execute(()->{
                Comments comments = new Comments();
                int productId = productIds[finalIii % productIdSize];
                int isGoodComment = isGoodComments[finalIii % isGoodCommentSize];
                comments.setProductId(productId);
                comments.setIsGoodComment(isGoodComment);
                comments.setCotent("精品"+finalIii);
                commentsMapper.insert(comments);
                long costTime = System.currentTimeMillis() - start;
                log.info("用时:" + costTime + "ms");
            });

        }

        return "ok";
    }
}

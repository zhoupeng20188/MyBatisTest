package com.example.mybatis.controller;

import com.example.mybatis.entity.Products;
import com.example.mybatis.entity.TImage;
import com.example.mybatis.mapper.ProductsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zp
 * @create 2020/9/28 12:55
 */
@RestController
@Slf4j
public class ProductsController {
    @Resource
    ProductsMapper productsMapper;
    private String[] categorys = {"男装","女装","童装"};
    private String[] subCategorys = {"衬衣","外套","裤子","鞋子","包包","手表"};
    @RequestMapping("/product/insert")
    public String insert(){
        int cnt =900 * 10000;
        int iii=0;
        log.info("==============insertWithThreadPoolFixed start==============");
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int categorySize = categorys.length;
        int subCategorySize = subCategorys.length;
        for (int i = 100*10000; i < cnt; i++) {
            iii = i + 1;
            int finalIii = iii;
            executorService.execute(()->{
                Products products = new Products();
                String category = categorys[finalIii % categorySize];
                String subCategory = subCategorys[finalIii % subCategorySize];
                products.setCategory(category);
                products.setSubCategory(subCategory);
                products.setCount(100);
                products.setPrice(new BigDecimal(39.9));
                products.setProductName("精品"+finalIii);
                productsMapper.insert(products);
                long costTime = System.currentTimeMillis() - start;
                log.info("用时:" + costTime + "ms");
            });

        }

        return "ok";
    }
}

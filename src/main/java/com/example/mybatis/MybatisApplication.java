package com.example.mybatis;

import com.example.mybatis.mapper.UsersMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.example.mybatis.mapper")
public class MybatisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(MybatisApplication.class, args);

    }

}

package com.example.mybatis.dto;

import com.example.mybatis.entity.TBanner;
import com.example.mybatis.entity.TGoods;
import lombok.Data;

import java.util.List;

@Data
public class GoodsDetail extends TGoods {
    private List<TBanner> banners;
}

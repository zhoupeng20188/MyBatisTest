package com.example.mybatis.dto;

import com.example.mybatis.entity.TBanner;
import com.example.mybatis.entity.TGoods;
import com.example.mybatis.entity.TImage;
import lombok.Data;

import java.util.List;

@Data
public class GoodsDetail extends TGoods {
    private List<TBanner> banners;
    private List<TImage> imgs;
}

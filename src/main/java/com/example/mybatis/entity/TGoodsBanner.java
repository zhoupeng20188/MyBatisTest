package com.example.mybatis.entity;

public class TGoodsBanner {
    private Integer id;

    private Integer goodsId;

    private Integer bannerId;

    public TGoodsBanner(Integer id, Integer goodsId, Integer bannerId) {
        this.id = id;
        this.goodsId = goodsId;
        this.bannerId = bannerId;
    }

    public TGoodsBanner() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }
}
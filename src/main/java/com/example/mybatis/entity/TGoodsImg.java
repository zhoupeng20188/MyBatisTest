package com.example.mybatis.entity;

public class TGoodsImg {
    private Integer id;

    private Integer goodsId;

    private Integer imageId;

    public TGoodsImg(Integer id, Integer goodsId, Integer imageId) {
        this.id = id;
        this.goodsId = goodsId;
        this.imageId = imageId;
    }

    public TGoodsImg() {
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

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}
package com.example.mybatis.entity;

import java.math.BigDecimal;

public class TGoods {
    private Integer id;

    private String goodType;

    private String smallImage;

    private String path;

    private String title;

    private String description;

    private BigDecimal price;

    private Integer num;

    private String detail;

    public TGoods(Integer id, String goodType, String smallImage, String path, String title, String description, BigDecimal price, Integer num, String detail) {
        this.id = id;
        this.goodType = goodType;
        this.smallImage = smallImage;
        this.path = path;
        this.title = title;
        this.description = description;
        this.price = price;
        this.num = num;
        this.detail = detail;
    }

    public TGoods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType == null ? null : goodType.trim();
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage == null ? null : smallImage.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}
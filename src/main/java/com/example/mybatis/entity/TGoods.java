package com.example.mybatis.entity;

import java.math.BigDecimal;

public class TGoods {
    private Integer id;

    private Integer type;

    private String smallImage;

    private String path;

    private String title;

    private String desc;

    private BigDecimal price;

    private Integer num;

    private String detail;

    public TGoods(Integer id, Integer type, String smallImage, String path, String title, String desc, BigDecimal price, Integer num, String detail) {
        this.id = id;
        this.type = type;
        this.smallImage = smallImage;
        this.path = path;
        this.title = title;
        this.desc = desc;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
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
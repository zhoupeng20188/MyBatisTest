package com.example.mybatis.entity;

public class Comments {
    private Integer id;

    private Integer productId;

    private Integer isGoodComment;

    private String cotent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getIsGoodComment() {
        return isGoodComment;
    }

    public void setIsGoodComment(Integer isGoodComment) {
        this.isGoodComment = isGoodComment;
    }

    public String getCotent() {
        return cotent;
    }

    public void setCotent(String cotent) {
        this.cotent = cotent == null ? null : cotent.trim();
    }
}
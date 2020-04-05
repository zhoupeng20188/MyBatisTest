package com.example.mybatis.entity;

import java.util.Date;

public class MComment {
    private Integer id;

    private Integer goodsId;

    private Integer userId;

    private String comment;

    private Date commentTime;

    public MComment(Integer id, Integer goodsId, Integer userId, String comment, Date commentTime) {
        this.id = id;
        this.goodsId = goodsId;
        this.userId = userId;
        this.comment = comment;
        this.commentTime = commentTime;
    }

    public MComment() {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
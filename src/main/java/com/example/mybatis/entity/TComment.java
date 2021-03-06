package com.example.mybatis.entity;

public class TComment {
    private Integer commentId;

    private Integer bookId;

    private String content;

    public TComment(Integer commentId, Integer bookId, String content) {
        this.commentId = commentId;
        this.bookId = bookId;
        this.content = content;
    }

    public TComment() {
        super();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
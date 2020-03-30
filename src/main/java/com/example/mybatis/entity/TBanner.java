package com.example.mybatis.entity;

public class TBanner {
    private Integer id;

    private String smallImage;

    private String path;

    private String title;

    private String link;

    private String desc;

    private Integer sort;

    public TBanner(Integer id, String smallImage, String path, String title, String link, String desc, Integer sort) {
        this.id = id;
        this.smallImage = smallImage;
        this.path = path;
        this.title = title;
        this.link = link;
        this.desc = desc;
        this.sort = sort;
    }

    public TBanner() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
package com.example.mybatis.entity;

public class TBanner {
    private Integer id;

    private String smallImage;

    private String path;

    private String title;

    private String link;

    private String description;

    private Integer sort;

    private Boolean bannertype;

    public TBanner(Integer id, String smallImage, String path, String title, String link, String description, Integer sort, Boolean bannertype) {
        this.id = id;
        this.smallImage = smallImage;
        this.path = path;
        this.title = title;
        this.link = link;
        this.description = description;
        this.sort = sort;
        this.bannertype = bannertype;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getBannertype() {
        return bannertype;
    }

    public void setBannertype(Boolean bannertype) {
        this.bannertype = bannertype;
    }
}
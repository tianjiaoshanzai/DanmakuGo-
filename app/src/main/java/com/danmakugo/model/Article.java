package com.danmakugo.model;

public class Article {
    private String title;
    //推荐指数
    private int recommendPoint;
    //封面url
    private String imageUrl;
    //文章内容
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRecommendPoint() {
        return recommendPoint;
    }

    public void setRecommendPoint(int recommendPoint) {
        this.recommendPoint = recommendPoint;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

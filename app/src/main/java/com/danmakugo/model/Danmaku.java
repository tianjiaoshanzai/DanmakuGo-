/**
 * Copyright (C), 2019-2020, 天骄山仔
 * FileName: Danmaku
 * Author:   lenovo
 * Date:     2020/5/19 23:53
 * Description: 弹幕
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.danmakugo.model;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈弹幕〉
 *
 * @author lenovo
 * @create 2020/5/19
 * @since 1.0.0
 */
public class Danmaku {
    private int id;
    private int process;
    private int type;
    private float textSize;
    private int color;
    private String content;
    private int sendId;
    private int pool;

    private Date sendTime;

    //对应作品ID
    private int mediaId;


    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public int getMediaId() {
        return mediaId;
    }

    public void setMediaId(int mediaId) {
        this.mediaId = mediaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getTextSize() {
        return textSize;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSendId() {
        return sendId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
    }

    public int getPool() {
        return pool;
    }

    public void setPool(int pool) {
        this.pool = pool;
    }
}

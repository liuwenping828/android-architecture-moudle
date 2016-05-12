package com.wenping.domain;

/**
 * Created by Administrator on 2016/5/3.
 */
public class Picture {

//            "large":"https://randomuser.me/api/portraits/women/64.jpg",
//            "medium":"https://randomuser.me/api/portraits/med/women/64.jpg",
//            "thumbnail":"https://randomuser.me/api/portraits/thumb/women/64.jpg"

    private String large;
    private String medium;
    private String thumbnail;


    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}


package com.adel.androidbro.cook.data;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Recipe {

    @SerializedName("by")
    private String mBy;
    @SerializedName("desc")
    private String mDesc;
    @SerializedName("id")
    private Long mId;
    @SerializedName("img")
    private String mImg;
    @SerializedName("link")
    private String mLink;
    @SerializedName("rate")
    private Float mRate;
    @SerializedName("title")
    private String mTitle;

    public String getBy() {
        return mBy;
    }

    public void setBy(String by) {
        mBy = by;
    }

    public String getDesc() {
        return mDesc;
    }

    public void setDesc(String desc) {
        mDesc = desc;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImg() {
        return mImg;
    }

    public void setImg(String img) {
        mImg = img;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public void setRate(float rate) {
        mRate = rate;
    }

    public float getRate() {
        return mRate;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}

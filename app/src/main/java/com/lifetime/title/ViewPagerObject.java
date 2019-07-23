package com.lifetime.title;

public class ViewPagerObject {
    private String mColor;
    private int faceId;
    private String name;

    public ViewPagerObject(String mColor, int faceId, String name) {
        this.mColor = mColor;
        this.faceId = faceId;
        this.name = name;
    }

    public String getColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }

    public int getFaceId() {
        return faceId;
    }

    public void setFaceId(int faceId) {
        this.faceId = faceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

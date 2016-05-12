package com.wenping.domain;

/**
 * Created by Administrator on 2016/4/28.
 */
public class Name {

    private String title;
    private String first;
    private String last;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("***** User Details *****\n");
        stringBuilder.append("title=" + this.getTitle() + "\n");
        stringBuilder.append("first=" + this.getFirst() + "\n");
        stringBuilder.append("last=" + this.getLast() + "\n");
        stringBuilder.append("*******************************");

        return stringBuilder.toString();
    }
}

package com.wenping.domain;

/**
 * Created by Administrator on 2016/4/28.
 */
public class Location {
    /*  "street": "7794 york st",
        "city": "inverness",
        "state": "new brunswick",
        "postcode": 85884
      */
    private String street;
    private String city;
    private String state;
    private String postcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("***** User Details *****\n");
        stringBuilder.append("street=" + this.getStreet() + "\n");
        stringBuilder.append("city=" + this.getCity() + "\n");
        stringBuilder.append("state=" + this.getState() + "\n");
        stringBuilder.append("postcode=" + this.getPostcode() + "\n");
        stringBuilder.append("*******************************");

        return stringBuilder.toString();
    }
}

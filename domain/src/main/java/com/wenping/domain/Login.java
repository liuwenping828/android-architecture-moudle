package com.wenping.domain;

/**
 * Created by Administrator on 2016/4/28.
 */
public class Login {
    /*       "username":"smallswan387",
             "password":"havefun",
             "salt":"KbjokMhA",
             "md5":"82e9d0aba034dbc3fec2482f698e0f5b",
             "sha1":"7f413940a65756640434e9f74136328790dabba0",
             "sha256":"462558834fd24d3f1f27b885a2201c0874ee0c2979dd1c86d76239d906377f4f"
     */
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;
    private String sha256;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("***** Login Details *****\n");
        stringBuilder.append("username=" + this.getUsername() + "\n");
        stringBuilder.append("password=" + this.getPassword() + "\n");
        stringBuilder.append("salt=" + this.getSalt() + "\n");
        stringBuilder.append("sha1=" + this.getSha1() + "\n");
        stringBuilder.append("sha256=" + this.getSha256() + "\n");
        stringBuilder.append("*******************************");

        return stringBuilder.toString();
    }

}

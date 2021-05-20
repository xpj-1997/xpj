package org.apache.entity;

import java.io.Serializable;

/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.entity
 * @ClassName: Sights
 * @Author: xpj
 * @Date: 2021/4/23 上午 10:28
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
public class Sights implements Serializable {
    private String id;
    private String name; //景点名称
    private String img; //景点照片
    private String peak_season;//景点旺季时间
    private Double peak_price;//景点旺季门票
    private Double price;//景点淡季门票
    private String introduction;//景点介绍
    private String province;//景点所在省份

    public Sights(String id, String name, String img, String peak_season, Double peak_price, Double price, String introduction, String province) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.peak_season = peak_season;
        this.peak_price = peak_price;
        this.price = price;
        this.introduction = introduction;
        this.province = province;
    }

    public Sights() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPeak_season() {
        return peak_season;
    }

    public void setPeak_season(String peak_season) {
        this.peak_season = peak_season;
    }

    public Double getPeak_price() {
        return peak_price;
    }

    public void setPeak_price(Double peak_price) {
        this.peak_price = peak_price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Sights{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", peak_season='" + peak_season + '\'' +
                ", peak_price=" + peak_price +
                ", price=" + price +
                ", introduction='" + introduction + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}

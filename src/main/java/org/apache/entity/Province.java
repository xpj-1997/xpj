package org.apache.entity;

import java.io.Serializable;

/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.entity
 * @ClassName: Province
 * @Author: xpj
 * @Date: 2021/4/23 上午 10:20
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
public class Province implements Serializable {
    private String id;//id
    private String province;//省份名字
    private String lable;//省份标签
    private Integer num;//景点数量

    public Province(String id, String province, String lable, Integer num) {
        this.id = id;
        this.province = province;
        this.lable = lable;
        this.num = num;
    }

    public Province() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id='" + id + '\'' +
                ", province='" + province + '\'' +
                ", lable='" + lable + '\'' +
                ", num=" + num +
                '}';
    }
}

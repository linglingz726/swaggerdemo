package com.offcn.swaggerdemo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;


import java.util.Date;
/*@Data  //包含setter，getter，toString
@AllArgsConstructor //全参构造器
@NoArgsConstructor  //无参构造器*/
public class Car {
    private Integer id;
    private String name;
    private double price;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:dd",timezone = "GMT+8")
    private Date createTime;

    public Car(Integer id, String name, double price, Date createTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createTime = createTime;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                '}';
    }
}

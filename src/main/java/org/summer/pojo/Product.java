package org.summer.pojo;

import java.util.Date;
import java.util.List;

public class Product {

    private String name;

    /**
     * 生产日期
     */
    private Date createtime;

    private String address;

    private List<Consumer> consumerList;

    /**
     * 保质期
     */
    private Integer days;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Consumer> getConsumerList() {
        return consumerList;
    }

    public void setConsumerList(List<Consumer> consumerList) {
        this.consumerList = consumerList;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", createtime=" + createtime +
                ", address='" + address + '\'' +
                ", consumerList=" + consumerList +
                ", days=" + days +
                '}';
    }
}

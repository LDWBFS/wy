package com.example.wy.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Count implements Serializable {
    private static final long serialVersionUID = 1L;
    private String most;
    private int count;
    private String phone;

    @Override
    public String toString() {
        return "Count{" +
                "most='" + most + '\'' +
                ", count=" + count +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMost() {
        return most;
    }

    public void setMost(String most) {
        this.most = most;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

}

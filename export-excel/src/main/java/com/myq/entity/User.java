package com.myq.entity;

import com.alibaba.excel.annotation.ExcelProperty;

import java.io.Serializable;

/**
 * @Descriptions user
 * @Author myq
 * @Date 2020-03-31 17:19
 * @Other
 */
public class User implements Serializable {

    // ExcelProperty注释，指定保存到excel时的表头文字
    @ExcelProperty("id")
    private Integer id;

    @ExcelProperty("password")
    private String password;

    @ExcelProperty("name")
    private String name;

    public User() {
    }

    public User(Integer id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User withId(Integer id){
        this.setId(id);
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User withName(String name) {
        this.setName(name);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", id=").append(id);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        return sb.toString();
    }
}

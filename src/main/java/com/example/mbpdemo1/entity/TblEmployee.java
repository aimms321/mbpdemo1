package com.example.mbpdemo1.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (TblEmployee)表实体类
 *
 * @author makejava
 * @since 2018-08-03 01:34:00
 */
@SuppressWarnings("serial")
public class TblEmployee extends Model<TblEmployee> {
    //主键，自增
    private Integer id;
    //名字
    private String lastName;
    //email
    private String email;
    //性别1-男0-女
    private Byte gender;
    //年龄
    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }
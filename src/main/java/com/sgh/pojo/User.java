package com.sgh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {


    private int id;
    private String name;
    private String sex;
    private int age;

    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }



}

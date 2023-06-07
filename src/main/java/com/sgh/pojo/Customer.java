package com.sgh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int cid;           //用户编号
    private String cname;      //用户姓名
    private String ctel;       //用户联系方式
    private String chome;      //用户地址

    public Customer(String cname, String ctel, String chome) {
        this.cname = cname;
        this.ctel = ctel;
        this.chome = chome;
    }
}

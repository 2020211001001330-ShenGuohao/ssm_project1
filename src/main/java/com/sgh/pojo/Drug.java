package com.sgh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drug {


    private int did;
    private String dname;
    private int dsum;
    private int dprice;

    private int wid;

    public Drug(String dname, int dsum, int dprice, int wid) {
        this.dname = dname;
        this.dsum = dsum;
        this.dprice = dprice;
        this.wid = wid;
    }
}

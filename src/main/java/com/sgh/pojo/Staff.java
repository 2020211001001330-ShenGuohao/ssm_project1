package com.sgh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

    private int sid;
    private String sname;
    private String ssex;
    private int sage;
    private String sedu;
    private String wid;


    public Staff(String sname, String ssex, int sage, String sedu, String wid) {
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
        this.sedu = sedu;
        this.wid = wid;
    }

}

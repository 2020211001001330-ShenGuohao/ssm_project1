package com.sgh.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private int oid;
    private int did;
    private int cid;
    private int osum;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date oDate;


}

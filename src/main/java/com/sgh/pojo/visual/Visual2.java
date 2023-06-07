package com.sgh.pojo.visual;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Visual2 {
    private String wid;  //仓库编号
    private double salesum ; //仓库销售总数
    private double saleprice; //仓库销售总额
    private double surplus;   //仓库剩余总数
}

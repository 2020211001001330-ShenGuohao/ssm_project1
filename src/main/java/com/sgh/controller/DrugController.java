package com.sgh.controller;


import com.sgh.pojo.Customer;
import com.sgh.pojo.Drug;
import com.sgh.service.impl.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DrugController {

    @Autowired
    private DrugService drugService;


    //查询所有药品信息
    @RequestMapping("/drugList")
    public String showAllDrug(HttpServletRequest request){

        List<Drug> drugList = drugService.queryAllDrug();

        request.setAttribute("drugList",drugList);
        request.setAttribute("num",drugList.size());
        return "drugList";
    }

    //根据客户名字，进行模糊查询
    @PostMapping("/queryDrug.action")
    public String queryDrugByNameAndWid(String queryName1,String queryName2,HttpServletRequest request){
        String DrugName='%'+queryName1+'%';  //药品名称
        String WarehouseWid=queryName2;      //仓库编号

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("dname",'%'+queryName1+'%');
        map.put("wid",queryName2);

//        System.out.println(map);
        if(map.get("wid")==""){
            map.put("wid",null);
        }else{
            System.out.println("wid为空");
        }

        List<Drug> drugByNameAndWid = drugService.getDrugByNameAndWid(map);


        System.out.println(drugByNameAndWid);

        request.setAttribute("drugList",drugByNameAndWid);
        request.setAttribute("num",drugByNameAndWid.size());
        request.setAttribute("queryName1",queryName1);
        request.setAttribute("queryName2",queryName2);

        return "drugList";

    }



    //添加药品
    @PostMapping("/addDrug.action")
    public String addDrug(Drug drug){
        drugService.insertDrug(drug);
        return "redirect:/drugList";
    }


    //删除药品
    @ResponseBody
    @RequestMapping("/deleteDrug.action")
    public int deleteDrugById(int did){
        return drugService.deleteDrugById(did);
    }



    //返回更新之前的客户信息 使用ajax传回前端
    @ResponseBody
    @RequestMapping("/getDrugById")
    public Drug get(int did){
        return  drugService.getDrugById(did);
    }

    @PostMapping("/updateDrug.action")
    public String updateUser(Drug drug){
        drugService.updateDrug(drug);
        return "redirect:/drugList";
    }




}

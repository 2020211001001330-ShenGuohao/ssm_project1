package com.sgh.controller;


import com.sgh.pojo.Customer;
import com.sgh.pojo.Staff;
import com.sgh.service.impl.StaffService;
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
public class StaffController {


    @Autowired
    private StaffService staffService;

    //查询所有客户
    @RequestMapping("/staffList")
    public String showAllStaff(HttpServletRequest request){

        List<Staff> staffList = staffService.queryAllStaff();
        request.setAttribute("staffList",staffList);
        request.setAttribute("num",staffList.size());
        return "staffList";
    }

    //根据员工名字，进行模糊查询
    @PostMapping("/queryStaff.action")
    public String queryStaffByName(String queryName1,String queryName2,HttpServletRequest request){
        String StaffName='%'+queryName1+'%';  //员工名称
        String WarehouseWid=queryName2;      //仓库编号

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sname",'%'+queryName1+'%');
        map.put("wid",queryName2);

//        System.out.println(map);
        if(map.get("wid")==""){
            map.put("wid",null);
        }else{
//            System.out.println("wid为空");
        }


        List<Staff> staffByName = staffService.getStaffByNameAndWid(map);
        request.setAttribute("staffList",staffByName);
        request.setAttribute("num",staffByName.size());
        request.setAttribute("queryName1",queryName1);
        request.setAttribute("queryName2",queryName2);
        return "staffList";
    }

    //删除员工
    @ResponseBody
    @RequestMapping("/deleteStaff.action")
    public int deleteStaffById(int sid){
        return staffService.deleteStaffById(sid);
    }

    //添加员工
    @PostMapping("/addStaff.action")
    public String addStaff(Staff staff){
//        System.out.println(staff);
        staffService.insertStaff(staff);
        return "redirect:/staffList";
    }


    @ResponseBody
    @RequestMapping("/getStaffById")
    public Staff get(int sid){
        return  staffService.getStaffById(sid);
    }

    @PostMapping("/updateStaff.action")
    public String updateStaff(Staff staff){
        staffService.updateStaff(staff);
        return "redirect:/staffList";
    }

}

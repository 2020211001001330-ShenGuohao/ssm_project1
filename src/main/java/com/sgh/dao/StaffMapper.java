package com.sgh.dao;


import com.sgh.pojo.Customer;
import com.sgh.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StaffMapper {

    List<Staff> queryAllStaff();

    Staff getStaffById(int sid);
    List<Staff>getStaffByNameAndWid(Map<String,Object> map);

    int deleteStaffById(int sid);
    int insertStaff(Staff staff);
    int updateStaff(Staff staff);

}

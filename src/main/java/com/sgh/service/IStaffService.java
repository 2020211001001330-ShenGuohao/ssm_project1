package com.sgh.service;

import com.sgh.pojo.Staff;

import java.util.List;
import java.util.Map;

public interface IStaffService {
    List<Staff> queryAllStaff();

    Staff getStaffById(int sid);
    List<Staff>getStaffByNameAndWid(Map<String,Object> map);

    int deleteStaffById(int sid);
    int insertStaff(Staff staff);
    int updateStaff(Staff staff);
}

package com.sgh.service.impl;


import com.sgh.dao.StaffMapper;
import com.sgh.pojo.Staff;
import com.sgh.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffService implements IStaffService {


    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> queryAllStaff() {
        return staffMapper.queryAllStaff();
    }

    @Override
    public Staff getStaffById(int sid) {
        return staffMapper.getStaffById(sid);
    }

    @Override
    public List<Staff> getStaffByNameAndWid(Map<String, Object> map) {
        return staffMapper.getStaffByNameAndWid(map);
    }

    @Override
    public int deleteStaffById(int sid) {
        return staffMapper.deleteStaffById(sid);
    }

    @Override
    public int insertStaff(Staff staff) {
        return staffMapper.insertStaff(staff);
    }

    @Override
    public int updateStaff(Staff staff) {
        return staffMapper.updateStaff(staff);
    }
}

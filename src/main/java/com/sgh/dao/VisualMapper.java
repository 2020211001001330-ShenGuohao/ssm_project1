package com.sgh.dao;

import com.sgh.pojo.visual.Visual;
import com.sgh.pojo.visual.Visual2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VisualMapper {


    List<Visual> getData1();   //获取上面第一张柱形图        客户消费统计数据
    List<Visual> getData2();   //获取上面第二张图饼形图数据   各仓库销售额数据
    List<Visual2> getData3();  //获取上面第三张图数据        各仓库的销售总量，销售总额，剩余总量数据

    List<Visual> getData4();   //获取下面面第一张饼状图数据   员工学历分布占比

    List<Visual> getData5();   //获取下面面第二张词云图数据   各药品被购买次数的频度

    List<Visual> getData6();   //获取下面面第三柱形图数据   各仓库人员数目
}

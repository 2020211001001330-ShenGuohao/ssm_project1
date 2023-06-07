package com.sgh.controller;


import com.sgh.dao.VisualMapper;
import com.sgh.pojo.visual.Visual;
import com.sgh.pojo.visual.Visual2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class VisualizationController {

    @Autowired
    private VisualMapper visualMapper;

    @RequestMapping("/visualization")
    public String visual(){

        return "visualization";
    }

    @ResponseBody
    @RequestMapping("/getData1")
    public HashMap<Object, Object> getData1(){

        List<String>name=new ArrayList<>();

        List<Double>value=new ArrayList<>();
        for (Visual visual : visualMapper.getData1()) {
             name.add(visual.getName());
             value.add(visual.getValue());
        }

        HashMap<Object, Object> data = new HashMap<>();
        data.put("name",name);
        data.put("consumptionvalue",value);

        return data;
    }

    @ResponseBody
    @RequestMapping("/getData2")
    public List<Visual>getData2(){
        return visualMapper.getData2();
    }



    @ResponseBody
    @RequestMapping("/getData3")
    public HashMap<Object, Object>getData3(){

        List<String>name=new ArrayList<>();  //存储仓库名称

        List<Double>salesum = new ArrayList<>();
        List<Double>saleprice = new ArrayList<>();
        List<Double>surplus = new ArrayList<>();

        HashMap<Object, Object> data = new HashMap<>();

        for (Visual2 visual2 : visualMapper.getData3()) {
                name.add(visual2.getWid());
                salesum.add(visual2.getSalesum());
                saleprice.add(visual2.getSaleprice());
                surplus.add(visual2.getSurplus());
        }
        data.put("name",name);
        data.put("salesum",salesum);
        data.put("saleprice",saleprice);
        data.put("surplus",surplus);

        return data;
    }


    @ResponseBody
    @RequestMapping("/getData4")
    public List<Visual>getData4() {

        return visualMapper.getData4();
    }


    @ResponseBody
    @RequestMapping("getData5")
    public List<Visual>getData5(){

        List<Visual> visuals = visualMapper.getData5();
        return visuals;
    }
    @ResponseBody
    @RequestMapping("getData6")
    public HashMap<Object, Object>getData6(){

        List<Visual> visuals = visualMapper.getData6();

        List<String>name=new ArrayList<>();

        List<Double>value=new ArrayList<>();

        for (Visual visual : visuals) {
            name.add(visual.getName());
            value.add(visual.getValue());
        }
        HashMap<Object, Object> data = new HashMap<>();
        data.put("name",name);
        data.put("value",value);

        return data;
    }

}

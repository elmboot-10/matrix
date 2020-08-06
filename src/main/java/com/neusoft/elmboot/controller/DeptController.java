package com.neusoft.elmboot.controller;
import com.neusoft.elmboot.po.Department;
import com.neusoft.elmboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/list")
    public List<Department> getDepartmentList(){
        return deptService.selectDeptList();
    }
}
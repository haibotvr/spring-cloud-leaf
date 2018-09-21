package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.Dept;
import com.simon.cloud.leaf.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

    @GetMapping("/dept/del/{id}")
    public boolean del(@PathVariable("id") Long id) {
        return deptService.del(id);
    }

}

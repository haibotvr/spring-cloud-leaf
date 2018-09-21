package com.simon.cloud.leaf.provider.service;

import com.simon.cloud.leaf.api.entity.Dept;

import java.util.List;

public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();

    boolean del(Long id);

}

package com.simon.cloud.leaf.provider.dao;

import com.simon.cloud.leaf.api.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();

}

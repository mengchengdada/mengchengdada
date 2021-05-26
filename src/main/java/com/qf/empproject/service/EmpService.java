package com.qf.empproject.service;

import com.qf.empproject.entity.Emp;
import com.qf.empproject.entity.Page;

import java.util.List;

public interface EmpService {
    List<Emp> selectAll();
    Integer deleteByid(Integer id);
    List<Emp>  selectAll(Page page);
    Integer UpdateByEmp(Emp emp);
    Emp  SelectByid(Integer id);
}

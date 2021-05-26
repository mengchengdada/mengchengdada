package com.qf.empproject.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.empproject.dao.EmpDao;
import com.qf.empproject.entity.Emp;
import com.qf.empproject.entity.Page;
import com.qf.empproject.service.EmpService;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> selectAll() {


        List<Emp> emps = empDao.selectAll();
        return emps;
    }

    public Integer deleteByid(Integer id){
        Integer integer = empDao.deleteById(id);
        return  integer;
    }

    @Override
    public List<Emp> selectAll(Page page) {
        Integer integer = empDao.selectCount();
        page.setTotalCount(integer);
        List<Emp> emps = empDao.selectByPage(page);
        return emps;
    }

    @Override
    public Integer UpdateByEmp(Emp emp) {
         Integer integer=null;
        Integer integer1 = empDao.UpdateByEmp(emp);
        integer=integer1;

        return  integer;
    }

    @Override
    public Emp SelectByid(Integer id) {

        Emp emp = empDao.selectById(id);

        return emp;
    }
}

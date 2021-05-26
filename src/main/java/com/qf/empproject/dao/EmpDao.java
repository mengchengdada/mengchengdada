package com.qf.empproject.dao;

import com.qf.empproject.entity.Emp;
import com.qf.empproject.entity.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDao {
    List<Emp> selectAll();
    Integer deleteById(@Param("id") Integer id);
    List<Emp> selectByPage(@Param("page") Page page);
    Integer selectCount();
    Integer UpdateByEmp(@Param("emp") Emp emp);
     Emp  selectById(@Param("id") Integer id);

}

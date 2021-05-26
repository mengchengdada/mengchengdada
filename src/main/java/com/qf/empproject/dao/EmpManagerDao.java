package com.qf.empproject.dao;

import com.qf.empproject.entity.EmpManager;
import org.apache.ibatis.annotations.Param;

public interface EmpManagerDao {
    EmpManager  selcetByusername(@Param("username") String username);

}

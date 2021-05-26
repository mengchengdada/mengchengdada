package com.qf.empproject.service;


import com.qf.empproject.entity.EmpManager;


public interface EmpManagerService {

    EmpManager login(String username, String password);
}

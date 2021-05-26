package com.qf.empproject.service.impl;

import com.qf.empproject.dao.EmpManagerDao;
import com.qf.empproject.entity.EmpManager;
import com.qf.empproject.service.EmpManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpManagerServiceImpl implements EmpManagerService {

    @Autowired
    private EmpManagerDao empManagerDao;
    @Override
    public EmpManager login(String username, String password) {
        EmpManager manager=null;
        EmpManager empManager = empManagerDao.selcetByusername(username);
        if(empManager!=null){
           if (empManager.getPassword().equals(password)){
               manager=empManager;
           }
        }
        return manager;
    }
}

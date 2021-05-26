package com.qf.empproject.dao;

import com.qf.empproject.EmpprojectApplicationTests;
import com.qf.empproject.entity.Emp;
import com.qf.empproject.entity.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpDaoTest extends EmpprojectApplicationTests {
    @Autowired
    private EmpDao empDao;
        @Test
    public void ShowAll(){
        empDao.deleteById(1);
         }


     @Test
   public void select(){
            Page page=new Page(2);
         List<Emp> emps = empDao.selectByPage(page);
         for (Emp emp : emps) {
             System.out.println(emp);
         }
     }
     @Test
    public void test(){
         Integer integer = empDao.selectCount();
         System.out.println(integer);
     }
     @Test
    public void test1(){
           Emp emp=new Emp();
           emp.setName("alice");
           emp.setSalary(BigDecimal.valueOf(6000));
           emp.setAge(20);
           emp.setId(1);
           empDao.UpdateByEmp(emp);
     }
     @Test
    public void  test3(){
         Emp emp = empDao.selectById(12);
         System.out.println(emp);
     }

     @Test
    public  void test4(){
            String s ="123456";
         System.out.println(s.substring(0,3));
     }
}

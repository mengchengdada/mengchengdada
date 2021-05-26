package com.qf.empproject.controller;

import com.qf.empproject.entity.Emp;
import com.qf.empproject.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet(name = "UpdateEmpController",value = "/manager/safe/UpdateEmp")
public class UpdateEmpController extends HttpServlet {
    @Autowired
    private EmpService empService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Double salary1 = Double.valueOf(request.getParameter("salary"));
        BigDecimal  salary = BigDecimal.valueOf( salary1);
        Integer age =Integer.valueOf(request.getParameter("age"));
        Integer id = Integer.valueOf(request.getParameter("id"));
        Emp emp=new Emp(id,name,salary,age);
        empService.UpdateByEmp(emp);
        response.sendRedirect(request.getContextPath()+"/manager/safe/ShowAllEmp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}

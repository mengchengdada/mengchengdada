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

@WebServlet(name = "SelectOneEmpController" ,value = "/manager/safe/SelectOneEmp")
public class SelectOneEmpController extends HttpServlet {
    @Autowired
    private EmpService empService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //1 収参
        Integer id = Integer.valueOf(request.getParameter("id"));

        Emp emp = empService.SelectByid(id);

        request.setAttribute("emp",emp);

        request.getRequestDispatcher("/manager/safe/UpdateEmp.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}

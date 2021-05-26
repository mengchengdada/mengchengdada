package com.qf.empproject.controller;

import com.qf.empproject.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/manager/safe/removeEmpController")
public class RemoveEmpController extends HttpServlet {
    @Autowired
    private EmpService empService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        empService.deleteByid(id);

        resp.sendRedirect("/empproject/manager/safe/ShowAllEmp");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doPost(req,resp);
    }
}

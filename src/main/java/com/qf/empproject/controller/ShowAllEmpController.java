package com.qf.empproject.controller;

import com.qf.empproject.entity.Emp;
import com.qf.empproject.entity.Page;
import com.qf.empproject.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(value = "/manager/safe/ShowAllEmp")
public class ShowAllEmpController extends HttpServlet {
    @Autowired
    private EmpService empService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageIndex = req.getParameter("PageIndex");
         if (pageIndex==null){
             pageIndex="1";
         }

        Page page=new Page(Integer.valueOf(pageIndex));

        List<Emp> emps = empService.selectAll(page);

         req.setAttribute("emps",emps);
         req.setAttribute("page",page);
        req.getRequestDispatcher("/manager/safe/ShowAllEmp.jsp").forward(req,resp);

    }
}

package com.qf.empproject.controller;

import com.qf.empproject.entity.EmpManager;
import com.qf.empproject.service.EmpManagerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet(value = "/manager/EmpManagerController")
public class EmpManagerController extends HttpServlet {
    @Autowired
    private EmpManagerService empManagerService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String validatecode = req.getParameter("validatecode");

        if (validatecode!=null
                &&validatecode.equalsIgnoreCase((String) req.getSession().getAttribute("codes"))){
            EmpManager empManager = empManagerService.login(username, password);
            if (empManager!=null){
                HttpSession session = req.getSession();
                session.setAttribute("empManager",empManager);
                resp.sendRedirect(req.getContextPath()+"/manager/safe/ShowAllEmp");
            }
            else {
                resp.sendRedirect(req.getContextPath()+"/login.html");
            }

        }
        else {
            resp.sendRedirect(req.getContextPath()+"/login.html");
        }
    }
}


package com.qf.empproject.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import cn.dsna.util.images.ValidateCode;

@WebServlet(value = "/validatecode")
public class ValidatecodeController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     ValidateCode validateCode=new ValidateCode(200,30,4,30);
        HttpSession session = req.getSession();
        session.setAttribute("codes",validateCode.getCode());
        validateCode.write(resp.getOutputStream());

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}

package com.qf.empproject.controller;

import com.qf.empproject.entity.Emp;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet(value = "/manager/safe/ShowAllEmpJSP")
public class ShowAllEmpJSP extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Emp> emps =(List<Emp>) req.getAttribute("emps");
        if (emps!=null) {
            PrintWriter writer = resp.getWriter();
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta charset='utf-8'>");
            writer.println("<title>所有员工信息表</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<table border='1'>");
            writer.println("<tr>");
            writer.println("<td>工号</td>");
            writer.println("<td>姓名</td>");
            writer.println("<td>薪水</td>");
            writer.println("<td>年龄</td>");
            writer.println("<td colspan='2'>操作</td>");
            writer.println("</tr>");
            for (Emp emp : emps) {
                writer.println("<tr>");
                writer.println("<td>"+emp.getId()+"</td>");
                writer.println("<td>"+emp.getName()+"</td>");
                writer.println("<td>"+emp.getSalary()+"</td>");
                writer.println("<td>"+emp.getAge()+"</td>");
                writer.println("<td>增加</td>");
                writer.println("<td><a href='"+req.getContextPath()+"/manager/safe/removeEmpController?id="+emp.getId()+"'>删除</a></td>");
                writer.println("</tr>");
            }
            writer.println("</table>");
            writer.println("</body>");

            writer.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}

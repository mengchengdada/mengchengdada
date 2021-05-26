package com.qf.empproject.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(value = "/manager/*")
public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       servletRequest.setCharacterEncoding("UTF-8");
       servletResponse.setContentType("text/html;charset=utf-8");
       filterChain.doFilter(servletRequest,servletResponse);

    }
}

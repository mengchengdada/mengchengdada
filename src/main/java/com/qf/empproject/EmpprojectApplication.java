package com.qf.empproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.qf.empproject.controller","com.qf.empproject.filter"})
@MapperScan(basePackages = "com.qf.empproject.dao")

public class EmpprojectApplication  {


    public static void main(String[] args) {
        SpringApplication.run(EmpprojectApplication.class, args);
    }

}

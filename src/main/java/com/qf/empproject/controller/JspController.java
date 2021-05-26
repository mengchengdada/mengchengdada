package com.qf.empproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

    @GetMapping(value = "/first")
    public String first(){
        return "first";
    }
}

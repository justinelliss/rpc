package com.rpc.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by developer on 1/16/2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String home(){
        return "welcome";
    }


    @RequestMapping(value="/dashboard")
    public String dashboard(){
        return "dashboard";
    }
}

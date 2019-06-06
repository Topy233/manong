package com.manong.protal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Topy
 * @Date: 2019/6/3 20:19
 */
@Controller
public class IndexControler {

    @RequestMapping("home.html")
    public String index(){
        return "index";
    }


}

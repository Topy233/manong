package com.manong.protal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Topy
 * @Date: 2019/5/19 17:46
 */
@Controller
public class FreemarkTest {
    @RequestMapping("/hello")
    public String sayHello(Model model){

        model.addAttribute("name","wistbean");
        return "hello";

    }

    @RequestMapping("/hi")
    public String sayHi(Model model){

        model.addAttribute("name","wistbean");
        return "hi";

    }
}

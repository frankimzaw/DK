package com.dj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/8/1.
 */
@Controller
public class MainController {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}

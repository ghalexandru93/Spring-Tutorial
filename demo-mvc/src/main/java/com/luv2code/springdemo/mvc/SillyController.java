package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Myriad 72 on 9/25/2016.
 */
@Controller
public class SillyController {

    @RequestMapping("/showForm")
    public String displayTheForm(){
        return "silly";
    }
}

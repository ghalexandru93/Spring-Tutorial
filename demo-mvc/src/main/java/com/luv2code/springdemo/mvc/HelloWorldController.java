package com.luv2code.springdemo.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.lang.String;

/**
 * Created with IntelliJ IDEA.
 * User: Myriad
 * Date: 9/22/16
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //  need a controller method to show the intial html form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //  need a controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    //  add a controler method to read from data and
    //  add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        //  read the request paramater form the HTML
        String theName = request.getParameter("studentName");

        //  convert the data to all caps
        theName = theName.toUpperCase();

        //  create the message
        String result = "Yo! " + theName;

        //  add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutDude(@RequestParam("studentName") String theName, Model model) {

        //  convert the data to all caps
        theName = theName.toUpperCase();

        //  create the message
        String result = "Hey My Friend from v3 " + theName;

        //  add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}

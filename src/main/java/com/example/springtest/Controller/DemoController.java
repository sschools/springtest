package com.example.springtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

}

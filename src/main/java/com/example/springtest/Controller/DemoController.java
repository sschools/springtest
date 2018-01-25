package com.example.springtest.Controller;

import com.example.springtest.Model.Sample;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/results", method = RequestMethod.GET)
    public String resultPage() {

        return "results";
    }

    @RequestMapping(path = "/index", method = RequestMethod.POST)
    public String results(@RequestParam(value="num1") int num1, @RequestParam(value="num2") int num2, Model model) {
        Sample sample = new Sample();
        sample.setValue1(num1);
        sample.setValue2(num2);
        model.addAttribute("sample", sample);
        return "results";
    }
}

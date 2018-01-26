package com.example.springtest.Controller;

import com.example.springtest.Model.Calcs;
import com.example.springtest.Model.Sample;
import com.example.springtest.Model.SetVals;
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
        SetVals setVals = new SetVals();
        Sample sample1 = setVals.res(num1);
        Sample sample2 = setVals.res(num2);
        model.addAttribute("sample1", sample1);
        model.addAttribute("sample2", sample2);
        return "results";
    }
}

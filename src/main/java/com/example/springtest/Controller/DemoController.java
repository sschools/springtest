package com.example.springtest.Controller;

import com.example.springtest.Model.Calcs;
import com.example.springtest.Model.FindAbun;
import com.example.springtest.Model.Sample;
import com.example.springtest.Model.SetVals;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

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
        FindAbun findAbun = new FindAbun();
        List<Integer> res;
        List<int[]> amic;
        res = findAbun.abunList(num1, num2);
        amic = findAbun.amicable(res);
        model.addAttribute("amic", amic);
        return "results";
    }
}

package com.example.springtest.Model;

public class SetVals {
    public Sample res(int num) {
        Calcs calcs = new Calcs();
        Sample temp = new Sample();
        temp.setValue(num);
        temp.setDivsProp(calcs.divs(num));
        temp.setSumDivs(calcs.divTotal(temp.getDivsProp()));
        temp.setNumType(calcs.type(num, temp.getSumDivs()));
        return temp;
    }
}

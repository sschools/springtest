package com.example.springtest.Model;

public class SetVals {
    public Sample res(int num) {
        Calcs calcs = new Calcs();
        Sample temp = new Sample();
        temp.setValue(num);
        temp.setS(calcs.sq(num));
        temp.setDivsProp(calcs.divs(num));
        temp.setNumType(calcs.type(num, temp.getDivsProp()));
        return temp;
    }
}

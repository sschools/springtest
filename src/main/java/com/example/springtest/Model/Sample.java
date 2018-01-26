package com.example.springtest.Model;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    private int value;
    private List<Integer> divsProp = new ArrayList<>();
    private int sumDivs;
    private String numType;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getDivsProp() {
        return divsProp;
    }

    public void setDivsProp(List<Integer> divsProp) {
        this.divsProp = divsProp;
    }

    public int getSumDivs() {
        return sumDivs;
    }

    public void setSumDivs(int sumDivs) {
        this.sumDivs = sumDivs;
    }

    public String getNumType() {
        return numType;
    }

    public void setNumType(String numType) {
        this.numType = numType;
    }
}

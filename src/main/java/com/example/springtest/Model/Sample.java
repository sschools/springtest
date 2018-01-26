package com.example.springtest.Model;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    private int value;
    private int s;
    private List<Integer> divsProp = new ArrayList<>();
    private String numType;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public List<Integer> getDivsProp() {
        return divsProp;
    }

    public void setDivsProp(List<Integer> divsProp) {
        this.divsProp = divsProp;
    }

    public String getNumType() {
        return numType;
    }

    public void setNumType(String numType) {
        this.numType = numType;
    }
}

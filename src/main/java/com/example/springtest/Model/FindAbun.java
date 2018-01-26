package com.example.springtest.Model;

import java.util.ArrayList;
import java.util.List;

public class FindAbun {

    public List<Integer> abunList(int b, int e) {
        SetVals setVals = new SetVals();
        List<Integer> tempList = new ArrayList<>();
        for (int i = b; i <= e; i++) {
            Sample temp = setVals.res(i);
            if (temp.getNumType().equals("Abundant")) {
                tempList.add(i);
            }
        }
        return tempList;
    }

    public List<int[]> amicable(List<Integer> abun) {
        List<int[]> res = new ArrayList<>();
        SetVals setVals = new SetVals();
        for (int i = 0; i < abun.size(); i++) {
            int current = abun.get(i);
            int[] tempAr = new int[2];
            Sample temp = setVals.res(current);
            Sample look = setVals.res(temp.getSumDivs());
            if (look.getSumDivs() == current) {
                tempAr[0] = current;
                tempAr[1] = look.getValue();
                res.add(tempAr);
            }
        }
        return res;
    }

}

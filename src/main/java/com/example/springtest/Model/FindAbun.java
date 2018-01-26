package com.example.springtest.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    public int g(int[] pair) {
        SetVals setVals = new SetVals();
        Sample one = setVals.res(pair[0]);
        Sample two = setVals.res(pair[1]);
        List<Integer> results = new ArrayList<>();
        List<Integer> oneList = one.getDivsProp();
        List<Integer> twoList = two.getDivsProp();
        for (int i = 0; i < oneList.size(); i++) {
            for (int j = 0; j < twoList.size(); j++) {
                if (oneList.get(i) == twoList.get(j)) {
                    results.add(oneList.get(i));
                }
            }
        }
        int temp = results.get(results.size() - 1);
        return temp;
    }

}

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
            int[] tempAr = new int[6];
            Sample temp = setVals.res(current);
            Sample look = setVals.res(temp.getSumDivs());
            if (look.getSumDivs() == current) {
                tempAr[0] = current;
                tempAr[1] = look.getValue();
                tempAr[2] = g(tempAr[0], tempAr[1]);
                tempAr[3] = tempAr[0]/tempAr[2];
                tempAr[4] = tempAr[1]/tempAr[2];
                res.add(tempAr);
                if (g(tempAr[2], tempAr[3]) == 1 && g(tempAr[2], tempAr[4]) == 1) {
                    tempAr[5] = 0;
                } else {
                    tempAr[5] = 1;
                }
            }
        }
        return res;
    }

    public int g(int first, int second) {
        SetVals setVals = new SetVals();
        Sample one = setVals.res(first);
        Sample two = setVals.res(second);
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

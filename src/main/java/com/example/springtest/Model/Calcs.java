package com.example.springtest.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calcs {

    public List<Integer> divs(int num) {
        List<Integer> divsList = new ArrayList<>();
        double sr = Math.sqrt((double) num);
        for (int i = 1; i <= sr; i++) {
            if (num % i == 0) {
                divsList.add(i);
                if (i > 1 && (num / i) > sr) {
                    divsList.add(num / i);
                }
            }
        }
        int n = divsList.size();
        int[] divAr = new int[n];
        for (int i = 0; i < n; i++) {
            divAr[i] = divsList.get(i);
        }
        Arrays.sort(divAr);
        divsList = new ArrayList<>();
        for (int i = 0; i < divAr.length; i++) {
            divsList.add(divAr[i]);
        }
        return divsList;
    }

    public int divTotal(List<Integer> divs) {
        int total = 0;
        for (int i = 0; i < divs.size(); i++) {
            total += divs.get(i);
        }
        return total;
    }

    public String type(int num, int total) {
        String res;
        if (total > num) {
            res = "Abundant";
        } else if (total < num) {
            res = "Deficient";
        } else {
            res = "Perfect";
        }
        return res;
    }
}

package com.mcheungsen.Problems;

import com.mcheungsen.EulerProblem;

public class Problem1 implements EulerProblem {
    /**
     * If we list all the natural numbers below 10 that are multiples of
     * 3 or 5, we get 3,5,6 and 9.
     * The sum of these multiples is 23.
     *
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */


    @Override
    public int solve() {
        int res = 0;
        for(int i = 0; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0) res+=  i;
        }

        return res;
    }

    @Override
    public String getName() {
        return "Multiples of 3 or 5";
    }
}

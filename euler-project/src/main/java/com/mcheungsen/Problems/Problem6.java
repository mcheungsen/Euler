package com.mcheungsen.Problems;

import com.mcheungsen.EulerProblem;

public class Problem6 implements EulerProblem {
    @Override
    public int solve() {
        int n = 100;
        System.out.println("sum of square " + getSumOfSquare(n));
        System.out.println("Square of sum " + getSquareOfSum(n));
        return getSumOfSquare(n) - getSquareOfSum(n);
    }

    private int getSumOfSquare(int i) {
        return (i * (i + 1) * (2 * i + 1)) / 6;
    }

    private int getSquareOfSum(int i) {
        int sum = (i * (i + 1)) / 2;
        return sum * sum;
    }


    @Override
    public String getName() {
        return "Sum Square Difference";
    }
}

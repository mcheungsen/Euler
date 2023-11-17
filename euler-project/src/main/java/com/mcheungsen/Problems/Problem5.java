package com.mcheungsen.Problems;

import com.mcheungsen.EulerProblem;

public class Problem5 implements EulerProblem {
    @Override
    public int solve() {
        int res = 2520;
        while(!isDivisible(res)){
            res += 20;
        }
        return res;
    }

    public boolean isDivisible(int n){
        for(int i = 1; i <= 20; i++){
            if(n%i != 0){
                return false;
            }
        }
        return true;
    }
    @Override
    public String getName() {
        return "Smallest multiple";
    }
}

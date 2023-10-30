package com.mcheungsen.Problems;

import com.mcheungsen.EulerProblem;

import java.math.BigInteger;

public class Problem3 implements EulerProblem {
    @Override
    // 600851475143
    public int solve() {
        BigInteger numberToSolve = new BigInteger("600851475143");

        int limit = numberToSolve.sqrt().intValue();

        int max = 0;
        //Commencer par 3 jusqu'à la racine carré => garder le max si reste == 0
        for(int i = 2; i <= limit ; i = i+1){
            if(isPrimeFactor(i)){
                while(numberToSolve.mod(BigInteger.valueOf(i)).intValue() == 0) {
                    max = i;
                    numberToSolve = numberToSolve.divide(BigInteger.valueOf(i));
                }
            }

        }
        return max;
    }

    private boolean isPrimeFactor(int i) {
        if(i <= 3){
            return true;
        }
        if(i%2 == 0 || i % 3 == 0){
            return false;
        }

        for (int j = 5; j * j <= i; j += 6) {
            if (i % j == 0 || i % (j + 2) == 0) {
                return false; // Vérifie les multiples de 6 ± 1
            }
        }

        return true;
    }

    @Override
    public String getName() {
        return "Largest Prime Factor";
    }
}

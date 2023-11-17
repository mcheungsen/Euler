package com.mcheungsen.Problems;

import com.mcheungsen.EulerProblem;

import java.util.ArrayList;

public class Problem7 implements EulerProblem {
    @Override
    public int solve() {
        ArrayList<Integer> primes = new ArrayList<>();
        int n = 10001;

        boolean[] isPrime = new boolean[n*n];
        for(int i = 0; i< isPrime.length;i++){
            isPrime[i] = true; // Chaque nombre est initialement "premier" avant l'analyse => Crible d'Erasthosthène
        }

        for ( int i = 2; i < isPrime.length && n > primes.size(); i++){
            // Si premier, alors on s'en sert, et l'ajoute à la liste des premiers
            if(isPrime[i]){
                primes.add(i);

                // Il faut supprimer (false) tous les nombres divisibles par i
                for(int j = i*2; j < isPrime.length; j+= i){
                    isPrime[j] = false;
                }
            }
        }

        return primes.get(10000);
    }

    @Override
    public String getName() {
        return "10 001st prime";
    }
}

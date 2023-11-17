package com.mcheungsen.Problems;

import com.mcheungsen.EulerProblem;

public class Problem4 implements EulerProblem {
    @Override
    public int solve() {
        int res = -1;
        for(int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){
                int product = i*j;
                if(isPalindrome(product) && res < product){
                    res = product;
                }
            }
        }
        return res;
    }

    public boolean isPalindrome(int number){
        String palindrome = Integer.toString(number);
        for(int i = 0; i < palindrome.length()/2; i++){
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-1-i)){
                return false;
            }

        }
        return true;
    }

    @Override
    public String getName() {
        return "Largest palindrome made from the product of two 3-digit numbers";
    }
}

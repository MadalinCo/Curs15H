package org.fasttrackit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InfiniteLoopMain {



    public static Map<Long, Long> fibonacciResult = new HashMap();

    public static int sumOfFirstNumbers(int n){
        if(n==1){
            return 1;
        }
        return n + sumOfFirstNumbers(n-1);
    }
    public static int sumOfFirstEvenInts(int n){
        if(n==1) {
            return 0;
        }
        if(n % 2 != 0) {
            n=n-1;
        }
        return n + sumOfFirstEvenInts(n-1)  ;
    }

    public static int sumOfDigitsForANumber1(int number){

        int  digit, sum = 0;
        while(number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits: " + sum);
        return sum;
    }

    public static int sumOfDigitsForaNumber(int number){
        int  digit, sum = 0;

        while(number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;

    }
    public static long fibonacci(long n){
        if(n == 0 || n == 1){
            return 1;
        }
        if(fibonacciResult.containsKey(n)){
            return fibonacciResult.get(n);
        }
        long result = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciResult.put(n, result);
        return result;

    }

}

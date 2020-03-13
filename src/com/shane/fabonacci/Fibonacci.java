package com.shane.fabonacci;

import java.math.BigDecimal;

public class Fibonacci {
    private static BigDecimal of(int n){
        BigDecimal bigDecimal1 = new BigDecimal(1);
        BigDecimal bigDecimal2 = new BigDecimal(1);
        BigDecimal bigDecimal3 = new BigDecimal(0);
        int i=3;
        while(i<=n){
            bigDecimal3 = bigDecimal1.add(bigDecimal2);
            bigDecimal1 = bigDecimal2;
            bigDecimal2 = bigDecimal3;
            i++;
        }
        return bigDecimal2;
    }

    public static void main(String[] args) {
        for(int i = 1;i <= 200; i++){
            System.out.println("Fabonacci.of("+i+") == "+Fibonacci.of(i));
        }
    }
}


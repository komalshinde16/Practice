package com.itshaala.programs;

public class factorial {
    public static void main(String[] args) {
        int num = 3;
        int fact = 1;
        for ( int i = 1; i<=num ; i++){
            fact = fact *i;
        }
        System.out.println("factorial of a given num is : " + fact);
    }
}

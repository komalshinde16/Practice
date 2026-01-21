package com.itshaala.programs;

public class revstring {
    public static void main(String[] args) {
        String str = "reverse a string ";
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);
    }
}

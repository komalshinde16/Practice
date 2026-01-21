package com.itshaala.programs;

public class sumofarrays {
    public static void main(String[] args) {
        int [] arr = {4,7,5,2,1,5,4,5,1};
        int sum = 0;

        for(int i= 1; i<arr.length; i++){
            sum += arr [i];
        }
        System.out.println(sum);
    }
}

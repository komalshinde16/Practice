package com.itshaala.programs;

public class maxinarray {
    public static void main(String[] args) {
        int [] arr = {8,4,5,2,1,7,8,1,25,4,5};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println("largest element in the array is : " + max);
    }

}

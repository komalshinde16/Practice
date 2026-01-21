package com.itshaala.programs;

public class revarray {
    public static void main(String[] args) {
        int [] arr = {8,1,5,2,4,2,1,4,6};

        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] +" ");
        }
    }
}

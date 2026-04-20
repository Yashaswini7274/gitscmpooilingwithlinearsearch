package com.bnmit;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int key = 3;

        int pos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }

        System.out.println("Position: " + pos);
    }
}
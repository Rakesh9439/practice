package com.practics.Array;

public class calculateSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : array) {
            //sum += num;
            sum = num + sum;
        }
        System.out.println(sum);


    }
}

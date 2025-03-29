package com.practics.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne {
    public static void main(String[] args) {

         List<Integer> numbers = Arrays.asList(10, 15, 23, 1, 91, 123, 19, 17);
        List<Integer> collect = numbers.stream().filter(num -> String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("Numbers starting with 1: " + collect);
    }

}

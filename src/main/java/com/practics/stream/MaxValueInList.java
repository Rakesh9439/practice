package com.practics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValueInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 21, 123, 99, 101, 45, 1, 18);

        // Find the maximum value
        Optional<Integer> maxValue = numbers.stream()
                .max(Integer::compareTo); // Get the maximum value using a comparator

        System.out.println(maxValue);
    }
}

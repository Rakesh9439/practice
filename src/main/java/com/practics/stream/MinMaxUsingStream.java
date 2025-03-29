package com.practics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6, 3);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println("Minimum value: " + min.get());
        }else{
            System.out.println("No minimum value found");
        }
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        if (max.isPresent()) {
            System.out.println("Maximum value: " + max.get());
        } else{
            System.out.println("No maximum value found");
        }
    }
}

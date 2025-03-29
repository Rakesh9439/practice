package com.practics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6, 3);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        if (max.isPresent()) {
            System.out.println("Maximum number: " + max.get());
        } else {
            System.out.println("No maximum number found");
        }



    }

}
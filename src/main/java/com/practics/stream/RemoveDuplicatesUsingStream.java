package com.practics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 5, 6, 2, 1);
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Remove Dublicate Elements : " + collect);

    }
}

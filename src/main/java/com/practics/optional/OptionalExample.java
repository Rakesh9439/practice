package com.practics.optional;

import java.util.Optional;
import java.util.function.Predicate;



public class OptionalExample {
    public static void main(String[] args) {
        //Optional<String> optional = Optional.ofNullable("Hello");
        //System.out.println(optional.get());
        //System.out.println(optional.isPresent());
        //System.out.println(optional.isEmpty());

        //Optional<String> empty = Optional.empty();
        //System.out.println(empty.isPresent());
        //System.out.println(empty.isEmpty());
        //System.out.println(empty.get());
//
//        Optional<String> optional2 = Optional.of("Hello world");
//        System.out.println(optional2.get());
//        System.out.println(optional2.isPresent());
//        System.out.println(optional2.isEmpty());
//
//        Predicate<Integer> isEven = num -> num % 2 == 0;
//        System.out.println(isEven);

        String name = getName(); // this might return null
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName);

        optionalName.ifPresent(System.out::println); // Prints the name if present, does nothing if null

    }

    private static String getName() {
        return null; // Replace with actual implementation of getName() method
    }
}

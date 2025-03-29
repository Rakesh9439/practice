package com.practics.singleton;

public class Example {
    public static void main(String[] args) {
        SingleTonExample singleTonExample1 = SingleTonExample.getSingleTonExample();
        System.out.println("Lazy way of creating a singleton object :" + singleTonExample1.hashCode());

        SingleTonExample singleTonExample2 = SingleTonExample.getSingleTonExample();
        System.out.println("Lazy way of creating a singleton object :" + singleTonExample2.hashCode());

        System.out.println("Eager way of creating singleton object : " + Jalebi.getJalebi().hashCode());
        System.out.println("Eager way of creating singleton object : " + Jalebi.getJalebi().hashCode());
    }
}

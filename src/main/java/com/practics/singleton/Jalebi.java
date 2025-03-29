package com.practics.singleton;

public class Jalebi {


    // Eager way of creating singleton object
    private static Jalebi jalebi=new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }
}

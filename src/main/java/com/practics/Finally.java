package com.practics;

public class Finally {

    public static void main(String[] args) {
        try {
            System.exit(0);
           // return;
        }finally {
            System.out.println("This is finally block");
        }
    }
}

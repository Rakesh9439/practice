package com.practics.Array;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello world";
        char chars[]= str.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--){
            System.out.print(chars[i]);
        }
    }
}

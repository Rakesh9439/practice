package com.practics.Serialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private String name;
    private String email;
    private int age;
    private String address;

    public void displayName(){
        System.out.println("Hi My Name is :" + this.name);
    }
}

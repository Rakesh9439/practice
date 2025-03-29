package com.practics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
 //public class Emp implements Comparable<Emp>{
    public class Emp {
    private String name;
    private String phone;
    private int emailId;


    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", emailId=" + emailId +
                '}';
    }

//    @Override
//    public int compareTo(Emp o) {
//        return this.emailId-o.emailId;
//    }
}

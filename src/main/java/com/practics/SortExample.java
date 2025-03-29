package com.practics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;


public class SortExample {


    public static void main(String[] args) {

        ArrayList<Emp> emps = new ArrayList<Emp>();
       emps.add(new Emp("test", "9090789078", 14));
        emps.add(new Emp("Ankit", "909078000", 10));
        emps.add(new Emp("sopa", "9090789555", 13));
        System.out.println(emps);



        System.out.println(emps);

       // comprable
       // Collections.sort(emps);
        //System.out.println(emps);

      // comparator
        Collections.sort(emps, new IdComparator());

        ArrayList<Emp> emps1 = new ArrayList<Emp>(emps);

        Collections.sort(emps1, new NameComparator());
        System.out.println(emps1);


        ArrayList<Emp> emps2 = new ArrayList<Emp>(emps);
        Collections.sort(emps2, new PhoneComparator());
    }


}




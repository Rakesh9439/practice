package com.practics.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws IOException {

        // Creating object of student

        Student student = new Student("Ankit Kumar","ank@gmail.com",20,"patna");

        //write data to file
        FileOutputStream fos = new FileOutputStream("ob.txt" );
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // how to serialize
        oos.writeObject(student);
        oos.close();
        fos.close();
        System.out.println("Object state is transfer to file ob !!");

    }
}

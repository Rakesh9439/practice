package com.practics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 30);
        //List<Integer> filterList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> filterList = list.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(filterList);

        List<Integer> mappedList = list.stream().map(i -> i * 2).toList();
        System.out.println(mappedList);

        List<Integer> flateMapped = list.stream().flatMap(i -> List.of(i, i * 2).stream()).toList();
        System.out.println(flateMapped);

        // Q selectt only passed students

        List<Integer> marks = Arrays.asList(10, 50, 75, 35, 25, 20, 40);
        List<Integer> passed = marks.stream().filter(i -> i >= 35).collect(Collectors.toList());
        System.out.println("passed stuctures: " + passed);


        // Q Add  5 Grace marks  all the faild students

        List<Integer> graceMarks = marks.stream().filter(i -> i < 35).map(j -> j + 5).collect(Collectors.toList());
        System.out.println("Grace marks 5 failed Students : " + graceMarks);


        //Count()
        // Get the total number of field  Students
       long numberOfFailedStudent = marks.stream().filter(i -> i < 35).count();
        System.out.println("Number of Failed Student: " + numberOfFailedStudent);


        //sorted()
        // Sort the elements from the stream
        List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Marks: " + sortedMarks);

        // Comparator()
         // Q Sort the elements in descending order using comparator from stream
       // List<Integer> comparatorSort = marks.stream().sorted((a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0).collect(Collectors.toList());
        List<Integer> comparatorSort = marks.stream().sorted((a,b)-> b.compareTo(a)).toList();
        System.out.println("comparator sort : " + comparatorSort);

         String s1 = "abc";
         String s2 = "def";
         s1.concat("s2");
        System.out.println(s1);


    }
}

package com.ahamed.sample;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("vishnu");
        students.add("Amrith");
        students.add("faris");
        students.add("kaji");
        students.add("vithya");
        System.out.println(students);

        List<String> filterdata= students.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toList());
        System.out.println(filterdata);
    }


}

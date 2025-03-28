package jdk8.duplicate;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateOfLinkedList {
    public static void main(String[] args) {
        // 1. LinkedList object
        List<String> studentList = new LinkedList<String>();
        // 1.1 add String items to LinkedList
        studentList.add("Tendulkar");
        studentList.add("Kohli");
        studentList.add("Ganguly");
        studentList.add("Kohli");
        studentList.add("Tendulkar");
        studentList.add("Kohli");
        studentList.add("Ganguly");

        studentList.forEach(System.out::println);

        System.out.println("\n Find distinct elements or Remove duplicates by using List approach \n");
        List<String> uniqueSet = studentList.stream().distinct().collect(Collectors.toList());

        uniqueSet.forEach(System.out::println);

        List<String> studentList1 = new LinkedList<String>();
        // 1.1 add String items to LinkedList
        studentList1.add("Tendulkar");
        studentList1.add("Kohli");
        studentList1.add("Ganguly");
        studentList1.add("Kohli");
        studentList1.add("Tendulkar");
        studentList1.add("Kohli");
        studentList1.add("Ganguly");

        System.out.println("\n Find distinct elements or Remove duplicates by using Set approach \n");

        Set<String> collect = studentList1.stream().collect(Collectors.toSet());
        collect.forEach(System.out::println);

    }
}

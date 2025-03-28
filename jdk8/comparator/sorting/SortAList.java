package jdk8.comparator.sorting;

import jdk8.customobjects.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAList {
    public static void main(String[] args) {
        // 1. List of integer numbers
        List<Integer> numbers = Arrays.asList(
                63, 19, 86, 97, 7, 10, 67
        );
        numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String> names = Arrays.asList(
                "Salman Khan",
                "Ranbir Kapoor",
                "Aamir Khan",
                "Hrithik Roshan",
                "Akshay Kumar",
                "Sharukh Khan",
                "Ranveer Singh"
        );

        names.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Employee> empList=new ArrayList<Employee>();
        empList.add(new Employee(1, "Amit Kumar", 8000));
        empList.add(new Employee(2, "Sachin",6000));
        empList.add(new Employee(3, "Arun", 6500));
        empList.add(new Employee(4, "Ram", 7000));

        // sort with use of sorting()
        List<Employee> sortBasedOnSalary = empList
                .stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .collect(Collectors.toList());
        System.out.println(sortBasedOnSalary);
    }
}

package jdk8.reverse;


import jdk8.customobjects.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John Doe", 20000));
        employeeList.add(new Employee(2, "Jane Smith", 30000));
        employeeList.add(new Employee(4, "Mark Johnson", 50000));
        employeeList.add(new Employee(6, "Prabhat Ranjan Mahanty", 80000));
        // reverse employee list
        List<Employee> reversedEmployeeList = employeeList.stream().collect(Collectors
                .collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list;
                }));
        reversedEmployeeList.forEach(System.out::println);
    }
}

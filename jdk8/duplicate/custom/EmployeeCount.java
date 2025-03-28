package jdk8.duplicate.custom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Setter
@Getter
@AllArgsConstructor
public class EmployeeCount {
    // getters & setters
    // member variables
    private String name;
    private String department;

    public static void main(String[] args) {
        List<EmployeeCount> employees = Arrays.asList(
                new EmployeeCount("Pup", "IT"),
                new EmployeeCount("Pigeon", "HR"),
                new EmployeeCount("Punter", "IT"),
                new EmployeeCount("Gilly", "HR"),
                new EmployeeCount("Haydo", "IT")
        );

        employees.stream().collect(Collectors.groupingBy(
                EmployeeCount::getDepartment))
                .forEach((key, value) -> System.out.println(key + " " + value));

        Map<String, Long> employeeCountInDepartmentMap = employees.stream().
                collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));

        employeeCountInDepartmentMap.forEach((key, value) -> System.out.println(key + " " + value));


    }
}

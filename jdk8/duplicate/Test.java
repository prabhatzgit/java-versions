package jdk8.duplicate;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                63, 19, 86, 97, 7, 10, 67, 10, 19, 97, 63
        );

        Set<Integer> set = new HashSet<>();

        numbers.stream().filter(number -> !set.add(number)).forEach(System.out::println);

        List<Patient> patientReordList = Stream.of(
                new Patient(1, "ABC", "Heart"),
                new Patient(8, "DEF", "Brain"),
                new Patient(3, "GHI", "SKIN"),
                new Patient(9, "KLM", "EYE"),
                new Patient(4, "PQW", "TEETH"),
                new Patient(1, "ABC", "Heart"),
                new Patient(8, "DEF", "Brain")
        ).collect(Collectors.toList());

        System.out.println("remove duplicates based on the patient ID \n");

        patientReordList.stream().distinct().forEach(System.out::println);

        System.out.println("return the patient list based on the specific health metric of patient \n");

        patientReordList.stream().filter(patient -> Objects.equals(patient.getHealthMetrics(), "Heart")).forEach(System.out::println);
    }
}

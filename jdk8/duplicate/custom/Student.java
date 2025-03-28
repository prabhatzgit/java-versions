package jdk8.duplicate.custom;

import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Setter
@Getter
public class Student {
    private int id;
    private String name;
    private double percentage;
    private int rank;

    public Student(int id, String name, double percentage, int rank) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return
                id == student.id &&
                        Double.compare(percentage, student.percentage) == 0 &&
                        rank == student.rank &&
                        Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, percentage, rank);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", rank=" + rank +
                '}';
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Arun", 67.36, 2));
        studentList.add(new Student(2,"Sethu", 88.58, 1));
        studentList.add(new Student(3,"Ajith", 55.74, 4));
        studentList.add(new Student(4,"Vikcy", 61.32, 3));
        studentList.add(new Student(1,"Arun", 67.36, 2));

        studentList.forEach(System.out::println);

        System.out.println("\n sort the list based on rank by using Comparator.comparing() \n");
        List<Student> sortedList = studentList.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
        System.out.println("\n sort the list based on rank by using Comparator.comparing() reverse order \n");
        List<Student> reverseOrderList = studentList
                .stream()
                .sorted(Comparator.comparing(Student::getRank).reversed())
                .collect(Collectors.toList());
        System.out.println(reverseOrderList);
        System.out.println("\n sort the list based on rank by using (o1, o2) -> o1.getRank() - o2.getRank() \n");

        List<Student> sortedList1 = studentList.stream()
                .sorted(((o1, o2) -> o1.getRank() - o2.getRank()))
                .collect(Collectors.toList());

        sortedList1.forEach(System.out::println);

        List<Student> studentLinkedList = new LinkedList<>();

        studentLinkedList.add(new Student(1,"Arun", 67.36, 2)); // duplicate Arun
        studentLinkedList.add(new Student(2,"Sethu", 88.58, 1));
        studentLinkedList.add(new Student(3,"Ajith", 55.74, 4));
        studentLinkedList.add(new Student(4,"Vikcy", 61.32, 3));
        studentLinkedList.add(new Student(1,"Arun", 67.36, 2));

        studentLinkedList.forEach(System.out::println);

        System.out.println("\n sort the list based on rank by using Collector.toCollection() \n");

        TreeSet<Student> uniqueStudentSet = studentLinkedList
                .stream()
                .collect(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Student::getRank)))
                );

        uniqueStudentSet.forEach(System.out::println);

    }
}

package jdk8.duplicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateOfArrayList {
    public static void main(String[] args) {
        // create test data
        List<String> students = new ArrayList<String>();
        students.add("Roger");
        students.add("Rafael");
        students.add("Djokovic");
        students.add("Roger");
        students.add("Murray");
        students.add("Rafael");

        System.out.println("\n Find distinct elements or Remove duplicates by using stream and distinct() method \n");
        List<String> uniqueList = students
                .stream() // get stream for original list
                .distinct()// distinct method removes duplicates
                .sorted() // natural order sorting
                .collect(Collectors.toList());// distinct elements stored to new list

        uniqueList.forEach(System.out::println);

        System.out.println("\n Find distinct elements or Remove duplicates by using Set approach \n");

        List<String> students1 = new ArrayList<String>();
        students1.add("Roger");
        students1.add("Rafael");
        students1.add("Djokovic");
        students1.add("Roger");
        students1.add("Murray");
        students1.add("Rafael");

        Set<String> uniqueSet = students
                .stream() // get stream for original list
                .collect(Collectors.toSet());

        uniqueSet.forEach(uniqueElement -> System.out.println(uniqueElement));

        List<String> sortedList = uniqueSet.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}

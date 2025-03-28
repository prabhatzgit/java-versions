package jdk8.minmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        Integer secondLargest = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second largest number: " + secondLargest);

        int secondLargestNumber = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second largest number: " +secondLargestNumber);

        List<Integer> numbersList = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
        int secondLargestNumberFromList =
        numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second largest number: " +secondLargestNumberFromList);

        int secondLargestNumberFromListUsingLimitSkip =numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second largest number: " +secondLargestNumberFromListUsingLimitSkip);

        List<Integer> duplicateNumbers = Arrays.asList(5, 9, 5, 2, 8, 9, 1);
        int secondLargestNumberFromDuplicateList = duplicateNumbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargestNumberFromDuplicateList);
    }
}

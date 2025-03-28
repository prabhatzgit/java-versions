package jdk8.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 7, 3, 9, 6};
        Object[] reversedArr = IntStream.rangeClosed(1, array.length)
                .mapToObj(i -> array[array.length - i])
                .toArray();

        System.out.println(Arrays.toString(reversedArr));
    }
}

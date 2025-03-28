package jdk8.comparator.sorting;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int ary1[]={6,7,8,12,15,18};
        int ary2[]={22,35,42,6,7,8};
        // add both array and use hashset
        int[] array = Stream.
                concat(Arrays.stream(ary1).boxed(),
                        Arrays.stream(ary2).boxed())
                .distinct()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
        //System.out.println(collect);
    }
}

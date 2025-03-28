package jdk7.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("RED");
        hashSet.add("GREEN");
        hashSet.add("BLUE");
        hashSet.add(null);
        hashSet.add("YELLOW");
        hashSet.add("ORANGE");
        hashSet.add("WHITE ");
        hashSet.add("BLACK");
        System.out.println(hashSet);
        hashSet.remove("BLACK");
        System.out.println(hashSet);
    }
}

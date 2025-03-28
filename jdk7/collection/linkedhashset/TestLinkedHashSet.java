package jdk7.collection.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        linkedHashSet.add("h");
        linkedHashSet.add("c");
        System.out.println(linkedHashSet);
    }
}

package jdk8.mapimpl;

import java.util.HashMap;

public class HashmapImpl {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("London",1);
        map.put("New York",2);
        System.out.println(map.get("London"));
        System.out.println(map);
    }
}

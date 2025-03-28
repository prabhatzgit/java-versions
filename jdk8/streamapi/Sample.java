package jdk8.streamapi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        String str = "adaaddarsc";
        Map<String, Long> hash = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        char[] charArr = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
         for(int i = 0; i <= charArr.length-1; i++){
             if(hashMap.containsKey(charArr[i])){
                 hashMap.put(charArr[i], hashMap.get(charArr[i]+1));
             }else
                 hashMap.put(charArr[i], hashMap.get(charArr[i]));
         }
    }
}

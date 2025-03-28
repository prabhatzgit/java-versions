package jdk8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodAndConstructorReference {
    public static void main(String[] args) {
        // method reference
        List<String> student = Arrays.asList("Ram","Shyam","Ghanshyam");
        student.forEach(x -> System.out.println(x));
        student.forEach(System.out::println);
        // constructor reference
        List<String> names = Arrays.asList("A","B","C","D","E","F","G");
        List<MobilePhone> mobilePhoneListLambdaExp = names.stream().map(
                x -> new MobilePhone(x)).collect(Collectors.toList());

        List<MobilePhone> mobilePhoneListConstructorRef = names.stream().map(
                MobilePhone::new).collect(Collectors.toList());
    }
}

class MobilePhone {
    String name;

    public MobilePhone(String name) {

    this.name = name;}
}

package jdk8.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class User {

    private String name;
    private String phoneNumber;
    private List<String> emailId;

    public User(String name, String phoneNumber, List<String> emailId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getEmailId() {
        return emailId;
    }

    public void setEmailId(List<String> emailId) {
        this.emailId = emailId;
    }

    public static void main(String[] args) {
        List<User> users = Stream.of(new User("Prabhat", "39845024", Arrays.asList("abc@gmail.com", "def@gmail.com")),
                  new User("Ranjan", "7687682", Arrays.asList("hsdu@gmail.com", "uyr@gmail.com")))
                .collect(Collectors.toList());

        // gather phone number or user name of all the users
        // one to one scenario
        List<String> phoneNumbers = users.stream().map(User::getPhoneNumber).collect(Collectors.toList());
        System.out.println(phoneNumbers);
        // one to many scenario
        // one user may have more than one mail id
        List<List<String>> emailsByMap = users.stream().map(User::getEmailId).collect(Collectors.toList());
        System.out.println(emailsByMap);
        List<String> emailsByFlatMap = users.stream().flatMap(user -> user.getEmailId().stream()).collect(Collectors.toList());
        System.out.println(emailsByFlatMap);

    }
}

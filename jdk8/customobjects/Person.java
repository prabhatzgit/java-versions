package jdk8.customobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    public Integer id;
    public String firstName;
    public String secondName;
    public String lastName;
}

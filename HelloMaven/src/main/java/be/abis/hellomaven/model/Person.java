package be.abis.hellomaven.model;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }


    public int calcBirth(){
//        return 2022 - age;
        return LocalDate.now().minusYears(age).getYear();
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

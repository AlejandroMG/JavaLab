package org.example;
import Builders.PersonBuilder;

public class Person{
    private final String id;
    private final String name;
    private final int age;
    private final String address;
    private final String email;

    public Person(PersonBuilder personBuilder) {
        this.id = personBuilder.getId();
        this.name = personBuilder.getName();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
        this.email = personBuilder.getEmail();
    }

    //Getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
}

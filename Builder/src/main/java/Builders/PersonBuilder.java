package Builders;
import org.example.Person;

public class PersonBuilder {
    private final String id;
    private final String name;
    private int age;
    private String address;
    private String email;

    public PersonBuilder(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }
    public PersonBuilder email(String email) {
        this.email = email;
        return this;
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

    public Person build(){
        return new Person(this);
    }
}

package org.example;

import Builders.PersonBuilder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder("1", "Ale")
                .age(20)
                .address("Av...")
                .email("A@.cl")
                .build();
        System.out.println(person.getName() + person.getId());

        // id y name necesarios.
        Person person2 = new PersonBuilder("2","B").build();
        System.out.println(person2.getName() + person2.getId());

    }
}
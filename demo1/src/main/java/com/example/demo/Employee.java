package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data // Para Generar Getters, Setters, toString, equals, hashCode
@NoArgsConstructor //Para el constructor sin argumentos
@AllArgsConstructor //constructor con todos los parámetros
@Builder // Habilita el patrón Builder

public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    // Reemplazado por métodos de librería lombok

/*    //Constructor sin argumentos para crear instancias usando reflexión, crea el objeto vacío y luego le asigna valores.
    public Employee();{}


    public Employee(Integer id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }*/
}

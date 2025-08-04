package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Estudiante {
    private String nombre;
    private int edad;
    private Optional<String> email;
    private List<Curso> cursosInscritos;

    public Estudiante(String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = Optional.of(email);
        this.cursosInscritos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public Optional<String> getEmail() {
        return email;
    }
    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void inscribirCurso(Curso curso){
        this.cursosInscritos.add(curso);
    }
}

package org.example;

public interface RepositorioEstudiante {
    void guardar(Estudiante estudiante);
    Estudiante buscarPorNombre(String nombre);
}

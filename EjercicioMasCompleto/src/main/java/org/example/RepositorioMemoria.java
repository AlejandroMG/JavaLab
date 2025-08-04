package org.example;

import java.util.HashMap;
import java.util.Map;

public class RepositorioMemoria implements RepositorioEstudiante {
    private final Map<String, Estudiante> estudiantes;

    public RepositorioMemoria() {
        estudiantes = new HashMap<>();
    }

    @Override
    public void guardar(Estudiante estudiante) {
        estudiantes.put(estudiante.getNombre(), estudiante);
    }
    @Override
    public Estudiante buscarPorNombre(String nombre) {
        return estudiantes.get(nombre);
    }

}

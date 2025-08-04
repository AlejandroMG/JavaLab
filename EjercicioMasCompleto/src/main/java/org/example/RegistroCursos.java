package org.example;

import java.util.List;

public class RegistroCursos {
    private RepositorioEstudiante repositorio;

    public RegistroCursos(RepositorioEstudiante repositorio) {
        this.repositorio = repositorio;
    }
    public void registrar(Estudiante estudiante) throws Exception {
        if (estudiante.getEdad() >= 13){
            repositorio.guardar(estudiante);
        }
        else{
            String error = String.format("Edad de %s Invalida <13", estudiante.getNombre());
            throw new EdadInvalidaException(error);
        }

    }
    public void inscribirEnCurso(String nombreEstudiante, Curso curso){
        Estudiante estudiante = repositorio.buscarPorNombre(nombreEstudiante);
        if (estudiante != null){
            estudiante.inscribirCurso(curso);
        }
        else{
            System.out.println("Estudiante no encontrado");
        }
    }
}

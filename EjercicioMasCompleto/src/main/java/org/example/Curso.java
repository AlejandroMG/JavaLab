package org.example;

public class Curso {
    private String nombreCurso;
    private String codigoCurso;

    public Curso(String nombreCurso, String codigoCurso){
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public String getCodigoCurso() {
        return codigoCurso;
    }

}

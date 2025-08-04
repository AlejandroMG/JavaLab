package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RepositorioEstudiante repositorio = new RepositorioMemoria();
        RegistroCursos registro = new RegistroCursos(repositorio);

        Estudiante estudiante1 = new Estudiante("A",23,"a@a.cl");
        Estudiante estudiante2 = new Estudiante("B", 11 ,"b@b.cl");

        Curso curso1 = new Curso("Cálculo","101");
        try {
            registro.registrar(estudiante1);
            registro.registrar(estudiante2); // debe lanzar excepción
        } catch (EdadInvalidaException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        registro.inscribirEnCurso("A", curso1);

        Estudiante a = repositorio.buscarPorNombre("A");
        System.out.println("Cursos de A:");
        for (Curso c : a.getCursosInscritos()) {
            System.out.println(" - " + c);
        }

        // Mostrar email si está presente
        a.getEmail().ifPresent(email -> System.out.println("Email de Ana: " + email));
    }
}
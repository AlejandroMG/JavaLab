package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository // Para registrar la clase EmployeeDAO como un bean
// Un bean es un objeto instanciado, manejado y ensamblado por la IoC container.

//Dao es un patrón de diseño que sirve para separar la capa de persitencia (ej:BD)
// de la capa de aplicación usando una API abstracta
public class EmployeeDAO {
    private static Employees employees = new Employees();

    static {
        employees.getEmployeeList()
                .add(new Employee(1, "A","B","a@b.c"));
        employees.getEmployeeList()
                .add(new Employee(2, "B","C","b@c.c"));
        employees.getEmployeeList()
                .add(new Employee(3, "D","E","d@e.c"));
    }

    public Employees getAllEmployees(){
        return employees;
    }
    public void addEmployee(Employee employee){
        employees.getEmployeeList().add(employee);
    }
}

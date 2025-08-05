package com.example.demo;
import lombok.Builder;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;



public class Employees {

    private List<Employee> employeesList;

    //Uso del patrón Singleton para crear una única Instancia de la lista de empleados
    public List<Employee> getEmployeeList() {
        if (employeesList == null) {
            employeesList = new ArrayList<>();
        }
        return employeesList;
    }
    public void setEmployeeList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }
}

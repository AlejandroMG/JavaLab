package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController //Este código describe un endpoint que debiese estar disponible en la red.
@RequestMapping("/employees") //este metodo manejará todas las peticiones que lleguen a /employees

public class EmployeeController {

    @Autowired //Para inyectar la dependencia EmployeeDAO aquí en EmployeeController
    private EmployeeDAO employeeDAO;

    // GET Endpoint para buscar todos los Empleados (Employees)
    @GetMapping("/") // Mapea peticiones HTTP cuando se hagan en /employees
    public Employees getEmployees() {
        return employeeDAO.getAllEmployees();
    }
    // POST Endpoint para agregar un nuevo Empleado
    @PostMapping("/")
    public ResponseEntity<Object>addEmployee(@RequestBody Employee employee){ //@RequestBody le dice a spring que convierta el JSON a un objeto Employee
        //Generar Id
        Integer id = employeeDAO.getAllEmployees()
                .getEmployeeList().size() + 1;
        employee.setId(id);

        // Agregar empleado a la lista
        employeeDAO.addEmployee(employee);

        // Construir locación URI para el nuevo empleado
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }


}

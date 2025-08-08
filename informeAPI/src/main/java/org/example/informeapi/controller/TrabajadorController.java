package org.example.informeapi.controller;


import org.example.informeapi.model.Trabajador;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/trabajadores")


public class TrabajadorController {
    private final List<Trabajador> trabajadores = new ArrayList<Trabajador>();

}

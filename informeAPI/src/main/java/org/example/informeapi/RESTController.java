package org.example.informeapi;


import classes.Trabajador;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping

public class RESTController {
    private final List<Trabajador> trabajadores = new ArrayList<Trabajador>();

    @RequestMapping("")
}

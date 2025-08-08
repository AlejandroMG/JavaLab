package org.example.informeapi.service;


import org.example.informeapi.model.Trabajador;
import org.example.informeapi.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadorService {
    @Autowired
    private TrabajadorRepository trabajadorRepository;

    public List<Trabajador> getAllTrabajadores() {
        return trabajadorRepository.findAll();
    }
}

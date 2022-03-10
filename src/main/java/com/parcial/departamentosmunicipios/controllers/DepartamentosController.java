package com.parcial.departamentosmunicipios.controllers;

import java.util.List;

import com.parcial.departamentosmunicipios.entity.departamentos;
import com.parcial.departamentosmunicipios.service.IDepartamentosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartamentosController {

    @Autowired  
    private IDepartamentosService departamentosService;
    
    @GetMapping("/listar")
    public List<departamentos> listar(){
        return departamentosService.findAll();
    }

    @GetMapping("/ver/{id}")
    public departamentos detalle(@PathVariable Integer id) throws InterruptedException{

        departamentos transferencia = departamentosService.findById(id);

        return transferencia;
    }
}

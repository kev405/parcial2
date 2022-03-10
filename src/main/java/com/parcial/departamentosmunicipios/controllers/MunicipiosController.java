package com.parcial.departamentosmunicipios.controllers;

import java.util.List;

import com.parcial.departamentosmunicipios.entity.municipios;
import com.parcial.departamentosmunicipios.service.IMunicipiosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MunicipiosController {
    
    @Autowired
    private IMunicipiosService municipiosService;

    @GetMapping("/municipios/listar")
    public List<municipios> listar(){
        return municipiosService.findAll();
    }

    @GetMapping("/municipios/listar/{id}")
    public List<municipios> listarByDepartmentId(@PathVariable Integer id){
        return municipiosService.findAllByDepartmentId(id);
    }

    @GetMapping("/municipios/ver/{id}")
    public municipios detalle(@PathVariable Integer id) throws InterruptedException{

        municipios transferencia = municipiosService.findById(id);

        return transferencia;
    }
}

package com.parcial.departamentosmunicipios.service;

import java.util.List;

import com.parcial.departamentosmunicipios.entity.departamentos;

public interface IDepartamentosService {
    
    public List<departamentos> findAll();

    public departamentos findById(Integer id);
}

package com.parcial.departamentosmunicipios.service;

import java.util.List;

import com.parcial.departamentosmunicipios.entity.municipios;

public interface IMunicipiosService {

    public List<municipios> findAll();

    public municipios findById(Integer id);

    public List<municipios> findAllByDepartmentId(Integer id);
    
}

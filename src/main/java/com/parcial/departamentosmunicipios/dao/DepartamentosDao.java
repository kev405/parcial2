package com.parcial.departamentosmunicipios.dao;

import com.parcial.departamentosmunicipios.entity.departamentos;

import org.springframework.data.repository.CrudRepository;

public interface DepartamentosDao extends CrudRepository <departamentos, Integer>{
    
}

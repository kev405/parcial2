package com.parcial.departamentosmunicipios.service;

import java.util.List;

import com.parcial.departamentosmunicipios.dao.DepartamentosDao;
import com.parcial.departamentosmunicipios.entity.departamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IDepartamentosImpl implements IDepartamentosService{

    @Autowired
    private DepartamentosDao departamentosDao;

    @Override
    public List<departamentos> findAll() {
        return (List<departamentos>) departamentosDao.findAll();
    }

    @Override
    public departamentos findById(Integer id) {
        return departamentosDao.findById(id).orElse(null);
    }
    
}

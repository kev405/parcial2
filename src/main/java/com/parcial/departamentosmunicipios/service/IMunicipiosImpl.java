package com.parcial.departamentosmunicipios.service;

import java.util.List;

import com.parcial.departamentosmunicipios.dao.MunicipiosDao;
import com.parcial.departamentosmunicipios.entity.municipios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IMunicipiosImpl implements IMunicipiosService{

    @Autowired
    private MunicipiosDao municipiosDao;

    @Override
    public List<municipios> findAll() {
        return (List<municipios>) municipiosDao.findAll();
    }

    @Override
    public municipios findById(Integer id) {
        return municipiosDao.findById(id).orElse(null);
    }

    @Override
    public List<municipios> findAllByDepartmentId(Integer id) {
        return municipiosDao.findMunicipiosByDepartmentId(id);
    }
    
}

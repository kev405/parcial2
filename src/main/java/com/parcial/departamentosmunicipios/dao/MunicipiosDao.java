package com.parcial.departamentosmunicipios.dao;

import java.util.List;

import com.parcial.departamentosmunicipios.entity.municipios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface MunicipiosDao extends JpaRepository<municipios, Integer>{
    
    @Modifying
    @Query(value = "SELECT * FROM municipio WHERE municipio.departamento_id = ?1", nativeQuery = true)
    List<municipios> findMunicipiosByDepartmentId(Integer id);
}

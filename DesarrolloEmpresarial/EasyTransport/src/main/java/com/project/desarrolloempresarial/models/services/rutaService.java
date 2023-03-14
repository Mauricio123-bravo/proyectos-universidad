package com.project.desarrolloempresarial.models.services;

import com.project.desarrolloempresarial.entities.rutaEntity;

import java.util.List;


public interface rutaService {

    public List<rutaEntity> findAll();

    public void save(rutaEntity rutaEntity);

    public void deleteById(Long id);

    public void changeByIdAndState(Long id);

    public rutaEntity findOne(Long id);

    public  rutaEntity update(rutaEntity rutaEntity);
}

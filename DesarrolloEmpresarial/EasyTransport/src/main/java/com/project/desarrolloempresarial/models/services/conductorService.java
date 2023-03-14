package com.project.desarrolloempresarial.models.services;

import com.project.desarrolloempresarial.entities.conductorEntity;

import java.util.List;


public interface conductorService {


    public List<conductorEntity> findAll();

    public void save(conductorEntity conductorEntity);

    public void deleteById(Long id);

    public void changeByIdAndState(Long id);

    public conductorEntity findOne(Long id);

    public conductorEntity update(conductorEntity conductorEntity);

    public conductorEntity findLastDriver();
}

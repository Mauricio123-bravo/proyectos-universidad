package com.project.desarrolloempresarial.models.services;


import com.project.desarrolloempresarial.entities.vehiculoEntity;

import java.util.List;


public interface vehiculoService {

    public List<vehiculoEntity> findAll();

    public void save(vehiculoEntity vehiculoEntity);

    public void deleteById(Long id);

    public void changeByIdAndState(Long id);

    public vehiculoEntity findOne(Long id);

    public vehiculoEntity update(vehiculoEntity vehiculoEntity);
}

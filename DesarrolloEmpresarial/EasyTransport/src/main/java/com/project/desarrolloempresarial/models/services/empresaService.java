package com.project.desarrolloempresarial.models.services;


import com.project.desarrolloempresarial.entities.empresaEntity;

import java.util.List;


public interface empresaService {

    public List<empresaEntity>  findAll();

    public void save(empresaEntity empresaEntity);

    /* metodo para eliminar por ID = CRUDREPOSITORY */
    public void deleteById(Long id);

    /* metodo para CAMBIAR ESTADO */

    public void changeByIdAndState(Long id);

    public empresaEntity findOne(Long id);

    public empresaEntity update(empresaEntity empresaEntity);

}

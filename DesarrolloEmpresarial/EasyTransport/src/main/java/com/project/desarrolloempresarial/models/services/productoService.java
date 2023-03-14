package com.project.desarrolloempresarial.models.services;


import com.project.desarrolloempresarial.entities.productoEntity;

import java.util.List;


public interface productoService {

   public List<productoEntity> findAll();

   public void save(productoEntity productoEntity);

   public void deleteById(Long id);

   public void changeByIdAndState(Long id);

   public productoEntity findOne(Long id);

   public productoEntity update(productoEntity productoEntity);
}

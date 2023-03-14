package com.project.desarrolloempresarial.models.services;


import com.project.desarrolloempresarial.entities.productoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class productoServiceImplement implements productoService{

    @Autowired
    private com.project.desarrolloempresarial.models.dao.productoDao productoDao;


    @Override
    @Transactional(readOnly = true)
    public List<productoEntity> findAll(){
        return (List<productoEntity>) productoDao.findAll();

    }

    @Override
    @Transactional
    public void save(productoEntity productoEntity){

        productoDao.save(productoEntity);
    }

    @Override
    @Transactional
    public void deleteById(Long id){

        productoDao.deleteById(id);
    }

    @Override
    @Transactional
    public void changeByIdAndState(Long id){

       productoDao.changeByIdAndState(id);
    }

    @Override
    @Transactional(readOnly = true)
    public productoEntity findOne(Long id){

        return productoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public productoEntity update(productoEntity productoEntity){

        return productoDao.save(productoEntity);
    }

}

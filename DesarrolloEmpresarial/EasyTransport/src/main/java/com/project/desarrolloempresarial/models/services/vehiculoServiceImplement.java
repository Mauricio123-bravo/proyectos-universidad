package com.project.desarrolloempresarial.models.services;


import com.project.desarrolloempresarial.entities.vehiculoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class vehiculoServiceImplement implements vehiculoService{

    @Autowired
    private com.project.desarrolloempresarial.models.dao.vehiculoDao vehiculoDao;


    @Override
    @Transactional(readOnly = true)
    public List<vehiculoEntity> findAll(){
        return (List<vehiculoEntity>) vehiculoDao.findAll();

    }

    @Override
    @Transactional
    public void save(vehiculoEntity vehiculoEntity){

        vehiculoDao.save(vehiculoEntity);
    }

    @Override
    @Transactional
    public void deleteById(Long id){

        vehiculoDao.deleteById(id);
    }

    @Override
    @Transactional
    public void changeByIdAndState(Long id){

        vehiculoDao.changeByIdAndState(id);
    }

    @Override
    @Transactional(readOnly = true)
    public vehiculoEntity findOne(Long id){

        return vehiculoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public vehiculoEntity update(vehiculoEntity vehiculoEntity){

        return vehiculoDao.save(vehiculoEntity);
    }





}

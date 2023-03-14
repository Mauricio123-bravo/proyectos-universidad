package com.project.desarrolloempresarial.models.services;


import com.project.desarrolloempresarial.entities.rutaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class rutaServiceImplement implements rutaService {

    @Autowired
    private com.project.desarrolloempresarial.models.dao.rutaDao rutaDao;


    @Override
    @Transactional(readOnly = true)
    public List<rutaEntity> findAll(){
        return (List<rutaEntity>) rutaDao.findAll();

    }

    @Override
    @Transactional
    public void save(rutaEntity rutaEntity){

        rutaDao.save(rutaEntity);
    }

    @Override
    @Transactional
    public void deleteById(Long id){

        rutaDao.deleteById(id);
    }

    @Override
    @Transactional
    public void changeByIdAndState(Long id){

        rutaDao.changeByIdAndState(id);
    }


    @Override
    @Transactional(readOnly = true)
    public rutaEntity findOne(Long id){

        return rutaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public rutaEntity update(rutaEntity rutaEntity){

        return rutaDao.save(rutaEntity);
    }



}

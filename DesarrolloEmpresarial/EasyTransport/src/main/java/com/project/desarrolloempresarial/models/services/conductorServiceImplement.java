package com.project.desarrolloempresarial.models.services;

import com.project.desarrolloempresarial.entities.conductorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class conductorServiceImplement implements conductorService{

    @Autowired
    private com.project.desarrolloempresarial.models.dao.conductorDao conductorDao;


    @Override
    @Transactional(readOnly = true)
    public List<conductorEntity> findAll(){
        return (List<conductorEntity>) conductorDao.findAll();

    }

    @Override
    @Transactional
    public void save(conductorEntity conductorEntity){

        conductorDao.save(conductorEntity);
    }

    @Override
    @Transactional
    public void deleteById(Long id){

       conductorDao.deleteById(id);
    }

    @Override
    @Transactional
    public void changeByIdAndState(Long id){

        conductorDao.changeByIdAndState(id);
    }

    @Override
    @Transactional(readOnly = true)
    public conductorEntity findOne(Long id){

        return conductorDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public conductorEntity update(conductorEntity conductorEntity){

        return conductorDao.save(conductorEntity);
    }

    @Transactional(readOnly = true)
    public conductorEntity findLastDriver(){
        return conductorDao.findLastDriver();
    }


}

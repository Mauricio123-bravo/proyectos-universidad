package com.project.desarrolloempresarial.models.services;

import com.project.desarrolloempresarial.entities.empresaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class empresaServiceImplement implements empresaService{


    @Autowired
    private com.project.desarrolloempresarial.models.dao.empresaDao empresaDao;

    /**
     *    @Desc Este metodo es la implemetacion del metodo creado en mi servicio
     *    para la entidad de empresa y retorna la lista de los registros.
     *    @CreateAt 29/08/22
     *    @Version 0.1
     *    @author  Mauricio Bravo
     *    @required interfaz service
     * **/
    @Override
    @Transactional(readOnly = true)
    public List<empresaEntity> findAll(){
        return (List<empresaEntity>) empresaDao.findAll();

    }


    /**
     *    @Desc Este metodo es la implemetacion del metodo de salvar en mi servicio
     *    para la entidad de empresa y no retorna e inserta un nuevo registro.
     *    @CreateAt 29/08/22
     *    @Version 0.1
     *    @author  Mauricio Bravo
     *    @required interfaz service
     *    @param    empresaEntity
     * **/

    @Override
    @Transactional
    public void save(empresaEntity empresaEntity){

        empresaDao.save(empresaEntity);
    }

    /**
     *    @Desc Este metodo es la implemetacion del metodo de eliminar en mi servicio
     *    para la entidad de empresa y no retorna, y eliimina un registro de l abd por id .
     *    utilizando el crudrepository
     *    @CreateAt 29/08/22
     *    @Version 0.1
     *    @author  Mauricio Bravo
     *    @required interfaz service
     *    @param
     *     @param    id
     * **/

    @Override
    @Transactional
    public void deleteById(Long id){

        empresaDao.deleteById(id);
    }

    @Override
    @Transactional
    public void changeByIdAndState(Long id){

        empresaDao.changeByIdAndState(id);
    }

    @Override
    @Transactional(readOnly = true)
    public empresaEntity findOne(Long id){

        return empresaDao.findById(id).orElse(null);
    }


    @Override
    @Transactional
    public empresaEntity update(empresaEntity conductorEntity){

        return empresaDao.save(conductorEntity);
    }




}

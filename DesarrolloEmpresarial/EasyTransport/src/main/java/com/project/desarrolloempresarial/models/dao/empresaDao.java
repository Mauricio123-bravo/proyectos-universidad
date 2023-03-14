package com.project.desarrolloempresarial.models.dao;

import com.project.desarrolloempresarial.entities.empresaEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface empresaDao extends CrudRepository<empresaEntity, Long> {

    @Transactional
    @Modifying
    @Query("update empresaEntity set estado = false where idempresa= ?1")
    public void changeByIdAndState(Long id);

    //para volver a mostar en la tabla el registro que se borro pero que queda en BD.
    //@Transactional
    //@Modifying
    //@Query("update empresaEntity set estado = true where idempresa= ?1")
    //public void activeState(Long id);



}

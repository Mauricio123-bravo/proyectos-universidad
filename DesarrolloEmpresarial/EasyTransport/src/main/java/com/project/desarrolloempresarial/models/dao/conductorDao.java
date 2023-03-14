package com.project.desarrolloempresarial.models.dao;

import com.project.desarrolloempresarial.entities.conductorEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface conductorDao extends CrudRepository<conductorEntity,Long> {

    @Transactional
    @Modifying
    @Query("update conductorEntity set estado = false where idconductor= ?1")
    public void changeByIdAndState(Long id);

    @Query("SELECT MAX(con) FROM conductorEntity con")
    public conductorEntity findLastDriver();
}

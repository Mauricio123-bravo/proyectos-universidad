package com.project.desarrolloempresarial.models.dao;

import com.project.desarrolloempresarial.entities.vehiculoEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface vehiculoDao extends CrudRepository<vehiculoEntity, Long> {

    @Transactional
    @Modifying
    @Query("update vehiculoEntity set estado = false where idvehiculo= ?1")
    public void changeByIdAndState(Long id);
}

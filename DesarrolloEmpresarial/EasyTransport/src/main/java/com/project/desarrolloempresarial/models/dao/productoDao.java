package com.project.desarrolloempresarial.models.dao;

import com.project.desarrolloempresarial.entities.productoEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface productoDao extends CrudRepository<productoEntity, Long> {

    @Transactional
    @Modifying
    @Query("update productoEntity set estado = false where idproducto = ?1")
    public void changeByIdAndState(Long id);
}

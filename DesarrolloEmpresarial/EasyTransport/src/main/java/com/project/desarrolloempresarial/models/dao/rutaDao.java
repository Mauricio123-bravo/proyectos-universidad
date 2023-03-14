package com.project.desarrolloempresarial.models.dao;

import com.project.desarrolloempresarial.entities.rutaEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface rutaDao extends CrudRepository<rutaEntity,Long> {

    @Transactional
    @Modifying
    @Query("update rutaEntity set estado = false where idruta= ?1")
    public void changeByIdAndState(Long id);
}

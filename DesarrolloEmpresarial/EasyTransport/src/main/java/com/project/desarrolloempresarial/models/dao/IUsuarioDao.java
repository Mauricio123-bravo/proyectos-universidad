package com.project.desarrolloempresarial.models.dao;

import com.project.desarrolloempresarial.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u WHERE u.username=?1")
    public Usuario findByUsername(String term);

}

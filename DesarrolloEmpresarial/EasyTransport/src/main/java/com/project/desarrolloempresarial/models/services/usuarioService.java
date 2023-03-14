package com.project.desarrolloempresarial.models.services;


import com.project.desarrolloempresarial.entities.Usuario;

import java.util.List;

public interface usuarioService {
    public List<Usuario> findAll();
    public void save(Usuario usuario);
    public Usuario findOne(Long id);
    public void delete(Long id);
}

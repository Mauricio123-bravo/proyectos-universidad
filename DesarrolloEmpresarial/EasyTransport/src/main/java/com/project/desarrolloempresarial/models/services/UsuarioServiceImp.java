package com.project.desarrolloempresarial.models.services;

import com.project.desarrolloempresarial.entities.Usuario;
import com.project.desarrolloempresarial.models.dao.IUsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImp implements usuarioService {

    @Autowired
    private IUsuarioDao iUsuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) iUsuarioDao.findAll();
    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        iUsuarioDao.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findOne(Long id) {
        return iUsuarioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        iUsuarioDao.delete(findOne(id));
    }

}

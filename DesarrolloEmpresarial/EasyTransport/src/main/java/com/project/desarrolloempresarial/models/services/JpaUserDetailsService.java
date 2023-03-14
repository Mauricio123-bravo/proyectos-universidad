package com.project.desarrolloempresarial.models.services;

import com.project.desarrolloempresarial.entities.Authority;
import com.project.desarrolloempresarial.entities.Usuario;
import com.project.desarrolloempresarial.models.dao.IUsuarioDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("jpaUserDetailsService")
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private IUsuarioDao iUsuarioDao;

    private Logger logger = LoggerFactory.getLogger(JpaUserDetailsService.class);

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = iUsuarioDao.findByUsername(username);

        if(usuario==null){
            logger.error("Error login: No existe el usuario '"+username+"'");
            throw new UsernameNotFoundException("Username "+username+" no existe en el sistema");
        }

        List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
        for (Authority authority: usuario.getAuthorities()){
            logger.info("Roles: ".concat(authority.getAuthority()));
            authorityList.add(new SimpleGrantedAuthority(authority.getAuthority()));
        }
        if(authorityList.isEmpty()){
            logger.error("Error login: Usuario '"+username+"' No tiene roles asignados");
            throw new UsernameNotFoundException("Error login: Usuario '"+username+"' No tiene roles asignados");
        }
        return new User(usuario.getUsername(),usuario.getPassword(),usuario.isEstado(),true,true,true,authorityList);
    }
}

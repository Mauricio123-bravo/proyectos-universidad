package com.project.desarrolloempresarial.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private Long idUsuario;

    @NotNull
    @Column(name = "username",unique = true)
    private String username;

    @NotNull
    @Column(name = "password",length = 60)
    private String password;

    @NotNull
    @Column(name = "estado")
    private boolean estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idconductor", referencedColumnName = "idconductor")
    private conductorEntity conductor;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idUsuario",referencedColumnName = "iduser")
    private List<Authority> authorities;

    /********************* METODOS *******************/

    /** Constructor **/
    public Usuario() {
        this.authorities = new ArrayList<Authority>();
    }
    /** 1. Metodo añadir Autoridad **/
    public void addAuthority(Authority authority){
        this.authorities.add(authority);
    }

    /********************* GET & SET *******************/

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public conductorEntity getConductor() {
        return conductor;
    }

    public void setConductor(conductorEntity conductor) {
        this.conductor = conductor;
    }
}

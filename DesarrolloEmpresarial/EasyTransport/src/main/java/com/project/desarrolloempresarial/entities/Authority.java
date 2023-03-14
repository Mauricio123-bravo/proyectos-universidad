package com.project.desarrolloempresarial.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

//,uniqueConstraints = {@UniqueConstraint(columnNames = {"id_usuario","authority"})}
@Entity
@Table(name = "authorities")
public class Authority implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "idauthority")
    private Long idAuthority;

    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "authority")
    private String authority;

    @NotNull
    @JoinColumn(name = "idUsuario", referencedColumnName = "iduser")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdAuthority() {
        return idAuthority;
    }

    public void setIdAuthority(Long idAuthority) {
        this.idAuthority = idAuthority;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

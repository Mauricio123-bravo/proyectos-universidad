package com.project.desarrolloempresarial.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "empresa")
public class empresaEntity implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempresa")
    private Long idempresa;

    //ATRIBUTO DE MI TABLA
    @NotNull
    @Column(name = "nombreempresa")
    private String nombreempresa;

    @NotNull
    @Column(name = "ciudad")
    private String ciudad;

     @NotNull
    @Column(name = "estado")
        private boolean estado;

    //PARA FECHA
   // @Column(name = "fecha")
   // @DateTimeFormat(pattern = "yyyy/MM/dd")
   // @Temporal(TemporalType.DATE)
    // private Date fecha;

    //PARA hora
    // @Column(name = "hora")
    // @Temporal(TemporalType.TIME)
    // private Time hora;

    public Long getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Long idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

package com.project.desarrolloempresarial.entities;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "conductor")
public class conductorEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconductor")
    private Long idconductor;

    @NotNull
    @Column(name = "nombreconductor")
    private String nombreconductor;

    @NotNull
    @Column(name = "apellidoconductor")
    private String apellidoconductor;

    @NotNull
    @Column(name = "estado")
    private boolean estado;

    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    @ManyToOne(fetch = FetchType.LAZY)
    private empresaEntity idempresa;


    @JoinColumn(name = "idvehiculo", referencedColumnName = "idvehiculo")
    @ManyToOne(fetch = FetchType.LAZY)
    private vehiculoEntity idvehiculo;

    public String getNombreconductor() {
        return nombreconductor;
    }

    public void setNombreconductor(String nombreconductor) {
        this.nombreconductor = nombreconductor;
    }

    public String getApellidoconductor() {
        return apellidoconductor;
    }

    public void setApellidoconductor(String apellidoconductor) {
        this.apellidoconductor = apellidoconductor;
    }

    public empresaEntity getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(empresaEntity idempresa) {
        this.idempresa = idempresa;
    }

    public vehiculoEntity getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(vehiculoEntity idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Long getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(Long idconductor) {
        this.idconductor = idconductor;
    }
}

package com.project.desarrolloempresarial.entities;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "producto")
public class productoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproducto")
    private Long idproducto;

    @NotNull
    @Column(name = "nombreproducto")
    private String nombreproducto;

    @NotNull
    @Column(name = "tipoproducto")
    private String tipoproducto;

    @NotNull
    @Column(name = "pesoproducto")
    private String pesoproducto;

    @NotNull
    @Column(name = "estado")
    private boolean estado;

    @JoinColumn(name = "idvehiculo", referencedColumnName = "idvehiculo")
    @ManyToOne(fetch = FetchType.LAZY)
    private vehiculoEntity idvehiculo;




    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(String tipoproducto) {
        this.tipoproducto = tipoproducto;
    }

    public String getPesoproducto() {
        return pesoproducto;
    }

    public void setPesoproducto(String pesoproducto) {
        this.pesoproducto = pesoproducto;
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
}

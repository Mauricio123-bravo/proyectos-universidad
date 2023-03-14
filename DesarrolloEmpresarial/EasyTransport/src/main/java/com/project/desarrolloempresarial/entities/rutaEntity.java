package com.project.desarrolloempresarial.entities;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ruta")
public class rutaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idruta")
    private Long idruta;

    @NotNull
    @Column(name = "inicio")
    private String inicio;

    @NotNull
    @Column(name = "destino")
    private String destino;

    @NotNull
    @Column(name = "valor")
    private Long valor;

    @NotNull
    @Column(name = "cantpeajes")
    private Long cantpeajes;

    @NotNull
    @Column(name = "combustible")
    private Long combustible;

    @NotNull
    @Column(name = "estado")
    private boolean estado;

    @JoinColumn(name = "idconductor", referencedColumnName = "idconductor")
    @ManyToOne(fetch = FetchType.LAZY)
    private conductorEntity idconductor;


    public Long getIdruta() {
        return idruta;
    }

    public void setIdruta(Long idruta) {
        this.idruta = idruta;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Long getCantpeajes() {
        return cantpeajes;
    }

    public void setCantpeajes(Long cantpeajes) {
        this.cantpeajes = cantpeajes;
    }

    public Long getCombustible() {
        return combustible;
    }

    public void setCombustible(Long combustible) {
        this.combustible = combustible;
    }

    public conductorEntity getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(conductorEntity idconductor) {
        this.idconductor = idconductor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

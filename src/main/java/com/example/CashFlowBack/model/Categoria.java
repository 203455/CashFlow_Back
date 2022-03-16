package com.example.CashFlowBack.model;

import javax.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;

    @Column(name = "Categoria")
    private String categoria;

    @Column(name = "SubCategoria")
    private String subCategoria;

    @Column(name = "Clasificacion")
    private String clasificacion;

    public Categoria() {
    }

    public Categoria(int idCategoria, String categoria, String subCategoria, String clasificacion) {
        this.idCategoria=idCategoria;
        this.categoria=categoria;
        this.subCategoria=subCategoria;
        this.clasificacion=clasificacion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

}

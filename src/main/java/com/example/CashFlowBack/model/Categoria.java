package com.example.CashFlowBack.model;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "subcategoria")
    private String subCategoria;

    @Column(name = "clasificacion")
    private String clasificacion;

    @JsonBackReference
    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY, cascade = CascadeType.DETACH, orphanRemoval = false)
    private Set<FlujoEfectivo> flujos;

    public Categoria() {
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

    public Set<FlujoEfectivo> getFlujos() { return flujos; }

    public void setFlujos(Set<FlujoEfectivo> flujos) { this.flujos = flujos; }

}

package com.example.CashFlowBack.model;

import javax.persistence.*;

@Entity
@Table(name = "banco")
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdBanco;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "monto")
    private Double monto;

    @Column(name = "nsemana")
    private int semana;

    @Column(name = "mes")
    private  String mes;

    public Banco() {
    }

    public Banco(int idBanco, String descripcion, Double monto, int semana, String mes) {
        IdBanco = idBanco;
        this.descripcion = descripcion;
        this.monto = monto;
        this.semana = semana;
        this.mes = mes;
    }

    public int getIdBanco() { return IdBanco; }

    public void setIdBanco(int idBanco) { IdBanco = idBanco; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Double getMonto() { return monto; }

    public void setMonto(Double monto) { this.monto = monto; }

    public int getSemana() { return semana; }

    public void setSemana(int semana) { this.semana = semana; }

    public String getMes() { return mes; }

    public void setMes(String mes) { this.mes = mes; }
}

package com.example.CashFlowBack.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "indicadorEfectivo")
public class IndicadorEfectivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdIndicador;

    @Column(name = "TipoCuenta")
    private String tipoCuenta;

    @Column(name = "RazonSocial")
    private String razonSocial;

    @Column(name = "Monto")
    private Double monto;

    @Column(name = "NSemana")
    private int semana;

    @Column(name = "Mes")
    private  String mes;


    public  IndicadorEfectivo(){}

    public IndicadorEfectivo(int IdIndicador, String tipoCuenta, String razonSocial, Double monto, int semana, String mes) {
        this.IdIndicador = IdIndicador;
        this.tipoCuenta = tipoCuenta;
        this.razonSocial = razonSocial;
        this.monto = monto;
        this.semana = semana;
        this.mes = mes;
    }

    public int getIdIndicador() {
        return IdIndicador;
    }

    public void setIdIndicador(int IdIndicador) {
        this.IdIndicador = IdIndicador;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}

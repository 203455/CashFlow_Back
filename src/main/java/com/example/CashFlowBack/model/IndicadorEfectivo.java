package com.example.CashFlowBack.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "IndicadorEfectivo")
public class IndicadorEfectivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int indicadorId;

    @Column(name = "TipoCuenta")
    private String tipoCuenta;

    @Column(name = "RazonSocial")
    private String razonSocial;

    @Column(name = "Monto")
    private Double monto;

    @Column(name = "NSemana")
    private int semana;


    public  IndicadorEfectivo(){}

    public IndicadorEfectivo(int indicadorId, String tipoCuenta, String razonSocial, Double monto, int semana) {
        this.indicadorId = indicadorId;
        this.tipoCuenta = tipoCuenta;
        this.razonSocial = razonSocial;
        this.monto = monto;
        this.semana = semana;
    }

    public int getIndicadorId() {
        return indicadorId;
    }

    public void setIndicadorId(int indicadorId) {
        this.indicadorId = indicadorId;
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
}

package com.example.CashFlowBack.model;

import javax.persistence.*;

@Entity
@Table(name = "flujoefectivo")
public class FlujoEfectivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFlujo;

    @Column(name = "flowtype")
    private String flowType;

    @Column(name = "date")
    private String date;

    @Column(name = "description")
    private String description;

    @Column(name = "amount")
    private double amount;

    @Column(name = "month")
    private String mes;

    @Column(name = "idcategoria")
    private int idcategoria;

    public FlujoEfectivo() {
    }

    public FlujoEfectivo(int idFlujo, String flowType, String date, String description, double amount,
                         String mes, int idcategoria) {
        this.idFlujo = idFlujo;
        this.flowType = flowType;
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.mes = mes;
        this.idcategoria = idcategoria;
    }

    public int getIdFlujo() { return idFlujo; }

    public void setIdFlujo(int idFlujo) { this.idFlujo = idFlujo; }

    public String getFlowType() { return flowType; }

    public void setFlowType(String flowType) { this.flowType = flowType; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public String getMes() { return mes; }

    public void setMes(String mes) { this.mes = mes; }

    public int getIdcategoria() { return idcategoria; }

    public void setIdcategoria(int idcategoria) { this.idcategoria = idcategoria; }
}

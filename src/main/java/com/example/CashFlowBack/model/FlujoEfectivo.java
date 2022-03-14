package com.example.CashFlowBack.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "FlujoEfectivo")
public class FlujoEfectivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_flujo;

    @Column(name = "FlowType")
    private String flowType;

    @Column(name = "Date")
    private int date;

    @Column(name = "Description")
    private String description;

    @Column(name = "Amount")
    private double amount;

    @JsonBackReference
    @ManyToOne (fetch = FetchType.LAZY, optional = false)
    @JoinColumn (name = "id_categoria", nullable = false)
    private Categoria categoria;


    public FlujoEfectivo(int id_flujo, String flowType, int date, String description, double amount, Categoria categoria) {
        this.id_flujo = id_flujo;
        this.flowType = flowType;
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.categoria = categoria;
    }

    public FlujoEfectivo() {
    }

    public int getId_flujo() { return id_flujo; }

    public void setId_flujo(int id_flujo) { this.id_flujo = id_flujo; }

    public String getFlowType() { return flowType; }

    public void setFlowType(String flowType) { this.flowType = flowType; }

    public int getDate() { return date; }

    public void setDate(int date) { this.date = date; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public Categoria getCategoria() { return categoria; }

    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}

package com.example.CashFlowBack.model;

import javax.persistence.*;

@Entity
@Table(name = "FlujoEfectivo")
public class FlujoEfectivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_flujo;

    @Column(name = "AccountType")
    private String accountType;

    @Column(name = "NWeek")
    private int nWeek;

    @Column(name = "BusinessName")
    private String businessName;

    @Column(name = "Amount")
    private double amount;

    public FlujoEfectivo(int id_flujo, String accountType, int nWeek, String businessName, double amount) {
        this.id_flujo = id_flujo;
        this.accountType = accountType;
        this.nWeek = nWeek;
        this.businessName = businessName;
        this.amount = amount;
    }

    public FlujoEfectivo() {

    }

    public int getId_flujo() { return id_flujo; }

    public void setId_flujo(int id_flujo) { this.id_flujo = id_flujo; }

    public String getAccountType() { return accountType; }

    public void setAccountType(String accountType) { this.accountType = accountType; }

    public int getnWeek() { return nWeek; }

    public void setnWeek(int nWeek) { this.nWeek = nWeek; }

    public String getBusinessName() { return businessName; }

    public void setBusinessName(String businessName) { this.businessName = businessName; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }
}

package com.wellsfargo.counselor.entity.investment;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "financial_advisor_id")
    private FinancialAdvisor financialAdvisor;

    // Constructors, Getters, Setters
    public Client() {}

    public Client(String name, FinancialAdvisor financialAdvisor) {
        this.name = name;
        this.financialAdvisor = financialAdvisor;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }
}

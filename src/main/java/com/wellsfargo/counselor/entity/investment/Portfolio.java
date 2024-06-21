package com.wellsfargo.counselor.entity.investment;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id")
    private List<Security> securities;

    // Constructors, Getters, Setters
    public Portfolio() {}

    public Long getId() {
        return id;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}

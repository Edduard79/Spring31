package com.example.Ex31ControllerProtection.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Salary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal amount;

    @OneToOne
    private User user;

    public Salary() {
    }

    public Salary(Long id, BigDecimal amount, User user) {
        this.id = id;
        this.amount = amount;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User userBase) {
        this.user = userBase;
    }

}

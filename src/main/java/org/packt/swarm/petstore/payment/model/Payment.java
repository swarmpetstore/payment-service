package org.packt.swarm.petstore.payment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

    public enum State {
        NEW, PAID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private int id;

    @Column
    private State state;

    @Column
    private int merchantId;

    @Column
    private int amount;

    @Column
    private String description;

    public Payment(int merchantId, int amount, String description){
        this.merchantId = merchantId;
        this.amount = amount;
        this.description = description;
        this.state = State.NEW;
    }

    public int getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}

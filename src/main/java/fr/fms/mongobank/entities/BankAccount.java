package fr.fms.mongobank.entities;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bankAccount")
public class BankAccount implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private Long _id;
    private Double balance;

    private Client client;

    private Collection<Transaction> transactions;

    public BankAccount() {

    }

    public BankAccount(Long _id, Double balance) {
        this._id = _id;
        this.balance = balance;
    }

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return _id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this._id = _id;
    }

    /**
     * @return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * @param balance the name to set
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    /*
     * Article not displayed to avoid errors
     */
    public String toString() {
        return "BankAccount [id=" + _id + ", balance=" + balance + "]";
    }

}

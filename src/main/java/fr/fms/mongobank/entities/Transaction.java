package fr.fms.mongobank.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class Transaction implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private String _id;
    private Double amount;

    // @ManyToOne
    private BankAccount bankAccount;

    public Transaction() {

    }

    public Transaction(String _id, Double amount) {
        this._id = _id;
        this.amount = amount;
    }

    public Transaction(Double amount) {
        this.amount = amount;
    }

    /**
     * @return the id
     */
    public String getId() {
        return _id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this._id = id;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    /*
     * Article not displayed to avoid errors
     */
    public String toString() {
        return "Transaction [id=" + _id + ", amount=" + amount + "]";
    }

}

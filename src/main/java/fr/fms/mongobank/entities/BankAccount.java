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
    private String _id;
    private Double balance;

    private Client client;

    private Collection<Transaction> transactions;

    public BankAccount() {

    }

    public BankAccount(String _id, Double balance) {
        this._id = _id;
        this.balance = balance;
    }

    public BankAccount(Double balance) {
        this.balance = balance;
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

    /**
     * @return the balance
     */
    public Collection<Transaction> getTransactions() {
        return this.transactions;
    }

    /**
     * @param balance the name to set
     */
    public void setBalance(Collection<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    /*
     * Article not displayed to avoid errors
     */
    public String toString() {
        return "BankAccount [id=" + _id + ", balance=" + balance + ", transactions=" + transactions + "]";
    }

    public void addTransaction(Transaction transaction){
        this.transactions.add(transaction);
    }

    public void updateTransaction(Transaction transaction){
        // this.transactions.add(transaction);
    }

    public void deleteTransaction(Transaction transaction){
        
    }
}

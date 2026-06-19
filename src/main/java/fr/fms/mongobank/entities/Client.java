package fr.fms.mongobank.entities;

// import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
public class Client{

    /**
     *
     */
    // private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private String lastname;
    private String firstname;

    private Collection<BankAccount> bankAccounts;

    public Client() {

    }

    public Client(long id, String lastname, String firstname) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public Client(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the brand to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the description to set
     */
    public void setDescription(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", lastname=" + lastname + ", description=" + firstname + ", price=" + firstname
                + "]";
    }
}

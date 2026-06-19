package fr.fms.mongobank.entities;

// import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document(collection = "client")
@Data
@AllArgsConstructor
public class Client{

    /**
     *
     */
    // private static final long serialVersionUID = 1L;

    @Id
    private String _id;
    private String lastname;
    private String firstname;

    private Collection<BankAccount> bankAccounts;

    public Client() {

    }

    public Client(String _id, String lastname, String firstname) {
        this._id = _id;
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
    public String getId() {
        return _id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String _id) {
        this._id = _id;
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
        return "Client [id=" + _id + ", lastname=" + lastname + ", description=" + firstname + ", price=" + firstname
                + "]";
    }
}

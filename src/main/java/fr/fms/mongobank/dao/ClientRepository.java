package fr.fms.mongobank.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import fr.fms.mongobank.entities.Client;

public interface ClientRepository extends MongoRepository<Client, Long> {
    @Query
    public List<Client> findByLastname(String lastname);

    @Query
    public List<Client> findByFirstname(String firstname);

    @Query
    public List<Client> findByLastnameAndFirstname(String lastname, String firstname);
}

package fr.fms.mongobank.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.fms.mongobank.entities.BankAccount;

public interface BankAccountRepository extends MongoRepository<BankAccount, Long> {
    // public List<BankAccount> findByName(String name);

    // public List<BankAccount> findByOrderByNameAsc();

    // public List<BankAccount> findByOrderByNameDesc();

}

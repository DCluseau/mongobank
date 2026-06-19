package fr.fms.mongobank.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.fms.mongobank.entities.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, Long> {

}

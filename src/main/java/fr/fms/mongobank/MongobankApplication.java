package fr.fms.mongobank;

import java.util.Collection;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import fr.fms.mongobank.dao.ClientRepository;
import fr.fms.mongobank.entities.Client;

@SpringBootApplication
@EnableMongoRepositories
public class MongobankApplication implements CommandLineRunner {
	private final ClientRepository clientRepository;

    public MongobankApplication(ClientRepository clientRepository){
		this.clientRepository = clientRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(MongobankApplication.class, args);
	}

	public void run(String... args) throws Exception {
		// @Autowired
		// ClientRepository clientRepository;

		// Client client = new Client("nom", "prénom");
		// Client savedClient = clientRepository.save(client);
		// System.out.println("Test : Client bien inséré en base !");
		// System.out.println("ID généré : " + savedClient.getId());

		Collection<Client> clients;

		clients = clientRepository.findAll();

		for (Client client : clients) {
			System.out.println(client);
		}

	}
}

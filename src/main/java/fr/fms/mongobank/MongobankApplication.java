package fr.fms.mongobank;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import fr.fms.mongobank.dao.ClientRepository;
import fr.fms.mongobank.entities.Client;

@SpringBootApplication
@EnableMongoRepositories
public class MongobankApplication {
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

		Client client = new Client("nom", "prénom");
		clientRepository.save(client);

	}
}

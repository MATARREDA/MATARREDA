package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
//import cigma.pfe.repositories.ClientRepositoryImpl;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientServiceImpl implements ClientService{
	ClientRepository ClientRepository;
	public void setClientRepository(ClientRepository ClientRepository) {
		this.ClientRepository = ClientRepository;
	}
	//ClientRepository clientRepository = new ClientRepositoryImpl();
	@Override
	public Client save(Client c) {
	System.out.println("Service Layer : ClientServiceImpl Level... ");
	return ClientRepository.save(c);
	}
	

}
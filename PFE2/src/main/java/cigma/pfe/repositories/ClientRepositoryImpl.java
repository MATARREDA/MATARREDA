package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository{

	ClientRepository clientRepository ;
	public ClientRepositoryImpl(ClientRepository clientRepository) {
	System.out.println("Call ClientServiceImpl with ClientRepository param....");
	this.clientRepository = clientRepository;
	}
	@Override
	public Client save(Client c) {
	System.out.println("DAO Layer : ClientRepositoryImpl Level");
	System.out.print(c);
	return null;
	}

}

package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository{


	@Override
	public Client save(Client c) {
	System.out.println("DAO Layer : ClientRepositoryImpl Level");
	System.out.print(c);
	return null;
	}

}

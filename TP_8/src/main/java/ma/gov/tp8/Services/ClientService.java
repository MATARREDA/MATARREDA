package ma.gov.tp8.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ma.gov.tp8.DAO.IClientDAO;
import ma.gov.tp8.models.Client;

@Service
public class ClientService implements IClientService {

	@Autowired
	IClientDAO clientDAO;

	public ClientService() {
		System.out.println("creation bean service");
		}

	@Override
	public Client save(Client clr1) {
		return clientDAO.save(clr1);
	}

}

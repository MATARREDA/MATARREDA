package ma.gov.tp8.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.tp8.DAO.IClientDAO;
import ma.gov.tp8.models.Client;

@Service
public abstract class ClientService implements IClientService {

	@Autowired
	IClientDAO clientDAO;

	public ClientService() {
		System.out.println("creation bean service");
		}

	@Override
	public Client save(Client clr1) {
		return clientDAO.save(clr1);
	}
	
	@Override
	@Transactional
	public Client modify(Client newClt) {
	Client oldClt = clientDAO.findById(newClt.getId()).get();
	oldClt.setName(newClt.getName());
	return clientDAO.save(oldClt);
	}
	@Override
	@Transactional
	public void remove(long idClt) {
		clientDAO.deleteById(idClt);
	}
	@Override
	public Client getOne(long idClt) {
	return clientDAO.findById(idClt).get();
	}
	@Override
	public List<Client> getAll() {
	return (List<Client>) clientDAO.findAll();
	}

}

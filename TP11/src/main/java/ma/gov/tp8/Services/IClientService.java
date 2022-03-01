package ma.gov.tp8.Services;

import java.util.List;

import ma.gov.tp8.models.Client;

public interface IClientService {
	public Client save(Client clr1);
	Client modify(Client clt);
	void remove(long idClt);
	Client getOne(long idClt);
	List<Client> getAll();
}

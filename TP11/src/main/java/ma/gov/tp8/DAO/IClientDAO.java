package ma.gov.tp8.DAO;

import org.springframework.data.repository.CrudRepository;

import ma.gov.tp8.models.Client;

public interface IClientDAO extends CrudRepository<Client,Long>{
	@SuppressWarnings("unchecked")
	public Client save(Client c);
}

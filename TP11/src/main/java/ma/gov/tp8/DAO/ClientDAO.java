package ma.gov.tp8.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.tp8.models.Client;

@Repository

public abstract class ClientDAO implements IClientDAO {

	IClientDAO clientDAO;

	
	// EntityManagerFactory emf = Persistence.createEntityManagerFactory("clients");
	// EntityManager em = emf.createEntityManager();
	@PersistenceContext
	private EntityManager entityManagerFactory;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Client save(Client c) {
		System.out.println("DAO Layer : ClientRepositoryImpl Level");
		// em.getTransaction().begin();
		entityManagerFactory.persist(c);
		// em.getTransaction().commit();
		return null;
	}

	public ClientDAO() {
		System.out.println("Call ClientRepositoryImpl ....");
	}

}

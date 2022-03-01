package ma.gov.tp8.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ma.gov.tp8.Services.IClientService;
import ma.gov.tp8.models.Client;

@Controller("clr1")
public class ClientController {
	@Autowired
	IClientService clientService;


	public void save(Client c) {
	  clientService.save(c);
	}

	public ClientController() {
		System.out.println("creation bean controller");
		}
	public Client modify(Client clt) {
		return clientService.modify(clt);
		} public void remove(long idClt) {
			clientService.remove(idClt);
		} public Client getOne(long idClt) {
		return clientService.getOne(idClt);
		} public List<Client> getAll() {
		return clientService.getAll();
		}

}

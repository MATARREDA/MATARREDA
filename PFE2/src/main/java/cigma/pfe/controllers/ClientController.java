package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
//import cigma.pfe.services.ClientServiceImpl;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController {
	
		ClientService clientService;
		public void setClientService(ClientService clientService) {
		this.clientService = clientService;
		System.out.println("Call ClientController with clientService param....");
		
		}

	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	//ClientService clientService = (ClientService) new ClientServiceImpl();
	public Client save(Client c ){
	System.out.println("ClientController level...");
	return clientService.save(c);
	}
	public ClientController() {
		System.out.println("Call ClientController ....");
		}
	 public void ClientServiceImpl() {
		 System.out.println("Call ClientServiceImpl ....");
				 }

	 }


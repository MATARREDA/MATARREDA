package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("controller");
		// ClientController ctrl1 = new ClientController();
		// Client client =new Client(1L,"testing");
		Client client = new Client(1, "ALAMI");
		ctrl.save(client);
	}
}
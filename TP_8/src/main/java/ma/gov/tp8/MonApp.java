package ma.gov.tp8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Data;
import ma.gov.tp8.controllers.ClientController;
import ma.gov.tp8.models.Client;

@Data
public class MonApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController clr1 = (ClientController)context.getBean("clr1");
		  Client clt1 = new Client("ILHAM");
		  clr1.save(clt1);
	} 
}

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
		  Client clt1 = new Client("REDA");
		  Client clt2 = new Client("PEDRO");
		  Client clt3 = new Client("BUIZ");
		  clr1.save(clt1);
		  clr1.save(clt2);
		  clr1.save(clt3);
		  
		// Test2 => getAll Clients before modify and remove
		  //((Object) clt1.getAll()).stream().forEach(i-> System.out.println(i));
		  
		  System.out.println(clr1.getOne(1));
		  
		// Test4 => modify Client service
		  clt1.setName("Hassan");
		  clr1.modify(clt1);
		// Test5 => remove Client service
		  clt1.remove(2);
		  
		 // clt1.getAll().stream().forEach(i-> System.out.println(i));
	} 
}

package ma.gov.tp8.models;

import javax.persistence.*;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Client(String name) {
		super();
		this.name = name;
	}


	public Client(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Object getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}

}

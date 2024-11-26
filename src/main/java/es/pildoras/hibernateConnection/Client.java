package es.pildoras.hibernateConnection;

import javax.persistence.*;

@Entity
@Table(name="client")
public class Client {
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private ClientDetails clientDetails;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura autoincremento
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="secondName")
	private String secondName;
	
	@Column(name="direction")
	private String direction;
	
	
	
	
	public Client(String name, String secondName, String direction) {
		this.name = name;
		this.secondName = secondName;
		this.direction = direction;
	}

	public Client() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public ClientDetails getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", secondName=" + secondName + ", direction=" + direction + "]";
	}
	
	
	
	


}

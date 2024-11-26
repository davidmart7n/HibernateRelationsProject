package es.pildoras.hibernateConnection;

import javax.persistence.*;

@Entity
@Table(name="client_details")
public class ClientDetails {
	
	
	@OneToOne(mappedBy="clientDetails")
	private Client theClient;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura autoincremento
	@Column(name="id")
	private int id;
	
	@Column(name="web")
	private String web;
	
	@Column(name="tlphone")
	private String tlphone;
	
	@Column(name="comments")
	private String comments;
	
	public ClientDetails() {
	}
	
	public Client getTheClient() {
		return theClient;
	}



	public void setTheClient(Client theClient) {
		this.theClient = theClient;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public ClientDetails(String web, String tlphone, String comments) {
		this.web = web;
		this.tlphone = tlphone;
		this.comments = comments;
	}


	public String getWeb() {
		return web;
	}


	public void setWeb(String web) {
		this.web = web;
	}


	public String getTlphone() {
		return tlphone;
	}


	public void setTlphone(String tlphone) {
		this.tlphone = tlphone;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "ClientDetails [id=" + id + ", web=" + web + ", tlphone=" + tlphone + ", comments=" + comments + "]";
	}
	
	


}

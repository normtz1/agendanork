package mx.com.agendanork.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMAIL")
public class Email implements Serializable{

	private static final long serialVersionUID = 2348426386340001873L;
	
	@EmbeddedId
	private EmailPK id;

	@Column(name="EMAIL")
	private String email;
	
	@Column(name="DESCRIPCION")
	private String descripcion;

	public EmailPK getId() {
		return id;
	}

	public void setId(EmailPK id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
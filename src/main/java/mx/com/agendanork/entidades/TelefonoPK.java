package mx.com.agendanork.entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TelefonoPK implements Serializable{
	
	private static final long serialVersionUID = -6001157694619627120L;

	private Long idTelefono;
	
	private Agenda idAgenda;

	public Long getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(Long idTelefono) {
		this.idTelefono = idTelefono;
	}

	public Agenda getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Agenda idAgenda) {
		this.idAgenda = idAgenda;
	}
	
}

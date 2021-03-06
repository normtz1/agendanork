package mx.com.agendanork.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;

@Embeddable
public class TelefonoPK implements Serializable{
	
	private static final long serialVersionUID = -6001157694619627120L;
	
	@Column(name = "ID_TELEFONO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTelefono;
	
	@JoinColumn(name = "ID_AGENDA", referencedColumnName = "ID_AGENDA")
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

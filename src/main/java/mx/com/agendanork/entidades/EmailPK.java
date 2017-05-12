package mx.com.agendanork.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;

@Embeddable
public class EmailPK implements Serializable{

	private static final long serialVersionUID = -6072294766280351558L;

	@Column(name = "ID_EMAIL")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmail;
	
	@JoinColumn(name = "ID_AGENDA", referencedColumnName = "ID_AGENDA")
	private Agenda idAgenda;

	public Long getIdEmail() {
		return idEmail;
	}

	public void setIdEmail(Long idEmail) {
		this.idEmail = idEmail;
	}

	public Agenda getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Agenda idAgenda) {
		this.idAgenda = idAgenda;
	}
	
}
package mx.com.agendanork.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONO")
public class Telefono implements Serializable{ 
	
	private static final long serialVersionUID = -5386404396941014015L;
	
	@EmbeddedId
	private TelefonoPK id;

	@Column(name="TELEFONO")
	private String telefono;
	
	@OneToOne
	@JoinColumn(name = "ID_TIPO_TEL", referencedColumnName = "ID_TIPO_TEL")
	private TipoTelefono idTipoTel;
	
	@Column(name="EXTENSION")
	private String extension;
	
	@Column(name="LADA")
	private String lada;

	public TelefonoPK getId() {
		return id;
	}

	public void setId(TelefonoPK id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public TipoTelefono getIdTipoTel() {
		return idTipoTel;
	}

	public void setIdTipoTel(TipoTelefono idTipoTel) {
		this.idTipoTel = idTipoTel;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getLada() {
		return lada;
	}

	public void setLada(String lada) {
		this.lada = lada;
	}
	
}
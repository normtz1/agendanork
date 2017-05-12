package mx.com.agendanork.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="TIPO_TELEFONO")
public class TipoTelefono implements Serializable{

	
	private static final long serialVersionUID = 6011463111135533336L;

	@Id
	@Column(name = "ID_TIPO_TEL")
	@GeneratedValue
	private Long idTipoTel;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="DESCRIPCION")
	private String descripcion;

	public Long getIdTipoTel() {
		return idTipoTel;
	}

	public void setIdTipoTel(Long idTipoTel) {
		this.idTipoTel = idTipoTel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}

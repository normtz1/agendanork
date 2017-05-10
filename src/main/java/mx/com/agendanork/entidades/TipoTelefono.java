package mx.com.agendanork.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="TIPO_TELEFONO")
public class TipoTelefono implements Serializable{

	@Id
	private Long idTipoTel;
	
	@Column()
	private String nombre;
	
	private String descripcion;
}

package mx.com.agendanork.entidades;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity(name = "TELEFONO")
public class Telefono implements Serializable{ 
	
	private static final long serialVersionUID = -5386404396941014015L;
	
	@EmbeddedId
	private TelefonoPK id;

	private String telefono;
	
	@JoinColumn()
	private TipoTelefono idTipoTel;
	
	
}
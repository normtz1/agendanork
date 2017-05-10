package mx.com.agendanork.entidades;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "TELEFONO")
public class Telefono implements Serializable{ 
	
	private static final long serialVersionUID = -5386404396941014015L;
	
	@EmbeddedId
	private TelefonoPK id;

	private String telefono;
	
	private TipoTelefono
	
	
}
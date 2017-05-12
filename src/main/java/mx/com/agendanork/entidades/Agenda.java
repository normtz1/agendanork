package mx.com.agendanork.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AGENDA")
public class Agenda implements Serializable{
	
	private static final long serialVersionUID = -3231115737354429773L;

	private static int n = 0;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_AGENDA")
	private Long idAgenda;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "AP_PATERNO")
	private String apPaterno;
	
	@Column(name = "AP_MATERNO")
	private String apMaterno;
	
	@Column(name = "DIRECCION")
	private String direccion;
	
	@Column(name = "FECHA_CUMPLE")
	private Date fechaCumple;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="id.idAgenda")
	private List<Telefono> listTelefonos = new ArrayList<Telefono>();
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="id.idAgenda")
	private List<Email> listEmails = new ArrayList<Email>();

	@Column(name = "ANOTACIONES")
	private String anotaciones;
	
	
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Price [date=");
		builder.append(date);
		builder.append(", price=");
		builder.append(price);
		builder.append(", market=");
		builder.append(market);
		builder.append(", instrument=");
		builder.append(instrument);
		builder.append("]");
		return builder.toString();
	}

	private static Agenda create(int instr, int numberOfUpdates) {
		Agenda p = new Agenda("Market " + (instr % 100), "Instrument " + instr);
		p.date.setTime(numberOfUpdates);
		p.price = instr + 1.1;
		return p;
	}

	public static Agenda create(int i) {
		return Agenda.create(i, n++);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((instrument == null) ? 0 : instrument.hashCode());
		result = prime * result + ((market == null) ? 0 : market.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Agenda)) {
			return false;
		}
		Agenda other = (Agenda) obj;
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (instrument == null) {
			if (other.instrument != null) {
				return false;
			}
		} else if (!instrument.equals(other.instrument)) {
			return false;
		}
		if (market == null) {
			if (other.market != null) {
				return false;
			}
		} else if (!market.equals(other.market)) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		return true;
	}

}

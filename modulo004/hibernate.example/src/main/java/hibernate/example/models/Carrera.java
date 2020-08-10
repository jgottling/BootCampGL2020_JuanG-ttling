package hibernate.example.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Carrera", uniqueConstraints = {
		@UniqueConstraint(columnNames = "carrera_id")})
public class Carrera {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="carrera_id", unique = true, nullable = false)
	private Long id;
	
	@Column(name="fecha", nullable = false)
	private Date fecha;
	
	@Column(name="nombre", unique= true, nullable = false)
	private String nombre;
	
	@OneToMany(mappedBy = "carrera", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Corredor> competidores;
	
	public Carrera() {
		this.competidores = new HashSet<Corredor>();
	}

	public Carrera(Date fecha, String nombre) {
		this.fecha = fecha;
		this.nombre = nombre;
		this.competidores = new HashSet<Corredor>();
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Corredor> getCorredores() {
		return competidores;
	}

	public void setCompetidores(Set<Corredor> competidores) {
		this.competidores = competidores;
	}
	
	public void addCompetidor(Corredor corredor) {
		this.competidores.add(corredor);
		corredor.anotarEnCarrera(this);
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Carrera: {fecha: " + fecha + ", nombre: " + nombre + ", competidores: [" + printCompetidores() + "]}";
	}
	
	private String printCompetidores() {
		String competidoresString = "";
		
		if (this.competidores != null) {
			for(Corredor competidor: this.competidores) {
				
				competidoresString += competidor.toString() + ", ";
			};
		}
		
		return competidoresString;
	}
}

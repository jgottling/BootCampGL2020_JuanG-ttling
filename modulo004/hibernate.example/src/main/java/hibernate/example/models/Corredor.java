package hibernate.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Corredor", uniqueConstraints = {
		@UniqueConstraint(columnNames = "corredor_id")})
public class Corredor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="corredor_id", unique = true, nullable = false)
	private Long id;
	
	@Column(name="numero_auto")
	private int numeroAuto;

	@Column(name="nombre_corredor", nullable = false)
	private String nombre;
	

    @ManyToOne(fetch = FetchType.EAGER)
	private Carrera carrera;
    
    public Corredor() {}

	public Corredor(int numeroAuto, String nombre) {
		super();
		this.numeroAuto = numeroAuto;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroAuto() {
		return numeroAuto;
	}

	public void setNumeroAuto(int numeroAuto) {
		this.numeroAuto = numeroAuto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void anotarEnCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "{número:" + numeroAuto + ", Nombre:" + nombre + "}";
	}
}

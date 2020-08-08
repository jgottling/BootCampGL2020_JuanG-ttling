package hibernate.example.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Menu")
public class Menu {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="menu_id")
	private Long id;
	
	@Column(name="nombre", insertable=true, updatable=true, unique=false)
	private String nombre;
	
	@Column(name="descripcion", insertable=true, updatable=true, unique=false)
	private String descripcion;
	
	
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        }, fetch=FetchType.EAGER)
        @JoinTable(
        	name = "menu_plato",
            joinColumns = {@JoinColumn(name = "menu_id")},
            inverseJoinColumns = {@JoinColumn(name = "plato_id")}
        )
	private List<Plato> platos;

    public Menu() {
    	platos = new ArrayList<Plato>();
    }

	
	public Menu(String nombre, String descripcion) {
		platos = new ArrayList<Plato>();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public Menu(Long id, List<Plato> platos, String nombre, String descripcion) {
		this.id = id;
		this.platos = platos;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void addPlato(Plato plato) {
		this.platos.add(plato);
		plato.addMenu(this);
	}
	
	public double getPrecio() {
		return platos.stream().mapToDouble(plato -> plato.getPrecio()).sum();
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
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}

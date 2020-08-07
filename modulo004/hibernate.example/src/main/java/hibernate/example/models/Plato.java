package hibernate.example.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Plato")
public class Plato {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="plato_id")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precio")
	private double precio;
	
	@ManyToMany(mappedBy = "platos")
	private List<Menu> menus;

	public Plato() {
		menus = new ArrayList<Menu>();
	}
	
	public Plato(String nombre, String descripcion, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		
		menus = new ArrayList<Menu>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void addMenu(Menu menu) {
		this.menus.add(menu);		
	}
	
	
	@Override
	public String toString() {
		return "Plato [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", menus=" + menus + "]";
	}
}

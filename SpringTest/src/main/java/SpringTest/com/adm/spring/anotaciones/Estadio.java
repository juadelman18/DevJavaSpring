package SpringTest.com.adm.spring.anotaciones;
//TODO Clase define un estadio
public class Estadio {
	
	private String nombre;
	private int capacidad;

	public Estadio() {
		
	}

	public Estadio(String nombre, int capacidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	

}

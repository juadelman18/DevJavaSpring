package SpringTest.com.adm.spring.anotaciones;
//TODO Auto-generated constructor stub
public class Arbitro {
	
	private String nombre;
	private String pais;
	
	public Arbitro() {
		
	}

	public Arbitro(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Partido [nombre=" + nombre + ", pais=" + pais + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	

}

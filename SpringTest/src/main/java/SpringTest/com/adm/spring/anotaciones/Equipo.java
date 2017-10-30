/**
 * 
 */
package SpringTest.com.adm.spring.anotaciones;

import java.util.Hashtable;
import java.util.Date;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author adelgado
 *
 */
//TODO Clase que define un equipo
public class Equipo {

	private String nombre;
	private Hashtable<Integer,Jugador> jugadores;
	@Autowired
	@Qualifier("estadioEquipo")
	private Estadio estadioLocal;
	
	public Equipo() {
		
	}

	public Equipo(String nombre, Hashtable<Integer, Jugador> jugadores, Estadio estadioLocal) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
		this.estadioLocal = estadioLocal;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + "\n"  + ", jugadores=" + jugadores.toString() 
				+ "\n"  + ", estadioLocal=" + estadioLocal + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Hashtable<Integer, Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Hashtable<Integer, Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Estadio getEstadioLocal() {
		return estadioLocal;
	}

	public void setEstadioLocal(Estadio estadioLocal) {
		this.estadioLocal = estadioLocal;
	}
	
	
	
	

}

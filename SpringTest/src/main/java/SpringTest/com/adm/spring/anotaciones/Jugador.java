/**
 * 
 */
package SpringTest.com.adm.spring.anotaciones;

import java.util.Random;
/**
 * @author adelgado
 *
 */
public class Jugador {

	/**
	 * Representa un jugador de un Equipo
	 */
	private String nombre;
	private int dorsal;
	private String posicion;
	private int tiros;
	private int regates;
	private int pases;
	private Random  aleatorio = new Random();

	
	public Jugador() {
		init();
	
	}

	public Jugador(String nombre, int dorsal, String posicion) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = posicion;
		
	}
	public void init() {
		
		this.tiros=aleatorio.nextInt(6)+1;
		this.pases=aleatorio.nextInt(6)+1;
		this.regates=aleatorio.nextInt(6)+1;
	
	}

	@Override

	public String toString() {
		
		return "Jugador: " + " \n " + " [nombre=" + nombre + ", dorsal=" + dorsal + ", posicion=" + posicion + ", tiros=" + tiros
				+ ", regates=" + regates + ", pases=" + pases + ", aleatorio=" + aleatorio + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getTiros() {
		return tiros;
	}

	public void setTiros(int tiros) {
		this.tiros = tiros;
	}

	public int getRegates() {
		return regates;
	}

	public void setRegates(int regates) {
		this.regates = regates;
	}

	public int getPases() {
		return pases;
	}

	public void setPases(int pases) {
		this.pases = pases;
	}

	public Random getAleatorio() {
		return aleatorio;
	}

	public void setAleatorio(Random aleatorio) {
		this.aleatorio = aleatorio;
	}
	
	
	
}

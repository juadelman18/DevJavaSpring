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
	private Random  aleatorio;
	
	
	public Jugador() {
	
	}

	public Jugador(String nombre, int dorsal, String posicion) {
		super();
		Random randomGenerator = new Random();
		int aleatorio = randomGenerator.nextInt(6);
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.tiros=aleatorio+1;
		this.pases=aleatorio+1;
		this.regates=aleatorio+1;
		System.out.println(tiros);
	}
	public void init() {
		
		this.tiros=aleatorio.nextInt(6)+1;
		this.pases=aleatorio.nextInt(6)+1;
		this.regates=aleatorio.nextInt(6)+1;
		System.out.println(tiros);
	}

	@Override

	public String toString() {
		Random randomGenerator = new Random();
		int aleatorio = randomGenerator.nextInt(6);
		int valor=this.aleatorio.nextInt(6)+1;
		System.out.println(valor);
		//this.tiros=this.setTiros(this.aleatorio.nextInt(6)+1);
		//this.pases=aleatorio.nextInt(6)+1;
		//this.regates=aleatorio.nextInt(6)+1;
		
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

package SpringTest.com.adm.spring.anotaciones;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//TODO Clase define un arbitro
public class Partido {

	@Autowired
	@Qualifier("madrid")
	private Equipo elocal;
	@Autowired
	@Qualifier("barza")
	private Equipo evistante;
	@Autowired
	@Qualifier("arbitroPrincipal")
	private Arbitro arbitro1;
	@Qualifier("arbitroLinea")
	private Arbitro arbitro2;
	@Autowired
	private Estadio estadioLocal;
	
	private Date fecha;
	private int marcadorLocal;
	private int marcadorVisitante;
	
	public Partido() {
		
	}
	
	public String outcome() {
		return elocal.getNombre()+" : "+marcadorLocal+" - " + evistante.getNombre() + " : " + marcadorVisitante ;
	}

	@Override
	public String toString() {
		String loca=elocal.getNombre();
		String loca2=evistante.getNombre();
		return "Partido [Local="+loca + " vs " + "Visitante=" + loca2 + "]" + "\n" + "Lugar : [ "+ estadioLocal +"]"+ "\n" + 
				"Alineaciones: ["+ elocal.toString() +"]";
		
		/*
		return "Partido [Local=" + elocal + "\n"  + ", Vistante=" + evistante + "\n"  + ", arbitro Principal=" + arbitro1 + "\n"  + ", arbitro Linea=" + arbitro2 + "\n"  +", estadioLocal="
				+ estadioLocal + "\n"  + ", fecha=" + fecha + "\n"  + ", marcadorLocal=" + marcadorLocal + "\n"  + ", marcadorVisitante="
				+ marcadorVisitante + "]";*/
	}

	public Equipo getElocal() {
		return elocal;
	}

	public void setElocal(Equipo elocal) {
		this.elocal = elocal;
	}

	public Equipo getEvistante() {
		return evistante;
	}

	public void setEvistante(Equipo evistante) {
		this.evistante = evistante;
	}

	public Arbitro getArbitro1() {
		return arbitro1;
	}

	public void setArbitro1(Arbitro arbitro1) {
		this.arbitro1 = arbitro1;
	}

	public Arbitro getArbitro2() {
		return arbitro2;
	}

	public void setArbitro2(Arbitro arbitro2) {
		this.arbitro2 = arbitro2;
	}

	public Estadio getEstadioLocal() {
		return estadioLocal;
	}

	public void setEstadioLocal(Estadio estadioLocal) {
		this.estadioLocal = estadioLocal;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getMarcadorLocal() {
		return marcadorLocal;
	}

	public void setMarcadorLocal(int marcadorLocal) {
		this.marcadorLocal = marcadorLocal;
	}

	public int getMarcadorVisitante() {
		return marcadorVisitante;
	}

	public void setMarcadorVisitante(int marcadorVisitante) {
		this.marcadorVisitante = marcadorVisitante;
	}

}

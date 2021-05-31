package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{

	private String tipoDeAtleta;
	private TipoDeBicicleta tipo;
	private Integer cantidadDeKilometrosEntrenados;

	public Triatleta(Integer numeroDeSocio, String nombre, String tipoDeAtleta, TipoDeBicicleta tipo) {
		super(numeroDeSocio, nombre);
		this.setTipoDeAtleta(tipoDeAtleta);
		setTipo(tipo);
		cantidadDeKilometrosEntrenados= 0;
	}

	public String getTipoDeAtleta() {
		return tipoDeAtleta;
	}

	public void setTipoDeAtleta(String tipoDeAtleta) {
		this.tipoDeAtleta = tipoDeAtleta;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipo;
	}

	public void setTipo(TipoDeBicicleta tipo) {
		this.tipo = tipo;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados= km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	


	

	


}

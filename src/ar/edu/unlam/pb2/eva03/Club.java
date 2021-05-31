package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

public class Club {

	private String nombre;
	private Set<Deportista> socios = new HashSet<Deportista>();

	public Club(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public Boolean agregarDeportista(Deportista nuevo) {
		if (existe(nuevo)) {
			return false;

		} else {
			this.socios.add(nuevo);
			return true;
		}
	}

	public Boolean existe(Deportista aBuscar) {
		for (Deportista actual : socios) {
			if (actual.equals(aBuscar)) {
				return true;
			}
		}
		return false;
	}

}

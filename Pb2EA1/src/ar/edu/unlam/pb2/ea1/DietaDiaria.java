package ar.edu.unlam.pb2.ea1;

import java.util.HashSet;

public class DietaDiaria {

	/**
	 * No se permite repetir platos duarante todo el día.
	 */
	private HashSet<Plato> platos;
	private final Integer CANTIDAD_DE_SAL = 3;
	private final Integer CANTIDAD_DE_AZUCAR = 25;

	public DietaDiaria() {
		super();
		platos = new HashSet<>();
	}

	public Boolean ingresarPlatoAlADieta(Plato plato) {

		return platos.add(plato);
	}

	private Integer totalDeSalEnDieta() {
		Integer totalDeSal = 0;

		for (Plato plato : platos) {
			totalDeSal += plato.obtenerCantidadaDeSal();
		}

		return totalDeSal;
	}

	private Integer totalDeAzucarEnDieta() {
		Integer totalDeAzucar = 0;

		for (Plato plato : platos) {
			totalDeAzucar += plato.obtenerCantidadDeAzucar();
		}

		return totalDeAzucar;
	}

	public Boolean aptaHipertenso() {

		Boolean esApta = false;

		if (this.totalDeSalEnDieta() < this.CANTIDAD_DE_SAL) {

			esApta = true;
		}

		return esApta;

	}

	public Boolean aptaDiabetico() {
		Boolean esApta = false;

		if (this.totalDeAzucarEnDieta() < this.CANTIDAD_DE_AZUCAR) {

			esApta = true;
		}

		return esApta;
	}

	public HashSet<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(HashSet<Plato> platos) {
		this.platos = platos;
	}

	public Integer getCANTIDAD_DE_SAL() {
		return CANTIDAD_DE_SAL;
	}

	public Integer getCANTIDAD_DE_AZUCAR() {
		return CANTIDAD_DE_AZUCAR;
	}
	
	
}

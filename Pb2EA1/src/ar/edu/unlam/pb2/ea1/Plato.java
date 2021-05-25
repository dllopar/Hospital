package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public class Plato {

	/**
	 * Por ejemplo, si para un Plato se necesitan DOS (2) tomates, se deberá agregar
	 * DOS(2) unidades de tomate.
	 */
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	public Boolean agregarIngredienteAlPlato(Ingrediente ingrediente) {
		
		return ingredientes.add(ingrediente);
	}

	public Integer obtenerCantidadaDeSal() {
		Integer cantidadDeSal = 0;
		for (Ingrediente ingrediente : ingredientes) {
			cantidadDeSal += ingrediente.getCantidadSal();
		}

		return cantidadDeSal;
	}

	public Integer obtenerCantidadDeAzucar() {
		Integer cantidadDeAzucar = 0;
		for (Ingrediente ingrediente : ingredientes) {
			cantidadDeAzucar += ingrediente.getCantidadAzucar();
		}

		return cantidadDeAzucar;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
}

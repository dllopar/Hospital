package ar.edu.unlam.pb2.ea1;

public class Hipertenso extends Paciente {

	private Integer prensionMinima;
	private Integer presionMaxima;

	public Hipertenso(String nombre, String apellido, Integer dni, Integer presionMinima, Integer presionMaxima) {
		super(nombre, apellido, dni);
		this.prensionMinima = presionMinima;
		this.presionMaxima = presionMaxima;
	}

	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {
		// Control de dieta para un Hipertenso

		if (dieta.aptaHipertenso()) {
			super.getIngesta().add(dieta);
		}else {
			super.getIngesta().remove(dieta);
		}

	}

}

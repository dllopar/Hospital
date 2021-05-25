package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PacienteTest {
	
	@Test
	public void testQueUnDiabeticoIngesteDietaAptaParaDiabetico() {
		Plato bifeYEnsalada = new Plato();
		Ingrediente tomate = new Ingrediente("tomate", 0, 3);
		Ingrediente carne = new Ingrediente("carne", 2, 3);
		
		bifeYEnsalada.agregarIngredienteAlPlato(tomate);
		bifeYEnsalada.agregarIngredienteAlPlato(tomate);
		bifeYEnsalada.agregarIngredienteAlPlato(carne);
		
		Plato risoto = new Plato();
		Ingrediente arroz = new Ingrediente("arroz", 1,2);
		Ingrediente pollo = new Ingrediente("pollo", 1, 6);
		
		risoto.agregarIngredienteAlPlato(arroz);
		risoto.agregarIngredienteAlPlato(pollo);
		
		DietaDiaria nuevaDieta = new DietaDiaria();
		
		nuevaDieta.ingresarPlatoAlADieta(risoto);
		nuevaDieta.ingresarPlatoAlADieta(bifeYEnsalada);
		
		Paciente diabetico = new Diabetico("martin","lopez",555666, 3);
		diabetico.agregarDietaDiaria(nuevaDieta);
		//Integer esperado=9;
		//Integer actual = risoto.obtenerCantidadDeAzucar();
		
		//assertTrue(nuevaDieta.aptaDiabetico());
		
		Integer esperado = 1;
		Integer actual= diabetico.getIngesta().size();
		
		assertEquals(actual, esperado);


		

	}
	@Test
	public void testQueUnDiabeticoNoIngesteDietaAptaParaDiabetico() {

		Plato bifeYEnsalada = new Plato();
		Ingrediente tomate = new Ingrediente("tomate", 0, 3);
		Ingrediente carne = new Ingrediente("carne", 2, 3);
		
		bifeYEnsalada.agregarIngredienteAlPlato(tomate);
		bifeYEnsalada.agregarIngredienteAlPlato(tomate);
		bifeYEnsalada.agregarIngredienteAlPlato(carne);
		
		Plato risoto = new Plato();
		Ingrediente arroz = new Ingrediente("arroz", 1,2);
		Ingrediente pollo = new Ingrediente("pollo", 1, 60);
		
		risoto.agregarIngredienteAlPlato(arroz);
		risoto.agregarIngredienteAlPlato(pollo);
		
		DietaDiaria nuevaDieta = new DietaDiaria();
		
		nuevaDieta.ingresarPlatoAlADieta(risoto);
		nuevaDieta.ingresarPlatoAlADieta(bifeYEnsalada);
		
		Paciente diabetico = new Diabetico("martin","lopez",555666, 3);
		diabetico.agregarDietaDiaria(nuevaDieta);
		//Integer esperado=9;
		//Integer actual = risoto.obtenerCantidadDeAzucar();
		
		//assertTrue(nuevaDieta.aptaDiabetico());
		
		Integer esperado = 0;
		Integer actual= diabetico.getIngesta().size();
		
		assertEquals(actual, esperado);

	}

	@Test
	public void testQueUnHipertendoIngesteDietaAptaParaHipertenso() {
		
		Plato bifeYEnsalada = new Plato();
		Ingrediente tomate = new Ingrediente("tomate", 0, 3);
		Ingrediente carne = new Ingrediente("carne", 0, 3);
		
		bifeYEnsalada.agregarIngredienteAlPlato(tomate);
		bifeYEnsalada.agregarIngredienteAlPlato(tomate);
		bifeYEnsalada.agregarIngredienteAlPlato(carne);
		
		Plato risoto = new Plato();
		Ingrediente arroz = new Ingrediente("arroz", 1,2);
		Ingrediente pollo = new Ingrediente("pollo", 1, 6);
		
		risoto.agregarIngredienteAlPlato(arroz);
		risoto.agregarIngredienteAlPlato(pollo);
		
		DietaDiaria nuevaDieta = new DietaDiaria();
		
		nuevaDieta.ingresarPlatoAlADieta(risoto);
		nuevaDieta.ingresarPlatoAlADieta(bifeYEnsalada);
		
		Paciente hipertenso = new Hipertenso("martin","lopez",555666, 70, 120);
		hipertenso.agregarDietaDiaria(nuevaDieta);
		//Integer esperado=9;
		//Integer actual = risoto.obtenerCantidadDeAzucar();
		
		//assertTrue(nuevaDieta.aptaDiabetico());
		
		Integer esperado = 1;
		Integer actual= hipertenso.getIngesta().size();
		
		assertEquals(actual, esperado);

	}
	
	@Test
	public void testQueUnHipertendoNoIngesteDietaAptaParaHipertenso() {

		Plato bifeYEnsalada = new Plato();
		Ingrediente tomate = new Ingrediente("tomate", 0, 3);
		Ingrediente carne = new Ingrediente("carne", 6, 3);
		
		bifeYEnsalada.agregarIngredienteAlPlato(tomate);
		bifeYEnsalada.agregarIngredienteAlPlato(tomate);
		bifeYEnsalada.agregarIngredienteAlPlato(carne);
		
		Plato risoto = new Plato();
		Ingrediente arroz = new Ingrediente("arroz", 1,2);
		Ingrediente pollo = new Ingrediente("pollo", 1, 6);
		
		risoto.agregarIngredienteAlPlato(arroz);
		risoto.agregarIngredienteAlPlato(pollo);
		
		DietaDiaria nuevaDieta = new DietaDiaria();
		
		nuevaDieta.ingresarPlatoAlADieta(risoto);
		nuevaDieta.ingresarPlatoAlADieta(bifeYEnsalada);
		
		Paciente hipertenso = new Hipertenso("martin","lopez",555666, 70, 120);
		hipertenso.agregarDietaDiaria(nuevaDieta);
		//Integer esperado=9;
		//Integer actual = risoto.obtenerCantidadDeAzucar();
		
		//assertTrue(nuevaDieta.aptaDiabetico());
		
		Integer esperado = 0;
		Integer actual= hipertenso.getIngesta().size();
		
		assertEquals(actual, esperado);

	}
}

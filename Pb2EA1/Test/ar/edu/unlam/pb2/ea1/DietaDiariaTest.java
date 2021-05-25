package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DietaDiariaTest {
	
	@Test
	public void testQueNosePuedanAgregarPlatoRepetidos() {
		
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
		nuevaDieta.ingresarPlatoAlADieta(risoto);
		nuevaDieta.ingresarPlatoAlADieta(bifeYEnsalada);
		
		Integer esperado = 2;
		Integer actual= nuevaDieta.getPlatos().size();
		
		assertEquals(actual, esperado);
		

	}
	
	@Test
	public void testQueDietaDiariaSeaAptaHipertenso(){
		
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
		
		assertTrue(nuevaDieta.aptaHipertenso());
		
		
	}
	@Test
	public void testQueDietaDiariaNoSeaAptaHipertenso(){
		
		Plato bifeYEnsalada = new Plato();
		Ingrediente tomate = new Ingrediente("tomate", 0, 3);
		Ingrediente carne = new Ingrediente("carne", 10, 3);
		
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
		
		assertFalse(nuevaDieta.aptaHipertenso());
		
	}
	
	@Test
	public void testQueDietaDiariaSeaAptaDiabetico(){
		
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
		
		assertTrue(nuevaDieta.aptaDiabetico());
		
		
	}
	
	@Test
	public void testQueDietaDiariaNoSeaAptaDiabetico(){
		

		Plato bifeYEnsalada = new Plato();
		Ingrediente tomate = new Ingrediente("tomate", 0, 30);
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
		
		assertFalse(nuevaDieta.aptaDiabetico());
		
	}
}

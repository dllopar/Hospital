package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlatoTest {
	
	@Test
	public void testQueSePuedanAgregarIngredientesIguales(){
		
		Plato nuevoPlato = new Plato();
		Ingrediente tomate = new Ingrediente("tomate", 0, 3);
		
		nuevoPlato.agregarIngredienteAlPlato(tomate);
		nuevoPlato.agregarIngredienteAlPlato(tomate);
		
		Integer esperado = 2;
		Integer actual= nuevoPlato.getIngredientes().size();
		
		assertEquals(actual, esperado);
		
	}
	
	@Test
	public void testQueSeObtengaLaCantidadDeSalCorrecta(){
		
		Plato nuevoPlato = new Plato();
		Ingrediente tomate = new Ingrediente("tomate", 0, 3);
		Ingrediente carne = new Ingrediente("carne", 2, 3);
		
		nuevoPlato.agregarIngredienteAlPlato(tomate);
		nuevoPlato.agregarIngredienteAlPlato(tomate);
		nuevoPlato.agregarIngredienteAlPlato(carne);
		
		Integer esperado = 2;
		Integer actual= nuevoPlato.obtenerCantidadaDeSal();
		
		assertEquals(actual, esperado);
		
	}
	
	@Test
	public void testQueSeObtenegaLaCanidadDeAzucarCorrecta() {
		
		Plato nuevoPlato = new Plato();
		Ingrediente tomate = new Ingrediente("tomate", 0, 3);
		Ingrediente carne = new Ingrediente("carne", 2, 3);
		
		nuevoPlato.agregarIngredienteAlPlato(tomate);
		nuevoPlato.agregarIngredienteAlPlato(tomate);
		nuevoPlato.agregarIngredienteAlPlato(carne);
		
		Integer esperado = 9;
		Integer actual= nuevoPlato.obtenerCantidadDeAzucar();
		
		assertEquals(actual, esperado);
		
	}
	
}

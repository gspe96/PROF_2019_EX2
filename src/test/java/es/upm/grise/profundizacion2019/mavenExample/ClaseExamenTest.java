package es.upm.grise.profundizacion2019.mavenExample;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClaseExamenTest {
	
	@Test(expected = EntradaInvalida.class)
	public void numeroNegativo() throws EntradaInvalida {
		ClaseExamen.primos(-1);
	}
	
	@Test
	public void pruebaUno() throws EntradaInvalida {
		List<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(3);
		assertEquals(result, ClaseExamen.primos(6));
	}
	
	@Test
	public void pruebaDos() throws EntradaInvalida {
		List<Integer> result = new ArrayList<Integer>();
		result.add(13);
		assertEquals(result, ClaseExamen.primos(13));
	}
	
	@Test
	public void pruebaTres() throws EntradaInvalida {
		List<Integer> result = new ArrayList<Integer>();
		result.add(5);
		result.add(5);
		assertEquals(result, ClaseExamen.primos(25));
	}
	
	
	
	
}

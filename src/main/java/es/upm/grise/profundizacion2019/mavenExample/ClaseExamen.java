package es.upm.grise.profundizacion2019.mavenExample;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

	public static List<Integer> primos(int n) throws EntradaInvalida{
		if(n<=1) {
			throw new EntradaInvalida("El número debe ser positivo y mayor o igual a dos");
		}
		
	    List<Integer> primos = new ArrayList<Integer>();
	    for(int i = 2; i<=n;i++) {
	        while (n%i==0) {
	            primos.add(i);
	            n = n/i;
	        }
	    }
	    return primos;
	}

}

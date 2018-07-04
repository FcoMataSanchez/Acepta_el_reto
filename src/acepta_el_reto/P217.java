/*
 Cuando necesitamos llegar a una dirección específica, es útil conocer la manera en la que las casas se numeran dentro de una calle para no perder demasiado tiempo buscando. Dependiendo de las reglas urbanísticas de cada lugar, esa numeración seguirá unas reglas u otras. En Japón, por ejemplo, los números se asignan por orden de construcción de los edificios, lo que no es algo particularmente amigable para un despistado turista.

En la mayoría de las ciudades y pueblos de Europa, sin embargo, se utiliza un mecanismo que facilita la búsqueda, aunque dificulta los cambios si se construyen o derrumban edificios. En concreto, se elige uno de los extremos como el inicio de la calle, utilizándose normalmente como criterio aquél que esté más cerca de un punto significativo de la ciudad (el centro urbano, el ayuntamiento, un río, el mar…). Una vez hecho eso, las viviendas que quedan al lado izquierdo (respecto al punto inicial) reciben números impares consecutivos, y las que quedan al lado derecho números pares consecutivos. Dependiendo del tamaño de cada edificio, a menudo ocurre que los números se descompensan y hay portales que tienen enfrente otros con números muy diferentes. 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P217 {
  public static void main(String[] args) {
 	Scanner	in = new java.util.Scanner(System.in);
 		Integer n = in.nextInt();
 		while (n > 0) {
 			if (n % 2 == 0) {
 				System.out.println("DERECHA");
 			} else {
 				System.out.println("IZQUIERDA");
 			}
 			n = in.nextInt();
 		}
 	}
}



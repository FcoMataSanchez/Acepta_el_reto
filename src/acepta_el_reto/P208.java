/*
 Los "bolos" son un juego tradicional en el que los jugadores tratan de derribar el mayor número de bolos posible utilizando, normalmente, una bola.

La cantidad de variantes del juego es inmensa, cada una con sus propias normas particulares. La colocación de los bolos, su número, y el objeto que se lanza varía enormemente. En ocasiones, incluso el objetivo cambia; en ciertas modalidades no sólo es importante tirar muchos bolos, sino también conseguir desplazarlos lo más posible desde su posición original.

La variante más conocida es el bowling, que se juega en lugares cerrados y en el que la bola se desliza por un suelo encerado, en lugar de lanzarla al aire. Al final de la pista, de algo más de 19 metros de largo, se colocan 10 bolos según la disposición siguiente (vista desde arriba):
Numeración de los bolos

Al golpear un bolo, éste cae y puede derribar a otros. En concreto, para este problema, supondremos que cuando un bolo cae, golpea (y tira) los dos bolos que tiene justo detrás, y éstos hacen lo propio con los siguientes1. Por ejemplo, si la bola golpea el bolo número 2, éste hará caer a los bolos 4 y 5, y éstos a su vez a los bolos 7, 8 y 9:
Caída de los bolos

Dado que lo importante es no dejar bolos en pie, ¿cuántos nos dejamos al golpear un bolo? 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P208 {

    public static void main(String[] args) {
        long filas, total, total2, resta;
        long golpea;
        long opt;

        Scanner in = new Scanner(System.in);

        while (true) {
            total2 = 0;
            total = 0;

            filas = in.nextInt();
            golpea = in.nextInt();

            if (filas == 0 && golpea == 0) {
                break;
            }

            total = ((1 + filas) * filas) / 2;

            total2 = filas - (golpea - 1);

            total2 = ((1 + total2) * total2) / 2;

            total -= total2;

            System.out.println(total);

        }

    }

}



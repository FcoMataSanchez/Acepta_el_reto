/*
 "Hacer la 13−14" es una expresión coloquial habitual para indicar que una persona ha hecho a otra una trastada. Su origen está en una novatada que se hacía en los talleres mecánicos a los aprendices, a los que se mandaba a por la "llave 13−14", es decir la que tuviera en un extremo un calibre de 13 milímetros, y en otro uno de 14.

Sabiendo que es una novatada, es fácil intuir que esa llave no existe; sí lo hacen la llave 12−13 y la llave 14−15, pero no la muy buscada 13−14, por lo que los aprendices terminaban desesperados buscando una llave que no existía para no parecer torpes sus primeros días.

En este problema haremos la simplificación de asumir que las llaves que existen tienen en cada extremo calibres consecutivos, siendo el menor de ellos par1. Según esto, ¿eres capaz de evitar las bromas de aprendiz? 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P370 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int c;

        c = lector.nextInt();
        String[] entrada;
        int clau1, clau2;

        while (c > 0) {

            entrada = lector.next().split("-");
            clau1 = Integer.parseInt(entrada[0]);
            clau2 = Integer.parseInt(entrada[1]);
            if (((clau1 % 2 == 0) && (clau2 > clau1) || ((clau1 > clau2) && (clau2 % 2 == 0))) && ((clau2 == clau1 + 1) || (clau2 == clau1 - 1))) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            c--;
        }

    }

}

/*
 Según el Sistema Internacional de Unidades, para medir superficies debe utilizarse el metro cuadrado, que es el área en el interior de un cuadrado cuyos lados miden exactamente un metro.

Un metro es la longitud del trayecto recorrido por la luz en el vacío en un intervalo de tiempo de 1/299.792.458 segundos.

Un segundo es la duración de 9.192.631.770 periodos de la radiación correspondiente a la transición entre los dos niveles hiperfinos del estado fundamental del átomo de cesio 133.

El Sistema Internacional de Unidades se jacta de que sus unidades se basan en fenómenos físicos fundamentales. Pero cuando los periodistas tienen que hablar sobre la superficie quemada en un incendio forestal, el espacio arrasado por unas inundaciones, o la cantidad de cultivo echado a perder por un inoportuno granizo, no suelen llevar en el bolsillo cesio 133 para empezar a medir.

La solución, aceptada por el Comité Internacional de Periodistas, es medir la superficie en campos de fútbol, que es algo mucho más fácil de hacer a ojo. Especialmente porque el tamaño de un campo de fútbol es algo impreciso; el largo admitido puede estar entre 90 y 120 metros, y el ancho entre 45 y 90. Con tanto margen, los periodistas pueden tener las espaldas cubiertas por muy desentrenado que tengan el ojo; se dé la cifra que se dé, es muy posible que haya un campo de fútbol con el que encaje la estimación. 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P403 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int min = 4050;
        int max = 10800;
        int metros, cantCampos;
        int casos;
        double div;
        int min2 = min, max2 = max;
        casos = in.nextInt();

        for (int h = 0; h < casos; h++) {
            metros = in.nextInt();
            cantCampos = in.nextInt();

            min2 = min * cantCampos;
            max2 = max * cantCampos;

            if (metros <= max2 && metros >= min2) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }
    }
}

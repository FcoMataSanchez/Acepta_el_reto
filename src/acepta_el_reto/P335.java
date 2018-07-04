/*
 Al comprarte tu última videoconsola, tuviste que retirar la vieja del mueble de la televisión y buscar un lugar donde pudiera descansar tranquilamente su jubilación. Te viste obligado así a bucear en tu viejo rincón, donde olvidados juguetes, de otros paisajes y otros tiempos, sueñan con que vuelva aquel niño que fuiste.

Para tu sorpresa, el tarro de canicas todavía seguía allí; a pesar de un polvo de años, las pequeñas bolitas de cristal te devolvieron, una vez más, tu propio reflejo, tristemente cambiado por el paso del tiempo.

La nostalgia y la añoranza te llevaron a abrir el frasco con cariño y jugar, como antaño, con tus canicas. La casualidad quiso que las colocaras de una curiosa manera:
Triángulos de 1, 3, 6 y 10 canicas

Los triángulos de colores, cada vez más grandes, te dieron una idea; era posible colocar la primera canica en el centro del triángulo de tres canicas. A su vez, viste que era posible colocar el triángulo de tres canicas encima del triángulo de seis, y éste sobre el de diez:
Pirámide con los triángulos de 10, 6, 3 y 1 canica

Miraste a tu viejo tarro con los ojos iluminados de niñez. "Al final, ¿cuántas canicas fui capaz de conseguir para mi colección?" — te preguntaste. Querías construir la pirámide más alta posible.

Mientras, en el salón, la nueva videoconsola te esperaba sin entender nada. Mafalda te habría dicho "Esos juegos serán más pavotes, pero tienen la simplicidad de los clásicos". 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;

        casos = sc.nextInt();
        for (int q = 0; q < casos; q++) {
            int x = sc.nextInt();
            long suma = 0l;
            long total = 0l;
            for (int i = 1; i <= x; i++) {
                suma += i;
                total += suma;
            }
            System.out.println(total);
        }
    }
}



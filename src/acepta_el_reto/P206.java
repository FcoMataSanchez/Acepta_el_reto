/*
 Debido al crecimiento de población en la isla de Manhattan (entre 1790 y 1810 se había triplicado), en 1811 se presentó el conocido como "plan de los comisionados" (Commisioners' plan) que planteó un plano de la futura ciudad organizándola en una cuadrícula. En ella, las avenidas cruzarían la isla de Norte a Sur, mientras que las calles lo harían de Oeste a Este, creando manzanas de unos 5 acres. Esta regularidad en el plano, unido a que las avenidas y calles se numeran en lugar de bautizarse con nombres de personajes ilustres, hace que, desde entonces, orientarse por Manhattan sea un juego de niños.

La pega para los peatones, sin embargo, es que no hay atajos. Cuando alguien debe desplazarse de un lugar a otro, está obligado a moverse o bien en horizontal o bien en vertical, pues no existen calles que recorran la isla en diagonal.
Ejemplo de desplazamiento por Manhattan

Pero para los turistas que cogen taxis es una bendición, porque es muy fácil darse cuenta cuándo los conductores de estos famosos coches amarillos intentan dar un rodeo para llevarlos a su destino. En Nueva York, es muy difícil ser taxista defraudador... ¿verdad? 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P206 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numCasos = lector.nextInt();

        for (int i = 0; i < numCasos; i++) {
            calcular(lector.nextInt());
        }

    }

    static void calcular(int hipotenusa) {

        boolean correcto = false;
        int resultado = 0;

        for (int i = hipotenusa - 1; i > 0 && !correcto; i--) {

            double cateto = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(i, 2));

            if (cateto % 1 == 0 && hipotenusa < i + cateto && Math.pow(hipotenusa, 2) == Math.pow(cateto, 2) + Math.pow(i, 2)) {

                resultado = i + (int) Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(i, 2));
                System.out.println(resultado);
                correcto = true;

            }

        }

    }
}

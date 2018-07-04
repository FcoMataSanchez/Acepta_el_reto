/*
Un buen corredor de San Fermines intenta mantener la emoción para fomentar el espectáculo. Este tipo de corredores está muy en forma y son capaces de correr mucho más deprisa que los toros. Sin embargo, para mantener la emoción, no lo hacen. Se limitan a mantener una velocidad adecuada para que los toros se mantenga siempre cerca, pero no lleguen a pillarles.

El problema consiste en, dadas las velocidades de todos los toros que participan en los San Fermines (y que se suponen constantes), ¿a qué velocidad deben ir estos corredores expertos para mantener el espectáculo conservando su integridad?
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P149 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = -1, max, aux;
        while (in.hasNextInt()) {
            n = in.nextInt();
            max = in.nextInt();
            for (int i = 1; i < n; i++) {
                if ((aux = in.nextInt()) > max) {
                    max = aux;
                }
            }
            System.out.println(max);
        }
    }

}


}

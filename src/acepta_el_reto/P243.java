/*
Jaime Lannister, más conocido por el Matarreyes, acaba de llegar a Aguasdulces. Venía con la intención de entrar en el castillo de forma pacífica pero Brynden Tully, el Pez Negro, se ha negado a aceptar sus condiciones, así que tendrá que tomarlo a punta de espada. No le gusta romper sus promesas pero al fin y al cabo todos saben lo que vale la palabra del Matarreyes; una traición más o menos no extrañará a nadie. A pesar de todo, Jaime nota un regusto amargo cuando piensa en el tiempo que pasó encerrado en aquel castillo y en cómo Catelyn Stark le hizo prometer que nunca levantaría una espada contra sus habitantes antes de liberarle.

En fin, los hechos son los hechos y, por poco que le guste, ha llegado el momento de acabar con la rebeldía del Pez Negro como le ha ordenado su querida hermana.

En estos momentos, Jaime cuenta con 25.000 hombres de diversas casas afines a los Lannister y está pensando cuál sería la mejor distribución en batallones de cara al ataque de los muros. Quiere repartirlos de manera que los batallones tengan el mismo número de hombres y se ha dado cuenta de que hay múltiples maneras de realizar el reparto; por ejemplo con esos 25.000 hombres podría hacer 100 batallones de 250 hombres, 250 batallones de 100 hombres y otras configuraciones hasta un total de 24 formas distintas. Ahora le gustaría poder saber para cada una de sus batallas pasadas y futuras, cómo se podría repartir a sus hombres siguiendo el mismo procedimiento. ¿Podrías ayudarle?
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P243 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double valor;
        int ocupacion;
        do {
            valor = lector.nextInt();
            ocupacion = 0;
            if (valor == 0) {
                break;
            }
            for (int i = 1; i < Math.sqrt(valor); i++) {
                if (valor % i == 0) {
                    ocupacion++;
                }
            }

            if (valor == 1) {
                System.out.println("1");
            } else if (valor % Math.sqrt(valor) == 0) {
                System.out.println(ocupacion * 2 + 1);
            } else {
                System.out.println(ocupacion * 2);
            }
        } while (true);
    }
}

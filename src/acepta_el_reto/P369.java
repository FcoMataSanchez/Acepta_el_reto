/*
Es ampliamente conocido que escribimos los números utilizando base 10, en la que expresamos las cantidades utilizando 10 dígitos distintos (0…9). El valor de cada uno de ellos depende de la posición que ocupe dentro del número, pues cada dígito se multiplica por una potencia de 10 distinta según cuál sea esa posición.

La descomposición, por ejemplo, del número 1.234 es:

1.234 = 1×103 + 2×102 + 3×101 + 4×100

Otra base muy conocida es la base 2 al ser la utilizada por los dispositivos electrónicos. En ella sólo hay dos dígitos distintos (0 y 1), que se ven multiplicados por potencias de 2.

Mucho antes de que llegaran la base 2, la base 10 e incluso los números romanos, los primeros seres humanos contaban haciendo surcos en la arena, muescas en un trozo de madera o colocando palos en línea. Estaban, sin saberlo, usando base 1. En ella sólo hay un símbolo y cada dígito es multiplicado por una potencia de 1. Dado que 1n = 1 el resultado es que todos los dígitos tienen el mismo peso. 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P369 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        String res;

        do {
            res = "";
            num = lector.nextInt();
            if (num == 0) {
                break;
            }
            for (int i = 0; i < num; i++) {
                res += 1;
            }
            System.out.println(res);

        } while (num != 0);

    }
}

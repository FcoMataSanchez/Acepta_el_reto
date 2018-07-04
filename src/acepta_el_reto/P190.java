/*
 Es sabido que el factorial de un número positivo n, escrito n!, es la multiplicación de todos los números entre 1 y n. Por ejemplo, 5! es 5 · 4 · 3 · 2 · 1 = 120.

Con un ordenador, calcular el factorial de un número es fácil, de modo que esta vez te pedimos que nos digas el resultado de dividir dos factoriales. ¿Eres capaz? 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P190 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long factorial;
        int num, den;
        while (true) {
            factorial = 1;
            num = in.nextInt();
            den = in.nextInt();
            if (num >= den) {
                for (int i = den + 1; i <= num; i++) {
                    factorial *= i;
                }
                System.out.println(factorial);
            } else {
                break;
            }
        }
    }
}



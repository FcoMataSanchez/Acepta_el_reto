/*
 Dicen los viejos que en este país el latín era una asignatura obligatoria por la que todos los estudiantes de bachillerato tenían que pasar.

Dicen los viejos que el primer día de clase de latín cualquiera esperaba que los alumnos salieran sabiendo el "rosa rosae".

Dicen los viejos que esa era la primera declinación.

Quizá, dentro de muchos años, nosotros seamos los viejos que contemos batallitas de cómo se enseñaba informática. Y quizá entonces, digamos que en la primera clase de cualquier curso en el que se explicara un lenguaje de programación, se tenía que salir habiendo escrito "un hola mundo".

Y eso es lo que vamos a hacer. Escribir un programa que escriba tantos "hola mundo" como nos pidan.
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P116 {
   public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        num = lector.nextInt();
        if ((num >= 0) && (num <= 5)) {

            for (int i = 0; i < num; i++) {
                System.out.println("Hola mundo.");
            }
        } else {
        }
    }
    
}

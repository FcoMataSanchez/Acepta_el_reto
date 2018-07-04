/*
 Cuando aprendemos a sumar números pronto nos cuentan aquello de "llevarse una": cuando los dos dígitos que sumamos llegan a la decena tenemos "acarreo" que debemos sumar a los siguientes dígitos (de la izquierda).

Cuando nuestros maestros nos ponían ejercicios, antes tenían que contar cuántas veces tendríamos que "llevarnos una" y en base a eso medían la dificultad del ejercicio.

¿Puedes hacer un programa que automatice esa tarea? 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P124 {
        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean fin=false;
        do
        {
            String s1=in.next();
            String s2=in.next();
            in.nextLine();
            fin=s1.equals("0")&&s2.equals("0");
            if (!fin)
            {
                System.out.println(acarreos(s2,s1));
            }
        } while (!fin);
    }
         public static int acarreos(String s1, String s2)
    {
        int acarreo1=0;
        int acarreo2=0;
        int i=0; 
        boolean salida=false;
        while (!salida)
        {
           
            int i1=i<s1.length()?s1.charAt(s1.length()-i-1)-'0':0; 
            int i2=i<s2.length()?s2.charAt(s2.length()-i-1)-'0':0;
            int suma=acarreo2+i1+i2; 
            acarreo2=suma>=10?1:0;
            acarreo1+=acarreo2;
            i++; 
            salida=!(acarreo2>0) && (i>=s1.length() || i>s2.length());
        }
        return acarreo1;
    }
    }

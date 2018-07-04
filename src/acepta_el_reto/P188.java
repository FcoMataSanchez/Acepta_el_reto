/*
A Samuel y a Clara les encanta jugar a encadenar palabras. Si Samuel dice Mata, Clara sigue diciendo Tapa. Samuel le sigue el juego diciendo Papa y Clara remata diciendo Pato.

Normalmente no tarda mucho en estallar la discusión cuando alguno piensa que el otro lo ha hecho mal. En realidad Samuel acaba de aprender a leer y a Clara todavía le queda un poco para empezar... así que es normal que tengan conflictos, pero lo cierto es que sus padres acaban cansados de tantas discusiones.

¿Puedes hacer un programa que les diga a Samuel y a Clara si su lista de palabras encadenadas está bien? No te preocupes por la existencia o inexistencia de las palabras que usan, de eso seguirán ocupándose sus sufridos padres.
 */
package acepta_el_reto;

import java.util.StringTokenizer;

/**
 *
 * @author Paco
 */
public class P188 {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext()) {
            return false;
        }
        String n = in.nextLine();

        int count = 0;

        String res = "SI";

        char[] asdf = null;

        StringTokenizer st = new StringTokenizer(n, " ");
        while (st.hasMoreTokens()) {
            char[] qwer = st.nextToken().toCharArray();
            if (count > 0) {
                if (qwer[0] == asdf[asdf.length - 2] && qwer[1] == asdf[asdf.length - 1]) {

                } else {
                    res = "NO";
                    break;
                }
            }
            count++;
            asdf = qwer;

        }
        System.out.println(res);

        return true;
    }

    public static void main(String args[]) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba());
    }

}

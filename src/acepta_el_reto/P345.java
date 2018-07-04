/*
El sudoku es un pasatiempo lógico que consiste en rellenar una cuadrícula de 9×9 casillas dividida en nueve regiones 3×3 (las separadas con líneas más gruesas en la imagen) con los números del 1 al 9 de tal forma que no se repitan números en ninguna fila, columna o región. El sudoku inicialmente se presenta con algunas casillas ya rellenas, a modo de pistas, y el jugador debe deducir los valores de las casillas vacías. Si el sudoku está bien planteado, la solución es única.

Dado un sudoku completamente relleno, ¿sabrías construir un programa que comprobara si es correcto (es decir, cada fila, columna o región contiene los números del 1 al 9 exactamente una vez)? 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P345 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[][] nums = new int[9][9];
        String salida;
        for (int n = lector.nextInt(); n > 0; n--) {
            salida = "NO";
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    nums[i][j] = lector.nextInt();
                }
            }
            if (sector(nums)) {
                if (horizontal(nums)) {
                    if (vertical(nums)) {
                        salida = "SI";
                    }
                }
            }
            System.out.println(salida);
        }

    }

    public static boolean vertical(int[][] nums) {
        for (int i = 0; i < 9; i++) {
            boolean[] ok = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (ok[nums[i][j] - 1]) {
                    return false;
                } else {
                    ok[nums[i][j] - 1] = true;
                }
            }
        }
        return true;
    }

    public static boolean horizontal(int[][] nums) {
        for (int i = 0; i < 9; i++) {
            boolean[] ok = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (ok[nums[j][i] - 1]) {
                    return false;
                } else {
                    ok[nums[j][i] - 1] = true;
                }
            }
        }
        return true;
    }

    public static boolean sector(int[][] nums) {
        for (int s = 0; s < 9; s++) {
            boolean[] ok = new boolean[9];
            for (int i = s % 3 * 3; i < s % 3 * 3 + 3; i++) {
                for (int j = s / 3 * 3; j < s / 3 * 3 + 3; j++) {
                    if (ok[nums[i][j] - 1]) {
                        return false;
                    } else {
                        ok[nums[i][j] - 1] = true;
                    }
                }
            }
        }
        return true;
    }
}

/*
 En el parchís y muchos otros juegos de mesa en los que los jugadores compiten por ser los primeros en alcanzar una meta, a menudo es necesario llegar al destino de manera exacta. Tras la tirada de dados, si el valor obtenido es más del necesario para llegar al destino, la ficha debe rebotar, volviendo hacia atrás una vez alcanzada la meta.

A veces, conseguir caer exactamente en la posición final es lo más tedioso, y los jugadores ven cómo sus fichas rebotan continuamente en ella sin ser capaces de que el azar les deje, por fin, terminar la partida. 
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P407 {
 public static void main(String[] args) {
        int casillas, posicion, dado;
        boolean suma=true;
        Scanner in = new Scanner(System.in);
        
        while(true){
            suma=true;
            
            casillas = in.nextInt();
            posicion = in.nextInt();
            dado = in.nextInt();
            
            if(dado==0 && posicion==0 && dado==0){
                break;
            }
            
            for(int h = 0; h< dado; h++){
                if(posicion==casillas){
                    suma=false;
                } else if (posicion==0){
                    suma=true;
                }
                
                if(suma){
                    posicion++;
                } else {
                    posicion--;
                }
            }
            System.out.println(posicion);
        }
    }
}



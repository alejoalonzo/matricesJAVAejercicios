
package matrices;

import java.util.Scanner;
public class rellenaMatriz {
     public static void main(String[] args){
         Scanner Scnnr = new Scanner(System.in);
         
         //Declaracion y asignacion del tamaño
         
         int[][] matriz = new int [2][2]; //filasColumnas
         
         //Asignar datos siempre que sea mayor que cero, en caso de negativo pone un cero
         for(int x=0; x < matriz.length; x++){
             for(int y=0; y < matriz[x].length; y++){
                 System.out.println("Introduzca el elmento[" + x +"," + y + "]");
                 matriz[x][y] = Scnnr.nextInt();
                 if(matriz[x][y] < 0){
                     matriz[x][y] = 0;
                 }
             }
         }
         
         //Mostrar matriz
         for(int x=0; x < matriz.length; x++){
             for(int y=0; y < matriz[x].length; y++){
                 System.out.println("[" + x +"," + y + "] = " + matriz[x][y]);
             }
         }
     }
}

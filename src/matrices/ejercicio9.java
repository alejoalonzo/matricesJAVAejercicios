package matrices;
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args){
        
        Scanner Scnnr = new Scanner(System.in);
        
        int fijos = 0;
        
        int [][] matriz = new int [6][6];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){ 
                System.out.println("Introduzca el elemnto ["+i+","+j+"]");
                matriz[i][j] = Scnnr.nextInt();
                }
            }    
            
        //Mostrar matriz    
        for (int i = 0; i < matriz.length; i++){
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++){    
                
                matriz[i][i] = fijos;//cambio numeros de la diagonal por otros predeterminados
                System.out.print(matriz[i][j]);
                
                if(j != matriz[i].length-1)System.out.print("\t");//dar espaciado
                }     
            System.out.println(" |");      
          } 
    }
}

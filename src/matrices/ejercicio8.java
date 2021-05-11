
package matrices;

public class ejercicio8 {
    public static void main(String[] args){
        
        int numeros = 1;
        int [][] matriz = new int [3][3];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j]= numeros;
                numeros++;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("El número  en la posición [0,0] es: " + matriz [0][0]);
        System.out.println("El número  en la posición [2,2] es: " + matriz [2][2]);
        System.out.println("El número  en la posición [1,2] es: " + matriz [1][2]);
    }
}

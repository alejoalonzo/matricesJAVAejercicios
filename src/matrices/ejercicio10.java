package matrices;
public class ejercicio10 {
    public static void main(String[] args){
        
//Declaro variables y matriz
        int[][] matriz = new int [10][4];
        int tiempoMenor = 1000000;
        int dorsalMenor = 0;
        int tiempoMenorFem = 1000000;
        int dorsalMenorFem = 0;
        
//Relleno matriz con los datos proporcionados
        matriz[0][0] = 3457; matriz[0][1] = 1; matriz[0][2] = 51; matriz[0][3] = 52;
        matriz[1][0] = 3467; matriz[1][1] = 1; matriz[1][2] = 32; matriz[1][3] = 41;
        matriz[2][0] = 3568; matriz[2][1] = 0; matriz[2][2] = 14; matriz[2][3] = 39;
        matriz[3][0] = 3570; matriz[3][1] = 0; matriz[3][2] = 12; matriz[3][3] = 63;
        matriz[4][0] = 3571; matriz[4][1] = 1; matriz[4][2] = 45; matriz[4][3] = 38;
        matriz[5][0] = 3572; matriz[5][1] = 0; matriz[5][2] = 17; matriz[5][3] = 46;
        matriz[6][0] = 3573; matriz[6][1] = 0; matriz[6][2] = 12; matriz[6][3] = 59;
        matriz[7][0] = 3574; matriz[7][1] = 0; matriz[7][2] = 30; matriz[7][3] = 42;
        matriz[8][0] = 3575; matriz[8][1] = 1; matriz[8][2] = 24; matriz[8][3] = 77;
        matriz[9][0] = 3576; matriz[9][1] = 0; matriz[9][2] = 57; matriz[9][3] = 48;
        

//puesto de otra manera mas abreviado (con sus datos respectivamente) seeria asi:
        
/*int matriz [] [] = {{3457,1,51,52},
                      {3457,1,51,52},
                      {3457,1,51,52},
                      {3457,1,51,52},
                      {3457,1,51,52},
                      {3457,1,51,52},
                      {3457,1,51,52},
                      {3457,1,51,52},
                      {3457,1,51,52},
                      {3457,1,51,52},}
*/
    

//Muestro por pantalla la matriz        
        for(int i = 0; i<matriz.length; i++){
        for(int j = 0; j<matriz[i].length; j++)
            System.out.print(matriz [i][j] + " ");
        System.out.println();   
        }
        
       System.out.println(); 

//Busco menor tiempo masculino y femenino
        for(int i=0; i < matriz.length; i++){
            if(matriz[i][1] == 1){
              if(matriz[i][3] < tiempoMenor){
                   tiempoMenor = matriz[i][3];
                   dorsalMenor = matriz[i][0];
                }
            }else{
               if(matriz[i][3] < tiempoMenorFem){
                   tiempoMenorFem = matriz[i][3];
                   dorsalMenorFem = matriz[i][0];
                }
            }
        }
       System.out.println("El ganador masculino es el dorsal: " + dorsalMenor +" "
               + "y su  tiempo  es: " + tiempoMenor);
       System.out.println(); 
       
       System.out.println("La ganadora de la categoria femenina es el dorsal: " 
               + dorsalMenorFem +" y su  tiempo  es: " + tiempoMenorFem);

    }
}

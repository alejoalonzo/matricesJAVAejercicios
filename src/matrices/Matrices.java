package matrices;

public class Matrices {


    public static void main(String[] args) {
       
        //Declaracion y asignacion del tamaño.
        int[][] nombre = new int [4][4];
        
        //asignar datos
        nombre[0][0]= 1;
        nombre[0][1]= 1;
        nombre[0][2]= 1;
        nombre[0][3]= 1;
        
        nombre[1][0]= 2;
        nombre[1][1]= 2;
        nombre[1][2]= 2;
        nombre[1][3]= 2;
        
        nombre[2][0]= 3;
        nombre[2][1]= 3;
        nombre[2][2]= 3;
        nombre[2][3]= 3;
        
        nombre[3][0]= 4;
        nombre[3][1]= 4;
        nombre[3][2]= 4;
        nombre[3][3]= 4;
        
        
        //tambien se puede rellenar asi:
        //int nombre [] [] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}}
        
        //Mostrar una matriz por pantalla
        
        for(int i = 0; i<4; i++){
        for(int j = 0; j<4; j++)
            System.out.print(nombre [i][j] + " ");
        System.out.println();   
        }
        
    }
    
}

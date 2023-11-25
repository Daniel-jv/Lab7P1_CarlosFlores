//fila 2, silla 1
package lab7p1_carlosflores;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Lab7P1_CarlosFlores {
    
    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("---MENU---");
        System.out.print("1-Tres en raya\n2-Puntos de silla\nIngrese una opcion:");
        int opcion = leer.nextInt();
        System.out.println();

        
        while(opcion < 3 && opcion > 0){
            
            switch(opcion){
                
                case 1->{
                    int cont= 0;
                    int filas = 3;
                    int columnas = 3;
                    int [][] matriz = new int [filas][columnas];
                    matriz = generarTablero(matriz);
                    int [][] verificarPosicionValida = matriz;
                    matriz = verificarPosicionValida(matriz);
                    
                    int [][] verificarPosicionValidaBOT = matriz;
                    matriz = verificarPosicionValidaBOT(matriz);
                    
                    
                    
                    matriz = verificarPosicionValida(matriz);
                    
                    matriz = verificarPosicionValidaBOT(matriz);
                    
                    matriz = verificarPosicionValida(matriz);
                    
                    matriz = verificarPosicionValidaBOT(matriz);
                    
                    matriz = verificarPosicionValida(matriz);
                    
                    matriz = verificarPosicionValidaBOT(matriz);
                    
                    matriz = verificarPosicionValida(matriz);
                    
                    matriz = verificarPosicionValidaBOT(matriz);
                    
                    System.out.println();
                    
                    
                    break;
                }
                
                case 2->{
                    System.out.print("Ingrese tamaño de la matriz: ");
                    int filas = leer.nextInt();
                    int columnas = filas;
                    int [][] matriz = new int [filas][columnas];
                    matriz = generarIntMatrizAleatoria(filas,columnas);
                    int [][] encontrarPuntosSilla = matriz;
                    matriz = encontrarPuntosSilla(matriz);
                    
                }
                
            }//fin switch
            
            System.out.println();
            System.out.println("---MENU---");
            System.out.print("1-Tres en raya\n2-Puntos de silla\nIngrese una opcion:");
            opcion = leer.nextInt();
            
        }//fin while
        
    }//cierre de metodo main
    
    public static void imprimir(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    
    public static int [][] verificarPosicionValida(int [][] matriz){
        System.out.println();
        int [][] temporal = matriz;
        System.out.println("Es el turno de: X");
        System.out.print("Ingrese la fila (0,1,2): ");
        int fila = leer.nextInt();
        while(fila < 0 || fila > 2){
            System.out.println("Ingrese el digito nuevamente");
            fila = leer.nextInt();
        }
        System.out.print("Ingrese la columna (0,1,2): ");
        int columna = leer.nextInt();
        while(columna < 0 || columna > 2){
            System.out.println("Ingrese el digito nuevamente");
            columna = leer.nextInt();
        }
        System.out.println("Elijio la posicion:("+fila+","+columna+")");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                if(temporal[i][j] == 79){
                    char caract1 = 79;
                    System.out.print(caract1);
                }
                if(i == fila && j == columna){
                    if(temporal[i][j] == 32){
                        char caract2 = 88;
                        temporal[i][j] = caract2;
                        System.out.print(caract2);
                    }else{
                        System.out.println("la posicion esta ocupada, ingresela nuevamente");
                        System.out.print("Ingrese la fila (0,1,2): ");
                        fila = leer.nextInt();
                        while(fila < 0 || fila > 2){
                            System.out.println("Ingrese el digito nuevamente");
                            fila = leer.nextInt();
                        }
                        System.out.print("Ingrese la columna (0,1,2): ");
                        columna = leer.nextInt();
                        while(columna < 0 || columna > 2){
                            System.out.println("Ingrese el digito nuevamente");
                            columna = leer.nextInt();
                        }
                        System.out.println("Elijio la posicion:("+fila+","+columna+")");
                    }
                }
                char caract3 = 32;
                System.out.print(caract3);
                if(j<2){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        return temporal;
    }
    
    public static int [][] verificarPosicionValidaBOT(int [][] matriz){
        System.out.println();
        System.out.println();
        int [][] temporal = matriz;
        System.out.println("Es turno de O");
        int filar = random.nextInt((3-0)+0)+0;
        int columnar = random.nextInt((3-0)+0)+0;
        System.out.println("Elijio la posicion:("+filar+","+columnar+")");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matriz[i].length; j++) {
                if(temporal[i][j] == 88){
                    char caract = 88;
                    System.out.print(caract);
                }
                if(i == filar && j == columnar){
                    
                    if( temporal[i][j] == 32){
                        char caract2 = 79;
                        temporal[i][j] = caract2;
                        System.out.print(caract2);
                    }else if(temporal[i][j] == 88 || temporal[i][j] == 79){
                        filar = random.nextInt((3-0)+0)+0;
                        columnar = random.nextInt((3-0)+0)+0;
                        i = filar;
                        j = columnar;
                    }
                }
                char caract3 = 32;
                System.out.print(caract3);
                if(j<2){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        return temporal;
    }
    
    public static int [][] generarTablero(int [][] matriz){
        int [][] temporal = matriz;
        System.out.println("---Binevenido al Tres en Raya---");
        System.out.println("Tablero actual");
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                int var = 32;
                char esp = (char) var;
                temporal[i][j] = esp;
                System.out.print(esp);
                if(j < 2){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        return temporal;
    }
    
    public static int [][] generarIntMatrizAleatoria(int filas, int columnas){
        System.out.println();
        System.out.println("Matriz generada:");
        int temporal [][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                temporal[i][j] = random.nextInt((99-0)+1)+0;
                System.out.print(temporal[i][j] + " ");
            }
            System.out.println();
        }
        return temporal;
    }
    
    public static int [][] encontrarPuntosSilla(int [][] matriz){
        System.out.println();
        int finish = 0;
        int cont = 0;
        int temporal2 = 0;
        int cont_punt = 0;
        int temporal [][] = matriz;
        for (int i = 0; i < matriz.length; i++) {
            int j;
            for (j = 0; j < matriz[i].length; j++) {
                int var = matriz[i][j];
                for (int k = 0; k < matriz.length; k++) {
                    cont = 0;
                    
                    for (int l = 0; l < matriz[k].length; l++) {
                        if(k == i){
                            if(var > matriz[k][l]){
                            }else{
                                temporal2 = matriz[i][j];
                                cont++;
                            }
                        }
                        if(j == l){
                            if(var < matriz[k][l]){
                            }else{
                                temporal2 = matriz[i][j];
                                cont++;
                            }
                        }
                    }
                    if(cont>2){
                        System.out.println("Punto silla en ["+i+"]["+j+"]:" + var);
                        var = 0;
                        cont_punt++;
                    }
                }
            }
            if(cont_punt < 1 && finish == 0){
                System.out.println("No hay puntos de silla");
                finish = 1;
            }
            temporal2 = 0;
        }
        return temporal;
    }
}//cierre de clase

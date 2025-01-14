import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static final int MAX_FILA=10;
    static final int MAX_COLUMNA=10;
    static Random aleatorio;
    static Scanner lector;
    static int filaB;
    static int columnaB;
    static int vidas = 5;
    // 1º) Tablero 10 x 10 visible a nivel de clase
    static char[][] tablero = new char [MAX_FILA][MAX_COLUMNA];
    public static void rellenarTableroL(){
        // 2º) Rellenar tablero de L
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                tablero[i][j] = 'L';
            }
        }
    }
    public static void rellenarTableroB(){
        filaB = aleatorio.nextInt(10);
        columnaB = aleatorio.nextInt(10);
        tablero[filaB][columnaB]= 'B';
    }
    private static void rellenarTableroH() {

        int filaAl = 0;
        int columnaAl = 0;


        for (int i = 0; i <10 ; i++) {
            do {
                filaAl = aleatorio.nextInt(10);
                columnaAl = aleatorio.nextInt(10);
            } while (tablero[filaAl][columnaAl]!= 'L');
            tablero[filaAl][columnaAl] = 'H';
        }
    }
    private static void imprimirTablero() {
        for (int i = 0; i < MAX_FILA ; i++) {
            for (int j = 0; j < MAX_COLUMNA ; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // HERRAMIENTAS
        aleatorio = new Random();
        lector = new Scanner(System.in);
        rellenarTableroL();
        rellenarTableroB();
        rellenarTableroH();
        imprimirTablero();
        System.out.println("Mueve con WASD");
        // Me quedo a la espera del wasd
        char letra = lector.next().charAt(0);// D
        // "DHHHDD"
        // ARRAY DE LETRAS
        // [D,H,H,H,D,D]
        if(letra == 'D'){
            if(columnaB+1>=10){//Controlar límites
                System.out.printf("Fuera de límites");
            }else if(tablero[filaB][columnaB+1]=='H'){
                vidas = vidas -1;
                System.out.println("Te has chocado con un homer.");
            }else {
                tablero[filaB][columnaB]='L';
                columnaB = columnaB+1;
                tablero[filaB][columnaB]='B';

            }


        }
        imprimirTablero();


    }



}
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // HERRAMIENTAS
    // PUNTERO QUE APUNTA A UNA POSICIÓN DE MEMORIA
    // 0 guarradas!!!
    static int num = 0;
    static int num1[] = new int[6];
    static char tablero[][] = new char[10][10];
    static int movimientos[][] = new int[4][2];
    //
    static final char BART = 'B';
    static final char HOMER = 'H';
    static final char MURO = 'M';
    static final char FINAL = 'F';
    static final char LIBRE = 'L';
    //
    static int filaBart = 0;
    static int columBart = 0;
    static Random aleatorio = new Random();
    static void inicializarTablero(){
        // 1) RELLENAR TABLERO
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = 'L';
            }
        }
    }
    static void rellenarTableroB(){
        do {
            filaBart = aleatorio.nextInt(10);
            columBart = aleatorio.nextInt(10);
        }while(tablero[filaBart][columBart]!='L');
        tablero[filaBart][columBart] = BART;
    }
    static void rellenarTablero(char personaje){
        int filaAl = 0;
        int columAl = 0;
        for (int i = 0; i < 10; i++) {
            do {
                filaAl = aleatorio.nextInt(10);
                columAl = aleatorio.nextInt(10);
            }while(tablero[filaAl][columAl]!='L');
            tablero[filaAl][columAl] = personaje;
        }
    }
    private static void imprimirTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int vidas = 10;
    static Scanner lector = new Scanner(System.in);
    private static boolean isFueraTablero() {
        if( filaBart<0 || filaBart >9
                || columBart<0 || columBart>9){
            return true;
        }
        return false; // false
    }
    public static void main(String[] args) {
            inicializarTablero();
            rellenarTableroB();
            rellenarTablero('H');
            rellenarTablero('M');
            imprimirTablero();
            boolean isFinish = false;
            do{
                System.out.println("WASD");
                String mov = lector.next();
                char movC = mov.charAt(0);
                switch (movC) {
                    case 'W','w':
                        /*filaBart + movimientos[3][0];
                        columBart + movimientos[3][1];*/
                        if(isFueraTablero()){

                        }
                        break;
                    case 'A','a':
                        if(isFueraTablero()){

                        }
                        break;
                    case 'S','s':
                        if(isFueraTablero()){

                        }
                        break;
                    case 'D','d':
                        columBart = columBart + 1;//10
                        // columBart++;
                        if(isFueraTablero()){
                            System.out.println("Límites!!!!");
                            columBart--;
                        }else{
                            if(tablero[filaBart][columBart]==HOMER){
                                System.out.println("Has pillado H!!");
                                    vidas--;
                                tablero[filaBart][columBart] = BART;
                            }else if(tablero[filaBart][columBart]==MURO){
                                System.out.println("Muro!!!");
                                columBart--;
                            }else if(tablero[filaBart][columBart]==FINAL){
                                System.out.println("Has ganado!!!");
                                isFinish = true;
                            }else{
                                tablero[filaBart][columBart] = BART;
                                tablero[filaBart][columBart-1] = LIBRE;
                            }
                        }
                        break;
                }
                vidas--;
            }while(isFinish || vidas>0 );// intentos, vidas,
    }




}
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        char[][] mapa = new char[10][10];
        int[][] mapaPuntuaciones = new int[10][12];
        char[] paises = { 'E', 'F', 'I', 'D', 'P', 'C', 'J', 'R', 'B', 'M' };
        // INICIALIZACIÓN
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = '0';
            }
        }
        // ALEATORIAS
        int fila = 0;
        int columna = 0;
        Random ale = new Random();
        for (int i = 0; i < paises.length; i++) {
            do{
                fila = ale.nextInt(10);
                columna = ale.nextInt(10);
            }while (mapa[fila][columna] != '0');
            mapa[fila][columna] = paises[i];
            mapaPuntuaciones[i][0] = fila;
            mapaPuntuaciones[i][1] = columna;
        }
        for (int i = 0; i < mapaPuntuaciones.length; i++) {
            int[] puntuaciones = {0,9,8,7,12,3,5,4,6,2};
            for (int j = 2; j < mapaPuntuaciones[i].length; j++) {
                int pos = 0;
                do {
                    pos = ale.nextInt(10);
                }while(puntuaciones[pos] == -1);
                mapaPuntuaciones[i][j] = puntuaciones[pos];
                puntuaciones[pos] = -1;
            }
        }
        for (int i = 0; i < mapaPuntuaciones.length; i++) {
            for (int j = 0; j < mapaPuntuaciones[i].length ; j++) {
                System.out.print(mapaPuntuaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
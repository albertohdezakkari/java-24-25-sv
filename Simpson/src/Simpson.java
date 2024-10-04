
public class Simpson {
    // VISIBLE A NIVEL DE LA CLASE SIMPSON
    static char[][] tablero = new char[10][10]; //  (0 a N-1)
    // FIN

    // Software de gestión de venta ONLINE
    public static void rellenarTablero(char pers){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 ; j++) {
                tablero[i][j] = 'L';
            }
        }
    }// rellenarTablero ('L');
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
                                        // int contador = 0;
        char personaje = '#';
        rellenarTablero(personaje);
        imprimirTablero();
        personaje = 'H';
        rellenarTablero(personaje);
                                        // contador = 10;


        // for ()
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int op, juego = 1;
        String Peon1 = " P1 ", Peon2 = " P2 "; // Peones
        String[][] tablero = new String[18][18]; // Tablero
        Muro objMuro = new Muro(); // Muros
        ImpTab objImpTab = new ImpTab(); // Imprimir Tablero
        Movimiento objMov = new Movimiento(); // Mover Piezas
        Verificaciones objVeri = new Verificaciones(); // Verificaciones
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        // Tablero Inicial
        objImpTab.TabInicial(tablero, Peon1, Peon2);

        // While Principal
        while (juego != 3) {

            try {

                // Jugador 1
                while (juego == 1) {

                    System.out.println("\nJugador 1 \n¿Que accion desea realizar ahora? \n"
                            + "1) Mover su peon \n2) Colocar Muro \n3) Terminar Partida");
                    op = Integer.parseInt(leer.readLine());
                    switch (op) {
                        case 1:// Mover Peon
                            objMov.MovesP1(tablero, Movimiento.XPeon1, Movimiento.YPeon1, Peon1);
                            juego = 2;
                            break;
                        case 2:// Colocar Muro
                            objMuro.MuroP1(tablero);
                            juego = 2;
                            break; // Fin Colocar Muro
                        case 3:// Terminar Partida
                            juego = 3;
                            System.out.println("\n ----- Partida Interrumpida -----\n ----- Juego finalizado -----");
                            break;
                    } // Fin Switch

                    // Tablero Actualizado
                    objImpTab.TabActual(tablero);

                    // Verificacion de Victoria
                    if (Movimiento.YPeon1 == 16) {
                        objVeri.Ganador(juego);
                        juego = 3;
                    } // Fin Verificacion de Victoria

                } // Fin Jugador 1

                // Jugador 2
                while (juego == 2) {

                    System.out.println("Jugador 2 \n¿Que accion desea realizar ahora? \n"
                            + "1) Mover su peon \n2) Colocar Muro \n3) Terminar Partida");
                    op = Integer.parseInt(leer.readLine());
                    switch (op) {
                        case 1:// Mover Peon
                            objMov.MovesP2(tablero, Movimiento.XPeon2, Movimiento.YPeon2, Peon2);
                            juego = 1;
                            break;
                        case 2:// Colocar Muro
                            objMuro.MuroP2(tablero);
                            juego = 1;
                            break; // Fin Colocar Muro
                        case 3:// Terminar Partida
                            juego = 3;
                            System.out.println("\n ----- Partida Interrumpida -----\n ----- Juego finalizado -----");
                            break;
                    } // Fin Switch

                    // Tablero Actualizado
                    objImpTab.TabActual(tablero);

                    // Verificacion de Victoria
                    if (Movimiento.YPeon2 == 0) {
                        objVeri.Ganador(juego);
                        juego = 3;
                    } // Fin Verificacion de Victoria

                } // Fin Jugador 2

            } // Fin Try

            catch (Exception e) {
                System.out.println("\n ----- ADVERTENCIA -----\n"
                        + "A ingresado un una opcion invalida \nPresione una tecla para intentar de nuevo\n");
                leer.readLine();
            } // Fin Catch

        } // Fin While Principal
    } // Fin Main
}// Fin Clase Menu

import java.io.*;

public class Muro {

    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    int XMuro = 0, YMuro = 0, NMuroP1 = 10, NMuroP2 = 10;// Caracteristicas Muro
    String MuritoX = "====", MuritoY = "| |"; // Muro Diseño
    int op;

    public void MuroP1(String[][] tablero) throws IOException {

        while (true) {
            try {

                do {
                    System.out.println("\nJugador 1 \n¿De que manera desea colocar su muro?\n"
                            + "1) Horizontalmente \n2) Verticalmente");
                    op = Integer.parseInt(leer.readLine());

                    switch (op) {

                        case 1: // Muro Horizontal
                            System.out.println("Ingrese la Coordenadas de X");
                            XMuro = Integer.parseInt(leer.readLine());
                            System.out.println("Ingrese la Coordenadas de Y");
                            YMuro = Integer.parseInt(leer.readLine());
                            // Verificador Para colocar Muro Horizontal
                            if ((XMuro % 2 == 0) && (YMuro % 2 == 0)) {
                                // Verificador Evitar Muro Encima de Muro
                                if (!(tablero[XMuro - 1][YMuro - 1].equals("===="))
                                        && !(tablero[XMuro - 1][YMuro - 1].equals("| |"))) {
                                    tablero[XMuro - 1][YMuro - 2] = MuritoX;
                                    tablero[XMuro - 1][YMuro - 1] = MuritoX;
                                    tablero[XMuro - 1][YMuro] = MuritoX + " ";
                                    NMuroP1 = NMuroP1 - 1;
                                    System.out.println("Ha utilizado un muro le quedan: " + NMuroP1);
                                } else {
                                    System.out.println("Dirección inválida");
                                } // Fin Verificador Evitar Muro Encima de Muro
                            } else {
                                System.out.println("Dirección inválida");
                            } // Fin Verificador Para colocar Muro Horizontal
                            return;

                        case 2: // Muro Vertical
                            System.out.println("Ingrese la Coordenada de X");
                            XMuro = Integer.parseInt(leer.readLine());
                            System.out.println("Ingrese la Coordenada de Y");
                            YMuro = Integer.parseInt(leer.readLine());
                            // Verificador Para colocar Muro Vertical
                            if ((XMuro % 2 == 0) && (YMuro % 2 == 0)) {
                                // Verificador Evitar Muro Encima de Muro
                                if (!(tablero[XMuro - 1][YMuro - 1].equals("===="))
                                        && !(tablero[XMuro - 1][YMuro - 1].equals("| |"))) {
                                    tablero[XMuro - 2][YMuro - 1] = MuritoY;
                                    tablero[XMuro - 1][YMuro - 1] = MuritoY;
                                    tablero[XMuro][YMuro - 1] = MuritoY;
                                    NMuroP1 = NMuroP1 - 1;
                                    System.out.println("Ha utilizado un muro le quedan: " + NMuroP1);
                                } else {
                                    System.out.println("Dirección inválida");
                                } // Fin Verificador Evitar Muro Encima de Muro
                            } else {
                                System.out.println("Dirección inválida");
                            } // Fin Verificador Para colocar Muro Vertical
                            return;

                    } // FIN SWITCH ELECCION DE MUROS
                } while (op != 3);

            } // Fin Try
            catch (Exception e) {
                System.out.println("\n ----- ADVERTENCIA -----\n"
                        + "A ingresado un una opcion invalida \nPresione una tecla para intentar de nuevo\n");
                leer.readLine();
            } // Fin Catch
        } // Fin While

    } // Fin MuroP1

    public void MuroP2(String[][] tablero) throws IOException {

        while (true) {
            try {

                do {
                    System.out.println("\nJugador 2 \n¿De que manera desea colocar su muro?\n"
                            + "1) Horizontalmente \n2) Verticalmente");
                    op = Integer.parseInt(leer.readLine());

                    switch (op) {

                        case 1: // Muro Horizontal
                            System.out.println("Ingrese la Coordenadas de X");
                            XMuro = Integer.parseInt(leer.readLine());
                            System.out.println("Ingrese la Coordenadas de Y");
                            YMuro = Integer.parseInt(leer.readLine());
                            // Verificador Para colocar Muro Horizontal
                            if ((XMuro % 2 == 0) && (YMuro % 2 == 0)) {
                                // Verificador Evitar Muro Encima de Muro
                                if (!(tablero[XMuro - 1][YMuro - 1].equals("===="))
                                        && !(tablero[XMuro - 1][YMuro - 1].equals("| |"))) {
                                    tablero[XMuro - 1][YMuro - 2] = MuritoX;
                                    tablero[XMuro - 1][YMuro - 1] = MuritoX;
                                    tablero[XMuro - 1][YMuro] = MuritoX + " ";
                                    NMuroP2 = NMuroP2 - 1;
                                    System.out.println("Ha utilizado un muro le quedan: " + NMuroP2);
                                } else {
                                    System.out.println("Dirección inválida");
                                } // Fin Verificador Evitar Muro Encima de Muro
                            } else {
                                System.out.println("Dirección inválida");
                            } // Fin Verificador Para colocar Muro Horizontal
                            return;

                        case 2: // Muro Vertical
                            System.out.println("Ingrese la Coordenada de X");
                            XMuro = Integer.parseInt(leer.readLine());
                            System.out.println("Ingrese la Coordenada de Y");
                            YMuro = Integer.parseInt(leer.readLine());
                            // Verificador Para colocar Muro Vertical
                            if ((XMuro % 2 == 0) && (YMuro % 2 == 0)) {
                                // Verificador Evitar Muro Encima de Muro
                                if (!(tablero[XMuro - 1][YMuro - 1].equals("===="))
                                        && !(tablero[XMuro - 1][YMuro - 1].equals("| |"))) {
                                    tablero[XMuro - 2][YMuro - 1] = MuritoY;
                                    tablero[XMuro - 1][YMuro - 1] = MuritoY;
                                    tablero[XMuro][YMuro - 1] = MuritoY;
                                    NMuroP2 = NMuroP2 - 1;
                                    System.out.println("Ha utilizado un muro le quedan: " + NMuroP2);
                                } else {
                                    System.out.println("Dirección inválida");
                                } // Fin Verificador Evitar Muro Encima de Muro
                            } else {
                                System.out.println("Dirección inválida");
                            } // Fin Verificador Para colocar Muro Vertical
                            return;

                    } // FIN SWITCH ELECCION DE MUROS
                } while (op != 3);

            } // Fin Try
            catch (Exception e) {
                System.out.println("\n ----- ADVERTENCIA -----\n"
                        + "A ingresado un una opcion invalida \nPresione una tecla para intentar de nuevo\n");
                leer.readLine();
            } // Fin Catch
        } // Fin While

    } // Fin MuroP2

} // Fin Clase Muro

import java.util.*;

public class Movimiento {

    int op;
    Scanner leer = new Scanner(System.in);
    // Coordenadas Iniciales
    static int YPeon1 = 0, XPeon1 = 8, YPeon2 = 16, XPeon2 = 8;

    public void MovesP1(String[][] tablero, int XPeon, int YPeon, String Peon) {

        while (true) {
            try {

                do { // Panel de Movimiento
                    System.out.println("\nJugador 1 \n¿A cual direccion desea moverse?\n"
                            + "1) Arriba \n2) Abajo \n3) Izquierda \n4) Derecha");
                    op = leer.nextInt();
                    switch (op) { // Switch Movimientos

                        case 1:// Mover Arriba
                               // Verificador por si hay Muro
                            if (!(tablero[YPeon - 1][XPeon].equals("===="))
                                    && !(tablero[YPeon - 1][XPeon].equals("| |"))) {
                                tablero[YPeon][XPeon] = "████";
                                tablero[YPeon - 2][XPeon] = Peon;
                                Movimiento.YPeon1 = YPeon - 2;
                            } else {
                                System.out.println("\n--- ADVERTENCIA ---\n"
                                        + "Hay un muro en el camino \nNo puede realizar esa jugada \n");
                            } // Fin Verificador por si hay Muro
                            return; // Fin Mover Arriba

                        case 2: // Mover Abajo
                                // Verificador por si hay Muro
                            if (!(tablero[YPeon + 1][XPeon].equals("===="))
                                    && !(tablero[YPeon + 1][XPeon].equals("| |"))) {
                                tablero[YPeon][XPeon] = "████";
                                tablero[YPeon + 2][XPeon] = Peon;
                                Movimiento.YPeon1 = YPeon + 2;
                                // Llamada al verificador de victoria
                            } else {
                                System.out.println("\n--- ADVERTENCIA ---\n"
                                        + "Hay un muro en el camino \nNo puede realizar esa jugada \n");
                            } // Fin Verificador por si hay Muro
                            return; // Fin Mover Abajo

                        case 3: // Mover Izquierda
                                // Verificador por si hay Muro
                            if (!(tablero[YPeon][XPeon - 2].equals("===="))
                                    && !(tablero[YPeon][XPeon - 2].equals("| |"))) {
                                tablero[YPeon][XPeon] = "████";
                                tablero[YPeon][XPeon - 2] = Peon;
                                Movimiento.XPeon1 = XPeon - 2;
                            } else {
                                System.out.println("\n--- ADVERTENCIA ---\n"
                                        + "Hay un muro en el camino \nNo puede realizar esa jugada \n");
                            } // Fin Verificador por si hay Muro
                            return; // Fin Mover Izquierda

                        case 4: // Mover Derecha
                                // Verificador por si hay Muro
                            if (!(tablero[YPeon][XPeon + 2].equals("===="))
                                    && !(tablero[YPeon][XPeon + 2].equals("| |"))) {
                                tablero[YPeon][XPeon] = "████";
                                tablero[YPeon][XPeon + 2] = Peon;
                                // Verificador para que no se salga del Tablero
                                if (XPeon + 2 <= 16) {
                                    Movimiento.XPeon1 = XPeon + 2;
                                } else {
                                    System.out.println("\n--- ADVERTENCIA ---\n"
                                            + "Movimiento invalido");
                                } // Fin Verificador para que no se salga del Tablero
                            } else {
                                System.out.println("\n--- ADVERTENCIA ---\n"
                                        + "Hay un muro en el camino \nNo puede realizar esa jugada \n");
                            } // Fin Verificador por si hay Muro
                            return; // Fin Mover Derecha

                    }// Fin Switch Movimientos
                } while (op != 5); // Fin Panel de Movimiento

            } // Fin Try
            catch (Exception e) {
                System.out.println("\n ----- ADVERTENCIA -----\n"
                        + "A ingresado un una opcion invalida \nPresione una tecla para intentar de nuevo\n");
                leer.next();
            } // Fin Catch
        } // Fin While

    }// Fin MovesP1

    public void MovesP2(String[][] tablero, int XPeon, int YPeon, String Peon) {

        while (true) {
            try {

                do { // Panel de Movimiento
                    System.out.println("\nJugador 2 \n¿A cual direccion desea moverse?\n"
                            + "1) Arriba \n2) Abajo \n3) Izquierda \n4) Derecha");
                    op = leer.nextInt();
                    switch (op) { // Switch Movimientos

                        case 1:// Mover Arriba
                               // Verificador por si hay Muro
                            if (!(tablero[YPeon - 1][XPeon].equals("===="))
                                    && !(tablero[YPeon - 1][XPeon].equals("| |"))) {
                                tablero[YPeon][XPeon] = "████";
                                tablero[YPeon - 2][XPeon] = Peon;
                                Movimiento.YPeon2 = YPeon - 2;
                            } else {
                                System.out.println("\n--- ADVERTENCIA ---\n"
                                        + "Hay un muro en el camino \nNo puede realizar esa jugada \n");
                            } // Fin Verificador por si hay Muro
                            return; // Fin Mover Arriba

                        case 2: // Mover Abajo
                                // Verificador por si hay Muro
                            if (!(tablero[YPeon - 1][XPeon].equals("===="))
                                    && !(tablero[YPeon - 1][XPeon].equals("| |"))) {
                                tablero[YPeon][XPeon] = "████";
                                tablero[YPeon + 2][XPeon] = Peon;
                                Movimiento.YPeon2 = YPeon + 2;
                            } else {
                                System.out.println("\n--- ADVERTENCIA ---\n"
                                        + "Hay un muro en el camino \nNo puede realizar esa jugada \n");
                            } // Fin Verificador por si hay Muro
                            return; // Fin Mover Abajo

                        case 3: // Mover Izquierda
                                // Verificador por si hay Muro
                            if (!(tablero[YPeon - 1][XPeon].equals("===="))
                                    && !(tablero[YPeon - 1][XPeon].equals("| |"))) {
                                tablero[YPeon][XPeon] = "████";
                                tablero[YPeon][XPeon - 2] = Peon;
                                Movimiento.XPeon2 = XPeon - 2;
                            } else {
                                System.out.println("\n--- ADVERTENCIA ---\n"
                                        + "Hay un muro en el camino \nNo puede realizar esa jugada \n");
                            } // Fin Verificador por si hay Muro
                            return; // Fin Mover Izquierda

                        case 4: // Mover Derecha
                                // Verificador por si hay Muro
                            if (!(tablero[YPeon - 1][XPeon].equals("===="))
                                    && !(tablero[YPeon - 1][XPeon].equals("| |"))) {
                                tablero[YPeon][XPeon] = "████";
                                tablero[YPeon][XPeon + 2] = Peon;
                                // Verificador para que no se salga del Tablero
                                if (XPeon + 2 <= 16) {
                                    Movimiento.XPeon2 = XPeon + 2;
                                } else {
                                    System.out.println("\n--- ADVERTENCIA ---\n"
                                            + "Movimiento invalido");
                                } // Fin Verificador para que no se salga del Tablero
                            } else {
                                System.out.println("\n--- ADVERTENCIA ---\n"
                                        + "Hay un muro en el camino \nNo puede realizar esa jugada \n");
                            } // Fin Verificador por si hay Muro
                            return; // Fin Mover Derecha

                    }// Fin Switch Movimientos
                } while (op != 5); // Fin Panel de Movimiento

            } // Fin Try
            catch (Exception e) {
                System.out.println("\n ----- ADVERTENCIA -----\n"
                        + "A ingresado un una opcion invalida \nPresione una tecla para intentar de nuevo\n");
                leer.next();
            } // Fin Catch
        } // Fin While

    }// Fin MovesP2

}// Fin Clase Movimiento

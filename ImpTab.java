public class ImpTab {

    // Metodo Imprimir Tablero Inicial
    public void TabInicial(String[][] tablero, String P1, String P2) {
        // Imprimir Tablero
        System.out.println();
        for (int y = 0; y < tablero.length; y++) {
            for (int x = 0; x < tablero.length; x++) {
                if (y % 2 == 0 && x % 2 == 0) {
                    tablero[y][x] = "████";
                } else {
                    tablero[y][x] = "    ";
                }
                // Coordenadas Horizontales
                tablero[17][0] = " 1  ";
                tablero[17][1] = " 2  ";
                tablero[17][2] = " 3  ";
                tablero[17][3] = " 4  ";
                tablero[17][4] = " 5  ";
                tablero[17][5] = " 6  ";
                tablero[17][6] = " 7  ";
                tablero[17][7] = " 8  ";
                tablero[17][8] = " 9  ";
                tablero[17][9] = " 10 ";
                tablero[17][10] = " 11 ";
                tablero[17][11] = " 12 ";
                tablero[17][12] = " 13 ";
                tablero[17][13] = " 14 ";
                tablero[17][14] = " 15 ";
                tablero[17][15] = " 16 ";
                tablero[17][16] = " 17 ";
                // Coordenadas Verticales
                tablero[0][17] = "  1";
                tablero[1][17] = "  2";
                tablero[2][17] = "  3";
                tablero[3][17] = "  4";
                tablero[4][17] = "  5";
                tablero[5][17] = "  6";
                tablero[6][17] = "  7";
                tablero[7][17] = "  8";
                tablero[8][17] = "  9";
                tablero[9][17] = " 10";
                tablero[10][17] = " 11";
                tablero[11][17] = " 12";
                tablero[12][17] = " 13";
                tablero[13][17] = " 14";
                tablero[14][17] = " 15";
                tablero[15][17] = " 16";
                tablero[16][17] = " 17";
                // Imprimir Peones
                tablero[0][8] = P1;
                tablero[16][8] = P2;
                System.out.print(tablero[y][x]);
            }
            System.out.println();
        } // Fin Impremir: Tablero, Peones
    }// Fin TabInicial

    // Metodo Actualizar Tablero
    public void TabActual(String[][] tablero) {
        System.out.println();
        // Actualizar Tablero
        for (int y = 0; y < tablero.length; y++) {
            for (int x = 0; x < tablero.length; x++) {
                System.out.print(tablero[y][x]);
            }
            System.out.println();
        } // Fin Actualizar Tablero
        System.out.println();
    }// Fin TabActual

}// Fin Clase ImpTab

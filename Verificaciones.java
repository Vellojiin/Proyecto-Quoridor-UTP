public class Verificaciones {

    public void Ganador(int Juego) {

        // Victoria Peon1
        if (Movimiento.YPeon1 == 16) {
            System.out.println("\n --- Partida terminada --- \n --- Ha ganado Jugador 1 --- ");
            Juego = 3;
        } // Fin Victoria Peon1

        // Victoria Peon2
        else if (Movimiento.YPeon2 == 0) {
            System.out.println("\n --- Partida terminada --- \n --- Ha ganado Jugador 2 --- ");
            Juego = 3;
        } // Fin Victoria Peon2
    } // Fin Ganador

} // Fin Clase Verificaciones

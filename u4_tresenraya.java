public class u4_tresenraya {
    private static char[][] tablero = new char[3][3];
    private static boolean turnoX = true;
    private static int turnosJugados = 0;

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        inicializarTablero();

        while (true) {
            mostrarTablero();
            System.out.println("Turno de " + (turnoX ? "X" : "O"));
            System.out.print("Ingrese fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese columna (0-2): ");
            int columna = scanner.nextInt();

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Posición inválida. Intente nuevamente.");
                continue;
            }

            if (tablero[fila][columna] != ' ') {
                System.out.println("Casilla ocupada. Intente nuevamente.");
                continue;
            }

            tablero[fila][columna] = turnoX ? 'X' : 'O';
            turnosJugados++;

            if (hayGanador()) {
                mostrarTablero();
                System.out.println("¡" + (turnoX ? "X" : "O") + " es el ganador!");
                break;
            } else if (turnosJugados == 9) {
                mostrarTablero();
                System.out.println("¡Empate!");
                break;
            }

            turnoX = !turnoX;
        }
        scanner.close();
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    private static void mostrarTablero() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    private static boolean hayGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) return true;
            if (tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) return true;
        }
        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) return true;
        if (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) return true;
        return false;
    }
}

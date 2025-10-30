public class u4_encuesta {
    public static void main(String[] args) {
        int[][] encuesta = new int[10][5];
        double[] promedios = new double[5];
        int maxPuntaje = 0;
        int usuarioMax = 0;

        // Llenar la encuesta con respuestas aleatorias
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                encuesta[i][j] = (int)(Math.random() * 5) + 1;
                if (encuesta[i][j] > maxPuntaje) {
                    maxPuntaje = encuesta[i][j];
                    usuarioMax = i + 1;
                }
            }
        }

        // Calcular promedios por pregunta
        for (int j = 0; j < 5; j++) {
            double suma = 0;
            System.out.print("Respuestas pregunta " + (j+1) + ": ");
            for (int i = 0; i < 10; i++) {
                System.out.print(encuesta[i][j] + " ");
            }
            System.out.println();
            for (int i = 0; i < 10; i++) {
                suma += encuesta[i][j];
            }
            promedios[j] = suma / 10;
            System.out.printf("Promedio pregunta %d: %.2f%n", (j+1), promedios[j]);
        }

        System.out.println("Usuario " + usuarioMax + " dio la calificación más alta: " + maxPuntaje);
    }
}

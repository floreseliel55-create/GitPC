public class u4_estadisticas {
    public static void main(String[] args) {
        double[][] ventas = new double[4][5];
        double[] totalProducto = new double[4];
        double maxVentaSemana = 0;
        int semanaMasVentas = 0;

        // Generar ventas aleatorias
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                ventas[i][j] = Math.random() * 1000;
                totalProducto[i] += ventas[i][j];
            }
        }

        // Encontrar semana con más ventas
        for (int j = 0; j < 5; j++) {
            double ventaSemana = 0;
            for (int i = 0; i < 4; i++) {
                ventaSemana += ventas[i][j];
            }
            if (ventaSemana > maxVentaSemana) {
                maxVentaSemana = ventaSemana;
                semanaMasVentas = j + 1;
            }
        }

        // Mostrar resultados
        System.out.println("Total por producto:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Producto %d: $%.2f%n", i + 1, totalProducto[i]);
        }
        System.out.printf("Semana con más ventas: Semana %d%n", semanaMasVentas);
    }
}

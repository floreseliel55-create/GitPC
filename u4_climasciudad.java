public class u4_climasciudad {
	public static void main(String[] args) {
		//arreglo bidimensional
		//temperatura dd 7 dias en 3 cuidades
		//sacar promedio de cada ciudad y el dia mas caliente
		int[][] temperaturas = new int[7][3];
    int guardar = 0;
    for (int dia = 0; dia < 7; dia++) {
        for (int ciudad = 0; ciudad < 3; ciudad++) {
            temperaturas[dia][ciudad] = (int) (Math.random() * (45 - (-10) + 1) + (-10));
        }
    }
    
    System.out.println("Dia\tCiudad1\tCiudad2\tCiudad3");
    for (int dia = 0; dia < 7; dia++) {
        System.out.print("Dia " + (dia + 1) + "\t");
        for (int ciudad = 0; ciudad < 3; ciudad++) {
            System.out.print(temperaturas[dia][ciudad] + "\t\t");
        }
        System.out.println(); 
    }
    
    
    for (int ciudad = 0; ciudad < 3; ciudad++) {
        for (int diaInterno = 0; diaInterno < 7; diaInterno++) {
            guardar += temperaturas[diaInterno][ciudad];
        }
        int promedio = guardar / 7;
        System.out.println("Promedio Ciudad " + (ciudad + 1) + ": " + promedio);
        guardar = 0; 
    }
    
    for (int ciudad = 0; ciudad < 3; ciudad++) {
        int diaMasCaluroso = 0;
        for (int diaInterno = 1; diaInterno < 7; diaInterno++) {
            if (temperaturas[diaInterno][ciudad] > temperaturas[diaMasCaluroso][ciudad]) {
                diaMasCaluroso = diaInterno;
            }
        }
        System.out.println("Día más caluroso Ciudad " + (ciudad + 1) + ": Día " + (diaMasCaluroso + 1) + " con temperatura " + temperaturas[diaMasCaluroso][ciudad]);
    }
}
}



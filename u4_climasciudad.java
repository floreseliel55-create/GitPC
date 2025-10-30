public class u4_climasciudad {
	public static void main(String[] args) {
		//arreglo bidimensional
		//temperatura dd 7 dias en 3 cuidades
		//sacar promedio de cada ciudad y el dia mas caliente
		int[][] temperaturas = new int[7][3];
		int guardar=0;
		for(int dia=0;dia < 7;dia++ ){
			for(int ciudad=0; ciudad<3;ciudad++){
				temperaturas[dia][ciudad]=(int)(Math.random()*(45 - (-10)+1)+(-10));
		}
		
	}
    System.out.println("Dia\tCiudad1\t         Ciudad2\t Ciudad3");
		for(int dia=0;dia < 7;dia++ ){
			System.out.print("Dia "+(dia+1)+"\t");
			for(int ciudad=0; ciudad<3;ciudad++){
				System.out.print(temperaturas[dia][ciudad]+"\t\t ");
                if(){
                    
                }
			}
			System.out.println(); 
		}
	}
}



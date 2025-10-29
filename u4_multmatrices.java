public class u4_multmatrices {
    public static void main(String[] args) {
        //arreglo bidimensional 3x3 y sumar dos matrices
        int fila, colum;
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] suma= new int[3][3];
        for(fila =0;fila<matriz1.length;fila++){
            for( colum=0;colum<matriz2.length; colum++){
                
                matriz1[fila][colum]=(int)(Math.random()*100+1);
                matriz2[fila][colum]=(int)(Math.random()*100+1);
                suma[fila][colum]=matriz1[fila][colum]*matriz2[fila][colum];
                
            }
        
        }
        for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.println("["+i+"]"+"["+j+"]"+matriz1[i][j]);
                    }
                }

                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.println("["+i+"]"+"["+j+"]"+matriz2[i][j]);
                    }
                    
                }
                System.out.println("Suma de matriz: ");
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.println("["+i+"]"+"["+j+"]"+suma[i][j]);
                    }
                    
                }
    }
}

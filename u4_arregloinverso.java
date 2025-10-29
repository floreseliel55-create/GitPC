import java.util.Scanner;
public class u4_arregloinverso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //arreglo de N numeros y mostrar el arreglo ordenado descendentemente
        int n=0;
        System.out.println("Ingrese la cantidad");
        n = sc.nextInt();
        int[] numeros = new int[n];
        System.out.println("llene el arreglo:");
        for(int i=0;i < n; i++){
            numeros[i] = sc.nextInt();
        }
        //ordenar el arreglo
        for(int i=0;i < n; i++){
            for(int j=i+1; j < n; j++){
                int numeromenor=0;
                 
                if(numeros[i]<numeros[j]){
                   
                    numeromenor= numeros[i];
                   
                    numeros[i]= numeros[j];

                    numeros[j]= numeromenor;

                }
            }
        }
        //mostrar el arreglo ordenado
        System.out.println("arreglo ordenado:");
        for(int i=0;i < n; i++){
            System.out.print(numeros[i]+" ");
        }
    }
}



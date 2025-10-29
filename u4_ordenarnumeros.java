import java.util.Scanner;
public class u4_ordenarnumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //arreglo de N numeros y mostrar el arreglo ordenado ascendentemente
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
                int numeromayor=0;
                 System.out.println(numeromayor+"="+i+","+numeros[i]);
                    System.out.println(numeros[i]+"="+j+","+numeros[j]);
                     System.out.println(numeros[j]+"="+j+","+numeromayor);
                     //si numero posicion i es mayor a numero posicion j entonces intercambiarlos
                if(numeros[i]>numeros[j]){
                    //sabemos que numero i es mayor a numero j
                    //entonces guardamos el numero mayor en una variable temporal
                    //porque lo vamos a eliminar y cambiar de posicion por lo tanto lo necesitamos tener
                    numeromayor= numeros[i];
                    //numero mayor que es i lo borramos y ahora es igual al numero j entonces
                    //numero j y numero i en este punto son iguales
                    //es decir que el numero menor esta en la misma posicion que estaba el numero mayor
                    numeros[i]= numeros[j];
                    //ahora el numero en la posicion j le damos el valor mayor
                    //porque necesitamos que el numero mayor quede en la posicion 
                    //mas alejada del inicio del arreglo que viene siendo j 
                    numeros[j]= numeromayor;
                    //repetimos el ciclo hasta ordenar todo el arreglo
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


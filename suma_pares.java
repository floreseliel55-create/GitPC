import java.util.Scanner;
public class suma_pares {
    public static void main(String[] args){
        //suma de numeros pares
        Scanner sc = new Scanner(System.in);
        int lim, suma;
        suma=0;
        System.out.println("Este programa sumara todos los numeros pares positivo hasta el numero que ingrese: ");
        System.out.println("Ingrese un numero entero positivo: ");
           lim = sc.nextInt();
           if(lim>=0){
           for(int i=1; i <= lim; i+=2){
            suma+=i;
           
           }
           System.out.println("La suma de los numeros impares es de: "+suma);

        }
    }
    
}

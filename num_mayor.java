import java.util.Scanner;
public class num_mayor {
    public static void main( String[] args){
        // programa que calcule el mayor de dos numeros
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("Programa que calcula entre dos numeros el mayor: ");
        do{
        
        System.out.println("Ingresa el primer numero: ");
        a = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        b = sc.nextInt();
        if(a>b){
            System.out.println("El primer numero "+a+" es mayor que el segundo "+b);
        } 
        if(a<b){
            System.out.println("El segundo numero "+b+" es mayor que el primero "+a);
        }
        else{
            System.out.println("los dos numeros introducidos son equivalentes: ");
        }
    } while(a != 0 && b !=0);
    System.out.println("Fin del programa: ");
    }
}

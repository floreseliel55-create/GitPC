import java.util.Scanner;
public class num_primo {
    public static void main(String[] args) {
        //programa que verrifica si un numero es primo o no
        float numero;
        
Scanner sc = new Scanner(System.in);
System.out.println("programa que Verifica si un numero es o no es primo: ");
do{
System.out.println("Ingrese numero: ");
numero = sc.nextFloat();
for(int i=2; i<numero; i++){
    if(numero % i == 0){
        System.out.println("No es un numero primo: ");
        break;
    }
    else if(numero % i !=0){
        System.out.println("Es primo: ");
        break;
    }
}
} while(numero >1);
    }
}

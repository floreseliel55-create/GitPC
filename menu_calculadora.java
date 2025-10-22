import java.util.Scanner;
public class menu_calculadora {
    public static void main(String[] args) {
        //programa que haga un menu de op basicas entre dos numeros y se repita hasta que ingrese salir
        Scanner sc = new Scanner(System.in);
        int resultado, opciones, num1, num2;
        
        System.out.println("programa que hace operaciones basicas entre 2 numeros");
        System.out.println("Escoga una de las siguientes opciones: ");
        System.out.println("1- Salir: ");
        System.out.println("2- Sumar: ");
        System.out.println("3- Restar: ");
        System.out.println("4- Multiplicar: ");
        System.out.println("5- Dividir: ");
        
        do{
            System.out.println("Ingrese una opcion: ");
        opciones=sc.nextInt();
        if(opciones ==1){
            System.out.println("Fin del programa: ");
            return;
        }
         System.out.println("ingrese el primer numero: ");
            num1=sc.nextInt();
            System.out.println("ingrese el segundo numero: ");
            num2=sc.nextInt();
           
            if(opciones == 2){
                resultado=num1+num2;
                System.out.println("El resultado de la suma es de: "+resultado);
                
            }
            else if(opciones ==3){
                resultado=num1-num2;
                System.out.println("El resultado de la resta es de: "+resultado);
                            
            }
                else if(opciones ==4){
                    resultado=num1*num2;
                    System.out.println("El resultado de la multiplicacion es de: "+resultado);
                }
                else if(opciones == 5){
                    resultado=num1/num2;
                    System.out.println("El resultado de la division es de: "+resultado);
                }
            
        }while(opciones !=1);
    }
}

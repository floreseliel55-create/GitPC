import java.util.Scanner;
public class clas_edades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //programa que pida edades y las clasifique en niño, adolescente, adulto, anciano
        int edad;
        System.out.println("Programa que calcula edades: ");
        edad = 0;
        while(edad>=0){   
        System.out.println("Ingresa edad: ");
        edad =sc.nextInt();
        if(edad<=10 && edad >=0){
        System.out.println("Esta en la etapa de la niñez:");

        }
        if(edad>10 && edad < 18){
            System.out.println("Es adolescente: ");
        } 
        if(edad>17 && edad <60){
            System.out.println("Es Adulto: ");
        }
        if(edad >59) {
            System.out.println("Es adulto mayor: ");
        }
        
        }
System.out.println("Fin del programa:");
    }
    
}

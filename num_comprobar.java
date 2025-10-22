import java.util.Scanner;
public class num_comprobar {
    public static void main( String[] args){
        //comprobar si numero es positivo o negativo
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("para salir del programa introduzca 0: ");
        num = 1;
        while(num !=0){
            System.out.println("introduzca un numero: ");
        num = sc.nextInt();
        if(num>0){
            System.out.println("el numero es positivo: ");

        }
        else if(num<0){
            System.out.println("el numero es negativo: ");

        }
    }
        System.out.println("Fin del programa: ");
    }
} 


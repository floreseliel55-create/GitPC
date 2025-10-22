import java.util.Scanner;
public class num_secreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_secreto, intento;
        num_secreto = (int)(Math.random()*10+1);

        
       
        do{
             System.out.println("Intente adivinar un numero aleatorio del 1 al 10: ");
        intento = sc.nextInt();
        if(intento == num_secreto){
            System.out.println("Has acertado el numero secreto: " + num_secreto);
            
        }
        else if(intento < num_secreto){
            System.out.println("El numero secreto es mayor: ");
        }
        else if(intento > num_secreto){
            System.out.println("El numero secreto es menor: ");
        }
    }while(intento != num_secreto);

}
}
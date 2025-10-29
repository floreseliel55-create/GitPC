import java.util.Scanner;
public class u4_buscarenarreglo {
    public static void main(String[] args) {
        int Buscar, posicion=0;
        boolean encontrado= false;
        Scanner sc = new Scanner(System.in);
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Ingrese un numero a Buscar:");
        Buscar = sc.nextInt();
        for(int i=0; i< arreglo.length; i++){
        if(arreglo[i]==Buscar){
        encontrado = true;
        posicion=i;
        break;
        }
        else {
            encontrado = false;
        }
        }
        if(encontrado){
            System.out.println("El numero fue encontrado en la posicion "+posicion);

        }
        if(encontrado == false){
            System.out.println("El numero no fue encontrado: ");
        }
        }
}

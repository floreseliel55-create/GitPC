import java.util.Scanner;
public class Tabla_mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Tablas de multiplicar del 1 al 10: ");
        for(int i=1; i <=10; i++){
            System.out.println("Tabla del "+i);
            for(int j=1; j <=10; j++){
                int res = i*j;
            
            System.out.println(+i+"x"+j+"="+res);
            }
        }
    }
}

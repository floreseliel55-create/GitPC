public class promedio {
    public static void main(String[] args) {
        //programa que calcule el promedio de x notas
        int notas=0, promedio=0, suma=0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas a promediar: ");
        notas = sc.nextInt();
        for(int i=1; i<=notas; i++){
            System.out.println("Ingrese la nota "+i+": ");
            int nota = sc.nextInt();
            suma += nota;
            if(nota ==7){
                System.out.println("La nota " + nota + " es Regular.");
            }
            if(nota ==8){
                System.out.println("La nota " + nota + " es Buena.");
            }
            if(nota ==9 || nota ==10){
                System.out.println("La nota " + nota + " es Excelente.");
            }
            else if(nota <7){
                System.out.println("La nota " + nota + " es Reprobatoria.");
            }
        }   
        
        promedio = suma / notas;
        System.out.println("El promedio es: " + promedio);
    }
}

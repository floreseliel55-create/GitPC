import java.util.Scanner;
public class u4_arreglounidimensional {
    public static void main(String[] args) {
        int n, aprobados=0, reprobados=0, promedio=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el numero de Alumnos a calificar:");
        n = sc.nextInt();
        int[] alumnos = new int[n];
        for(int i=0; i < n; i++){
            System.out.println("Ingrese la calificacion de los alumnos:");
            alumnos[i] = sc.nextInt();
            promedio += alumnos[i];


             if(alumnos[i]>= 70 && alumnos[i]<= 100){
                aprobados++;
            }else if(alumnos[i]<70 && alumnos[i]==0){
                reprobados++;
            }
            else{
                System.out.println("Ingreso calificacion incorrecta:");
                return;
            }

        }
        for (int j =0; j < alumnos.length; j++){
        System.out.println("alumno "+(j+1)+" Saco "+alumnos[j]);
    }
    promedio = promedio / n;
        System.out.println("Total de alumnos aprobados: " + aprobados);
        System.out.println("Total de alumnos reprobados: " + reprobados);
        System.out.println("EL promedio general es de: "+promedio);
}
}

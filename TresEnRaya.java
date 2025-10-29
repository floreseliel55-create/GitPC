import java.util.Scanner;
public class TresEnRaya{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jugadores=true;
        int fila=0, columna=0;
        char x = 'x';
        char[][] tablero = new char[3][3];
        System.out.println("---Tres en raya---");
        System.out.println("Llene el tres en raya: ");
                System.out.println("["+"]"+"["+"]"+"["+"]"); 
                System.out.println("["+"]"+"["+"]"+"["+"]"); 
                System.out.println("["+"]"+"["+"]"+"["+"]"); 
  
        System.out.println("ingrese primero fila y despues columna a colocar y despues X o O");
        
        for(int f=0;f<3;f++){
            for(int c=0;c<3;c++){
                
                fila = sc.nextInt();
                fila=fila-1;
                columna = sc.nextInt();
                columna=columna-1;
                if(jugadores == true){
                tablero[fila][columna] = x;
                jugadores = false;
                }
                else{
                jugadores = true;
                    tablero[fila][columna] = 'O';
                }
                System.out.println("         fila-->");
                System.out.println("Columna|  ["+tablero[0][0]+"]"+"["+tablero[0][1]+"]"+"["+tablero[0][2]+"]"); 
                    System.out.println("       |  ["+tablero[1][0]+"]"+"["+tablero[1][1]+"]"+"["+tablero[1][2]+"]"); 
                    System.out.println("       |  ["+tablero[2][0]+"]"+"["+tablero[2][1]+"]"+"["+tablero[2][2]+"]");
                    if(tablero[0][0]=='x' && tablero[0][1]=='x' && tablero[0][2]=='x'){
                        System.out.println("Gano X");
                        return;
                    }
                    else if(tablero[1][0]=='x' && tablero[1][1]=='x' && tablero[1][2]=='x'){
                        System.out.println("Gano X");
                        return;
                    }
                    else if(tablero[2][0]=='x' && tablero[2][1]=='x' && tablero[2][2]=='x'){
                        System.out.println("Gano X");
                        return;
                    }
                    else if(tablero[0][0]=='x' && tablero[1][0]=='x' && tablero[2][0]=='x'){
                        System.out.println("Gano X");
                        return;
                    }
                    else if(tablero[0][1]=='x' && tablero[1][1]=='x' && tablero[2][1]=='x'){
                        System.out.println("Gano X");
                        return;
                    }
                    else if(tablero[0][2]=='x' && tablero[1][2]=='x' && tablero[2][2]=='x'){
                        System.out.println("Gano X");
                        return;
                    }
                    else if(tablero[0][0]=='x' && tablero[1][1]=='x' && tablero[2][2]=='x'){
                        System.out.println("Gano X");
                        return;
                    }
                    else if(tablero[0][2]=='x' && tablero[1][1]=='x' && tablero[2][0]=='x'){
                        System.out.println("Gano X");
                        return;
                    }
                    //separaciooooooooooooooooooooooooooooooooooooooooooooooooooooooon de ganadores
                    if(tablero[0][0]=='O' && tablero[0][1]=='O' && tablero[0][2]=='O'){
                        System.out.println("Gano O");
                        return;
                    }
                    else if(tablero[1][0]=='O' && tablero[1][1]=='O' && tablero[1][2]=='O'){
                        System.out.println("Gano O ");
                        return;
                    }
                    else if(tablero[2][0]=='O' && tablero[2][1]=='O' && tablero[2][2]=='O'){
                        System.out.println("Gano O");
                        return;
                    }
                    else if(tablero[0][0]=='O' && tablero[1][0]=='O' && tablero[2][0]=='O'){
                        System.out.println("Gano O");
                        return;
                    }
                    else if(tablero[0][1]=='O' && tablero[1][1]=='O' && tablero[2][1]=='O'){
                        System.out.println("Gano O");
                        return;
                    }
                    else if(tablero[0][2]=='O' && tablero[1][2]=='O' && tablero[2][2]=='O'){
                        System.out.println("Gano O");
                        return;
                    }
                    else if(tablero[0][0]=='O' && tablero[1][1]=='O' && tablero[2][2]=='O'){
                        System.out.println("Gano O");
                        return;
                    }
                    else if(tablero[0][2]=='O' && tablero[1][1]=='X' && tablero[2][0]=='X'){
                        System.out.println("Gano O");
                        return;
                    }  
                
            

        }
        
    }

}
}


                    
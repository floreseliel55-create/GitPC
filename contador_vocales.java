import java.util.Scanner;
public class contador_vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase="";
        int contador=0;
        while(true){
             System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
        if(frase.equalsIgnoreCase("fin")){
            System.out.println("Fin del programa: ");
            break;
        }
        for(int i = 0; i < frase.length(); i++){
        char letra = frase.charAt(i);
        letra = Character.toLowerCase(letra);
        if(letra =='a' || letra =='e' || letra =='i' || letra =='o' || letra =='u'){
            contador+=1;
            
        }
        }
        
        System.out.println("La frase tiene "+contador+" vocales:");
        contador=0;
    
    }
}
}

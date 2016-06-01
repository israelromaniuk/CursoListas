package listadeexercicios;

import java.util.Scanner;

public class ListaDeExerciciosPorFora {

    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Digite o número do exercício > ");
        String exercicio = ler.next();
        
        switch(exercicio){
            case "1":
                fibonacci();
                break;
    }
        
    }

    private static void fibonacci() {
        
        System.out.println("Fibonacci\n");
        
        int valor [] = new int[12];
        
        for(int i = 1; i<12; i++){
            
            System.out.println(valor+""+valor);
            
        }
    }
    
}

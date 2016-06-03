package listadeexercicios;

import java.util.Scanner;

public class MenuListas {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o número da Lista > ");
        String exercicio = ler.next();

        switch (exercicio) {
            case "0":
                ExerciciosPorFora.main(null);
                break;
            case "1":
                ListaDeExercicios01.main(null);
                break;
            case "2":
                ListaDeExercicios02.main(null);
                break;
            case "3":
                ListadeExercicios03.main(null);
                break;
            case "4":
                //PERDIDO------------------------------------------------------------------------
                break;
            case "5":
                ListadeExercicios05.main(null);
                break;
            case "6":
                ListaDeExercicios06.main(null);
                break;
            case "7":
                //PERDIDO ------------------------------------------------------------------------
                break;
            case "8":
                ListaDeExercicios08.main(null);
                break;
            case "9":
                ListaDeExercicios09.main(null);
                break;
            default:
                System.out.println("Lista não existe...\n");
                main(null);
                break;

        }
    }
}

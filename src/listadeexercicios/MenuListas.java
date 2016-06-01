package listadeexercicios;

import java.util.Scanner;

public class MenuListas {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o número da Lista > ");
        String exercicio = ler.next();

        switch (exercicio) {
            case "0":
                ExerciciosPorFora ExerciciosPorFora = new ExerciciosPorFora();
                ExerciciosPorFora.main(null);
                break;
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                ListaDeExercicios08 lista8 = new ListaDeExercicios08();
                lista8.main(null);
                break;
            case "9":
                ListaDeExercicios09 lista9 = new ListaDeExercicios09();
                lista9.main(null);
                break;

            default:
                System.out.println("Lista não existe...\n");
                main(null);
                break;

        }
    }
}

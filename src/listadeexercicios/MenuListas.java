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
                ListaDeExercicios01 lista1 = new ListaDeExercicios01();
                lista1.main(null);
                break;
            case "2":
                //PERDIDO
                break;
            case "3":
                ListadeExercicios03 lista3 = new ListadeExercicios03();
                lista3.main(null);
                break;
            case "4":
                //PERDIDO
                break;
            case "5":
                ListadeExercicios05 lista5 = new ListadeExercicios05();
                lista5.main(null);
                break;
            case "6":
                ListaDeExercicios06 lista6 = new ListaDeExercicios06();
                lista6.main(null);
                break;
            case "7":
                //PERDIDO
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

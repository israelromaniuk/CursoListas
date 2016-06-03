package listadeexercicios;

import static listadeexercicios.ListaDeExercicios01.ler;

public class ExerciciosPorFora {

    public static void main(String[] args) {

        boolean rVouF = true;

        while (rVouF) {

            System.out.println("--------------------------------------------");
            System.out.printf("DIGITE O NÚMERO DA QUEST�O > ");
            String resposta1 = ler.next();

            System.out.println("--------------------------------------------");

            switch (resposta1) {
                case "0":
                    MenuListas menu = new MenuListas();
                    menu.main(null);
                case "1":
                    Exercicio001();
                    rVouF = false;
                    break;
                default:
                    System.out.println("Questão não encontrada...");
                    main(null);
                    break;
            }
        }
    }

    private static void Exercicio001() {
        
        System.out.println("MATRIZ\n");

        int linha[][] = new int[4][4];

        for (int i = 1; i <= 3; i++) {
            for (int x = 1; x <= 3; x++) {
                System.out.printf("Digite o número da matriz [%s][%s] > ", i, x);
                linha[i][x] = ler.nextInt();
            }
        }

        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(linha[a][b]+" ");
            }
            
            System.out.println();
        }
        main(null);
    }

}

package listadeexercicios;

import static listadeexercicios.ListaDeExercicios01.ler;

public class ListaDeExercicios10 {

    public static void main(String[] args) {
    
        boolean rVouF = true;

        while (rVouF) {

            System.out.println("--------------------------------------------");
            System.out.printf("DIGITE O NÚMERO DA QUEST�O > ");
            String resposta1 = ler.next();

            System.out.println("--------------------------------------------");

            switch (resposta1) {
                case "1":
                    
                    rVouF = false;
                    break;
                case "2":
                    Exercicio002();
                    rVouF = false;
                    break;
                case "3":
                    Exercicio003();
                    rVouF = false;
                    break;
                case "4":
                    Exercicio004();
                    rVouF = false;
                    break;
                case "5":
                    Exercicio005();
                    rVouF = false;
                    break;
                case "6":
                    Exercicio006();
                    rVouF = false;
                    break;
                    case "7":
                    Exercicio007();
                    rVouF = false;
                    break;
                case "8":
                    Exercicio008();
                    rVouF = false;
                    break;
                case "9":
                    Exercicio009();
                    rVouF = false;
                    break;
                case "10":
                    Exercicio0010();
                    rVouF = false;
                    break;
                case "0":
                    MenuListas.main(null);
                default:
                    System.out.println("Questão não encontrada...");
                    main(null);
                    break;
            }
        }
    }

    private static void Exercicio01() {
        
    }

    private static void Exercicio002() {
        
    }

    private static void Exercicio003() {

    }

    private static void Exercicio004() {

    }

    private static void Exercicio005() {

    }
    
    private static void Exercicio006() {

    }
     
    private static void Exercicio007() {

    }
    
     private static void Exercicio008() {

    }
     
    private static void Exercicio009() {

    }
    
    private static void Exercicio0010() {

    }
}

package listadeexercicios;

import static listadeexercicios.ListaDeExercicios01.ler;

public class ListaDeExercicios09 {

    public void main(String[] args){
        
		boolean rVouF = true;

		while (rVouF) {

			System.out.println("--------------------------------------------");
			System.out.printf("DIGITE O NÚMERO DA QUEST�O > ");
			String resposta1 = ler.next();

			System.out.println("--------------------------------------------");

			switch (resposta1) {
			case "1":
				Exercicio001();
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
                        case "0":
                            MenuListas menu = new MenuListas();
                            menu.main(null);
			default:
				System.out.println("Questão não encontrada...");
				main(null);
				break;
			}
		}
    }

    private void Exercicio001() {
        
    }

    private void Exercicio002() {
        
    }

    private void Exercicio003() {
        
    }

    private void Exercicio004() {
        
    }

    private void Exercicio005() {
        
    }
}

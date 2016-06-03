package listadeexercicios;

import java.util.Scanner;

public class ListadeExercicios03 {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		boolean rVouF = true;

		while (rVouF) {

			System.out.println("--------------------------------------------");
			System.out.printf("DIGITE O N�MERO DA QUEST�O > ");
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
				Exercicio010();
				rVouF = false;
				break;
			default:
				System.out.println("Quest�o n�o encontrada...");
				main(null);
				break;
			}

		}

	}

	private static void Exercicio001() {

		System.out.println("M�LTIPLOS ENTRE DOIS VALORES\n");
		
		System.out.println("Digite o valor a saber os m�ltiplos > ");
		int N = ler.nextInt();

		System.out.println("Digite o valor do intervalo inicial > ");
		int A = ler.nextInt();

		System.out.println("Digite o valor do intervalo final > ");
		int B = ler.nextInt();

		do{
			if (A % N == 0) {
				System.out.println("O m�ltiplo � " + A);
				A++;
			} else {
				A++;
			}
		}while (A <= B);

		main(null);

	}

	private static void Exercicio002() {

		System.out.println("CALCULAR A SOMA DE N�MEROS PARES ENTRE DOIS INTERVALOS\n");
		
		System.out.print("Digite o inicio do intervalo > ");
		int n1 = ler.nextInt();
		System.out.print("Digite o fim do intervalo > ");
		int n2 = ler.nextInt();
		int x = 0;

		do {

			if (n1 % 2 == 0) {
				x += n1;
			}
			n1++;

		}while (n1 <= n2);
		
		System.out.println("O valor � " + x);

		main(null);

	}

	private static void Exercicio003() {
		
		System.out.println("CONTA N�MEROS ENTRE 100 E 200\n");

		int x = 1, n = 0, tn = 0, l = 0;
		
		do{
			l++;
			System.out.printf("Digite o %s n�mero > ",l);
			n = ler.nextInt();
			tn = (n<=200 && n>=100)?tn+1:tn;
			x = (n == 0)? 0: 1;
		}while (x == 1);
		
		System.out.println("O total de n�meros v�lidos � de "+tn);

		main(null);

	}

	private static void Exercicio004() {

		System.out.println("MOSTRA E SOMA OS N�MEROS PARES DENTRO DO INTERVALO\n");
		
		System.out.print("Digite o limite inferior > ");
		int li = ler.nextInt();
		System.out.print("Digite o limite superior > ");
		int soma = 0, ls = ler.nextInt();

		do {

			if (li % 2 == 0) {
				System.out.println("Os valores pares s�o " + li);
				soma += li;
			} else {
				soma += 0;
			}
			li++;
		}while (li < ls);
		System.out.println("A soma � igual � " + soma);

		main(null);
	}

	private static void Exercicio005() {

		System.out.println("MOSTRAR A TABUADO DO N�MERO");
		
		System.out.print("Digite o n�mero para saber a tabudada > ");
		int x = 0, n = ler.nextInt();

		do {
			x++;
			System.out.printf("%s * %s = %s\n", n, x, (x * n));
		}while (x < 10);
		main(null);
	}

	private static void Exercicio006() {

		System.out.println("MOSTRA O MAIOR N�MERO DIGITADO DEPOIS DE DIGITAR 0");
		
		int numero = 0, maior = 0;

		do {
			System.out.println("Digite um numero > ");
			numero = ler.nextInt();
			if (numero > maior) {
				maior = numero;
			} else if (numero == -1) {
				System.out.println("O maior n�mero � " + maior);
			}
		}while (numero >= 0);

		main(null);
	}

	private static void Exercicio007() {

		System.out.println("CALCULAR A M�DIA QUANTAS VEZES QUISER");
		
		int r = 1;
		do {

			System.out
					.print("Deseja executar o programa?\n1 - SIM\t\t0 - N�O\n\n> ");
			r = ler.nextInt();

			if (r == 1) {
				System.out.print("\nDigite a primeira nota > ");
				int pn = ler.nextInt();
				System.out.print("Digite a segunda nota > ");
				int ps = ler.nextInt();
				int media = (pn + ps) / 2;
				System.out.println("A m�dia � " + media + "\n\n");

			} else {
				System.out.println("Fechando...");
			}
		}while (r == 1);
		main(null);

	}

	private static void Exercicio008() {

		System.out.println("SABER A PESSOAS MAIS ALTA E PESADA");
		
		int var = 0;
		String nome = null, nome2 = null;
		double peso = 0, peso2 = 0;
		double alt = 0, alt2 = 0;

		do {
			var++;
			System.out.println("Digite o nome da " + var + "� pessoa: ");
			if (var == 1) {
				nome = ler.next();
			} else {
				nome2 = ler.next();
			}
			System.out.println("Digite o peso da " + var + "� pessoa: ");
			if (var == 1) {
				peso = ler.nextDouble();
			} else {
				peso2 = ler.nextDouble();
			}
			System.out.println("Digite a altura da " + var + "� pessoa: ");
			if (var == 1) {
				alt = ler.nextDouble();
			} else {
				alt2 = ler.nextDouble();
			}

		}while (var < 2);
		if (peso > peso2) {
			System.out.print(nome + " � a pessoa mais pesada ");
		} else {
			System.out.print(nome2 + " � a pessoa mais pesada ");
		}
		if (alt > alt2) {
			System.out.print("e a pessoa mais alta � " + nome);
		} else {
			System.out.print("e a pessoa mais alta � " + nome2);
		}

	}

	private static void Exercicio009() {

		double tv = 0;
		
		System.out.println("MOSTRA QUANTAS DIVIS�ES FORAM EFETUADAS\n");
		
		System.out.println("Digite um valor > ");
		int valor = ler.nextInt();

		do {
			valor /= 2;
			tv = tv+1;
		}while (valor > 1);
		System.out.printf("O resultado da �ltima divis�o foi %s. ",valor);
		System.out.printf("Foram efetuadas %s divis�es \n",tv);		

		main(null);
		
	}

	private static void Exercicio010() {

		int predioAndar = 0, pessoasEntraAndar = 0, pessoasSaiAndar = 0, totalPessoasAndar = 0, totalPessoas = 0;

		System.out.print("Quantos andares tem este predio? > ");
		int qp = ler.nextInt();
		
		do {

			predioAndar++;

			System.out.printf("Quantas pessoas entraram no %s� andar? > ",
					predioAndar);
			pessoasEntraAndar = ler.nextInt();
			System.out.printf("Quantas pessoas sa�ram no %s� andar? > ",
					predioAndar);
			pessoasSaiAndar = ler.nextInt();

			totalPessoasAndar = pessoasEntraAndar - pessoasSaiAndar;
			totalPessoas = totalPessoasAndar + totalPessoas;
			
			if (predioAndar == 1) {

				if (totalPessoasAndar < 0) {
					System.out.println("FALHA NA MATRIX!!!! �������������");
					predioAndar--;
				} 
			} else {

				if (totalPessoas > 15) {
					System.out.println("Peso exedido!! pessoas devem sair.");
					predioAndar--;
				}

				else if (totalPessoasAndar < pessoasSaiAndar) {
					System.out
							.println("FALHA NA MATRIX!!!! ������������������");
					predioAndar--;
				}

			}

		}while (predioAndar < qp);

		System.out.printf(
				"Todos os %s passageiros devem descer ao �ltimo andar",
				totalPessoas);

	}
}

package listadeexercicios;

import java.util.Scanner;

public class ListaDeExercicios01 {

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
			case "11":
				Exercicio011();
				rVouF = false;
				break;
			default:
				System.out.println("Quest�o n�o encontrada...");
				main(null);
				break;
			}
		}

	}

	public static void Exercicio001() {

		System.out.println("SABER SE UM VALOR � POSITIVO OU NEGATIVO \n");
		System.out.print("Digite o valor > ");
		String valorString = ler.next();
		int vInteiro = Integer.parseInt(valorString);

		if (vInteiro >= 0) {
			System.out.println("o valor � positivo\n");
		} else if (vInteiro < 0) {
			System.out.println("o valor � negativo\n");
		} else {
			System.out.println("Digite somente n�meros");
			System.out.println("-----------------------------");
		}

		main(null);
	}

	public static void Exercicio002() {

		System.out.println("REAJUSTE DE BONIFICA��O\n");
		System.out.print("Digite sua categoria > ");
		String categoria = ler.next();
		System.out.print("Digite seu sal�rio > ");
		float salario = ler.nextInt();

		if ("Prim�rio".equalsIgnoreCase(categoria) || "primario".equalsIgnoreCase(categoria)) {
			if (salario < 900.00) {
				System.out.println("Total do sal�rio > R$" + (salario + (salario * 20 / 100)));
			} else {
				System.out.println("Total do sal�rio > R$" + salario);
			}
		} else if ("Gin�sio".equalsIgnoreCase(categoria) || "ginasio".equalsIgnoreCase(categoria)) {
			if (salario <= 1200.00) {
				System.out.println("Total do sal�rio > R$" + (salario + (salario * 15 / 100)));
			} else {
				System.out.println("Total do sal�rio > R$" + salario);
			}
		} else if ("Superior".equalsIgnoreCase(categoria)) {
			if (salario <= 3000.00) {
				System.out.println("Total do sal�rio > R$" + (salario + (salario * 5 / 100)));
			} else {
				System.out.println("Total do sal�rio > R$" + salario);
			}
		} else {
			System.out.println("Digite categoria e sal�rios v�lidos, REINICIANDO...\n");
			System.out.println("------------------------\n\n");
			Exercicio002();
		}

		main(null);
	}

	public static void Exercicio003() {

		System.out.println("AUMENTO DE SAL�RIO DE ACORDO COM A IDADE\n");
		System.out.println("Digite a sua idade");
		int idade = ler.nextInt();
		System.out.println("Digite o seu sal�rio");
		float salario = ler.nextFloat();

		if (idade >= 55) {
			System.out.println("Total R$" + (salario + 600));
		} else if (idade <= 55) {
			System.out.println("Total R$" + (salario + 500));
		} else if (idade >= 40) {
			System.out.println("Total R$" + (salario + 350));
		} else {
			System.out.println("Total R$" + salario);
		}

		main(null);
	}

	public static void Exercicio004() {

		System.out.println("CONVERTER EM DOLAR\n");
		System.out.println("Digite o valor a ser convertido em dolar");
		double reais = ler.nextFloat();

		double convertido = (reais / 3.60);
		System.out.println("Valor convertido para dolar fica R$" + convertido);

		main(null);
	}

	public static void Exercicio005() {

		System.out.println("CALCULADORA\n");

		System.out.printf("Digite o primeiro valor> ");
		double v1 = ler.nextDouble();

		System.out.printf("Digite a opera��o desejada> %s ", v1);
		String op = ler.next();

		System.out.printf("Digite o segundo valor> %s %s ", v1, op);
		double v2 = ler.nextDouble();

		double resultado;

		resultado = ("+".equals(op)) ? v1 + v2
				: ("-".equals(op)) ? v1 - v2 : ("*".equals(op)) ? v1 * v2 : ("/".equals(op)) ? v1 / v2 : null;

		System.out.println("O resultado � " + resultado);

		main(null);
	}

	public static void Exercicio006() {

		System.out.println("SABER SE ESTA NO PESO IDEAL\n");
		System.out.println("Digite seu sexo");
		String sexo = ler.next();

		System.out.println("Digite a sua altura");
		double altura = ler.nextDouble();

		if ("Masculino".equalsIgnoreCase(sexo)) {
			double pesoIdeal = (72.7 * altura - 62);
			if (pesoIdeal >= 10) {
				System.out.println("Voc� n�o est� em seu peso ideal");
			} else {
				System.out.println("Voc� est� em seu peso ideal");
			}
		} else if ("Feminino".equalsIgnoreCase(sexo)) {
			double pesoIdeal = (62.1 * altura - 48.7);
			if (pesoIdeal >= 10) {
				System.out.println("Voc� n�o est� em seu peso ideal");
			} else {
				System.out.println("Voc� est� em seu peso ideal");
			}
		} else {
			System.out.println("Digite um sexo v�lido...\n\n");
			Exercicio006();
		}

		main(null);

	}

	public static void Exercicio007() {

		System.out.println("SABER O ANTECESSOR DO N�MERO");
		System.out.println("Digite um valor");
		int valor = ler.nextInt();

		int antecessor = valor - 1;

		System.out.println("O antecessor � " + antecessor);

		main(null);

	}

	public static void Exercicio008() {

		System.out.println("PROMO��O DAS MA��S");
		System.out.println("Quantas ma��s voc� comprou?");
		int q = ler.nextInt();

		if (q >= 12) {
			double preco = q * 1.00;
			System.out.println("O total da compra � R$" + preco);
		} else {
			double preco = q * 1.30;
			System.out.println("O total da compra � R$" + preco);
		}

		main(null);

	}

	public static void Exercicio009() {

		System.out.println("MOSTRAR O VALOR MAIOR");
		System.out.println("Digite o primeiro");
		int v1 = ler.nextInt();
		System.out.println("Digite o segundo valor");
		int v2 = ler.nextInt();

		if (v1 > v2) {
			System.out.println("O n�mero maior �" + v1);
		} else {
			System.out.println("O n�mero maior �" + v2);
		}

		main(null);

	}

	public static void Exercicio010() {

		System.out.println("ORDEM CRESCENTE DOS N�MEROS");
		System.out.println("Digite o primeiro valor");
		int v1 = ler.nextInt();
		System.out.println("Digite o segundo valor");
		int v2 = ler.nextInt();

		if (v1 > v2) {
			System.out.println("A ordem fica : " + v2 + ", " + v1);
		} else {
			System.out.println("A ordem fica : " + v1 + ", " + v2);
		}

	}

	public static void Exercicio011() {

		System.out.println("SOMA PARES\n");

		int v[] = new int[6];
		for (int i = 1; i < 6; i++) {
			System.out.printf("Digite o %s� valor > ", i);
			v[i] = ler.nextInt();
		}

		int soma = 0;
		soma = (v[1] % 2 == 0) ? soma + v[1] : soma + 0;
		soma = (v[2] % 2 == 0) ? soma + v[2] : soma + 0;
		soma = (v[3] % 2 == 0) ? soma + v[3] : soma + 0;
		soma = (v[4] % 2 == 0) ? soma + v[4] : soma + 0;
		soma = (v[5] % 2 == 0) ? soma + v[5] : soma + 0;
		System.out.println("A soma dos pares � " + soma);
		main(null);

	}

}

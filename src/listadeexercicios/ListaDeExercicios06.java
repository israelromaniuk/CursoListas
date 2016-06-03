import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ListaDeExercicios06 {
	static Scanner leia = new Scanner(System.in);
	static Random sorte = new Random();

	public static void main(String[] args) {

		boolean rVouF = true;

		while (rVouF) {

			System.out.println("--------------------------------------------");
			System.out.printf("DIGITE O NÚMERO DA QUESTÃO > ");
			String resposta1 = leia.next();

			System.out.println("--------------------------------------------");

			switch (resposta1) {
			case "1":
				Exercicio01();
				rVouF = false;
				break;
			case "2":
				Exercicio02();
				rVouF = false;
				break;
			case "3":
				Exercicio03();
				rVouF = false;
				break;
			case "4":
				Exercicio04();
				rVouF = false;
				break;
			case "5":
				Exercicio05();
				rVouF = false;
				break;
			case "6":
				Exercicio06();
				rVouF = false;
				break;
			case "7":
				Exercicio07();
				rVouF = false;
				break;
			case "8":
				Exercicio08();
				rVouF = false;
				break;
			case "9":
				Exercicio09();
				rVouF = false;
				break;
			case "10":
				Exercicio10();
				rVouF = false;
				break;
			case "11":
				Exercicio11();
				rVouF = false;
				break;
			case "12":
				Exercicio12();
				rVouF = false;
				break;
			case "13":
				Exercicio13();
				rVouF = false;
				break;
			default:
				System.out.println("Questão não encontrada...");
				main(null);
				break;
			}
		}
	}

	// Tabuada
	public static void Exercicio01() {
		System.out.print("Digite o número para exibir a tabuada: ");
		int valor = leia.nextInt();
		for (int x = 0; x <= 13; x++) {
			System.out.println(valor + " x " + x + " = " + (valor * x));
		}
	}

	// Soma de 1 a 100
	public static void Exercicio02() {
		System.out.println("Soma de 1 a 100");
		int soma = 0;
		for (int x = 1; x <= 100; x++) {
			System.out.println(x + " + " + soma + " = " + (x + soma));
			soma = soma + x;
		}
	}

	// Soma de 1 a 50
	public static void Exercicio03() {
		int soma = 0, neg = 0, valor = 0;
		for (int x = 1; x <= 50; x++) {
			System.out.println("Digite o " + x + "º valor: ");
			valor = leia.nextInt();
			if (valor % 2 == 0) {
				soma += valor;
			} else if (valor < 0) {
				neg++;
			}
		}
		System.out.println("A soma dos números pares é " + soma
				+ " e a quantidade de números negativos é " + neg + ".");
	}

	// Múltiplos de 7
	public static void Exercicio04() {
		for (int x = 1; x <= 1000; x++) {
			if (x % 7 == 0) {
				System.out.println(x + " é múltiplo de 7.");
			}
		}
	}

	// Soma dos valores pares de 85 a 907
	public static void Exercicio05() {
		int soma = 0;
		for (int x = 85; x <= 907; x++) {
			if (x % 2 == 0) {
				System.out.println(x);
				soma += x;
			}
		}
		System.out.println("A soma dos valores pares é " + soma);
	}

	public static void Exercicio06() {
		int valor = 0;
		for (int x = 0; x <= 50; x++) {
			valor = sorte.nextInt(0) + 100;
			System.out.println(valor);
		}
	}

	public static void Exercicio07() {
		int valor = sorte.nextInt(101) + 0;
		System.out.println("Você deve acertar um valor de 0 à 100: ");
		int num = leia.nextInt(), cont = 1;

		while (num != valor) {
			cont++;
			if (num > valor) {
				System.out.println("Dica: o valor é menor.");
			} else {
				System.out.println("Dica: o valor é maior.");
			}
			System.out.println("Tente outra vez: ");
			num = leia.nextInt();
		}

		System.out.println("Parabéns, você acertou depois de " + cont
				+ " tentativas.");
	}

	public static void Exercicio08() {
		int contm = 0, contf = 0;
		for (int x = 0; x < 10; x++) {
			System.out.println("Digite seu sexo:");
			String sexo = leia.next();
			System.out.println("Digite sua idade:");
			int idade = leia.nextInt();

			if (sexo.equalsIgnoreCase("Feminino")) {
				if (idade >= 18) {
					contf++;
				}
			} else if (sexo.equalsIgnoreCase("Masculino")) {
				if (idade >= 18) {
					contm++;
				}
			}
		}
		System.out.println("Das dez pessoas " + contm
				+ " são homens maiores de idade e " + contf
				+ " são mulheres maiores de idade.");
	}

	public static void Exercicio09() {

		System.out.print("Digite quantas linhas você quer > ");
		int linhas = leia.nextInt();
		String anterior = "";

		DecimalFormat df = new DecimalFormat("##00");

		for (int i = 1; i < linhas + 1; i++) {
			String pegarFormatacaodoI = df.format(i);
			System.out.println(anterior += pegarFormatacaodoI + " ");
		}

		main(null);

	}

	public static void Exercicio10() {

		DecimalFormat df = new DecimalFormat("##00");

		System.out.println("Digite quantas linhas > ");
		int linhas = leia.nextInt();

		for (int i = 1; i < linhas + 1; i++) {
			for (int x = 0; x < i; x++) {
				System.out.print(df.format(i) + " ");
			}
			System.out.println();
		}

		main(null);

	}

	public static void Exercicio11() {

		System.out.println("Digite o inicio do intervalo");
		int inicio = leia.nextInt();
		System.out.println("Digite o final do intervalo");
		int fim = leia.nextInt();
		
		if(inicio>fim){
			while(inicio>=fim){
				System.out.println("> "+inicio--);
			}
		}else{
			while(inicio<=fim){
				System.out.println("> "+inicio++);
			}
		}
		
		main(null);
		
	}

	public static void Exercicio12() {
		
		System.out.println("Digite um valor para saber seu fatorial: ");
		int valor = leia.nextInt(),soma = 0;
		
		for(int x = 0;x<valor;x++){
			soma = soma + (valor*valor-1);
		}
		System.out.println("A fotorial de "+valor+" é igual à "+soma);

	}

	public static void Exercicio13() {

		for (int i = 1; i <= 10; i++) {

			for (int x = 1; x <= 10; x++) {

				System.out.println(i + " * " + x + " = "+i*x);

			}
		}

		main(null);
	}
}
import java.util.Scanner;

public class ListadeExercicios05 {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		boolean rVouF = true;

		while (rVouF) {

			System.out.println("--------------------------------------------");
			System.out.printf("DIGITE O NÚMERO DA QUESTÃO > ");
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
			case "12":
				Exercicio012();
				rVouF = false;
				break;
			case "13":
				Exercicio013();
				rVouF = false;
				break;
			case "14":
				Exercicio014();
				rVouF = false;
				break;
			case "15":
				Exercicio015();
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

		System.out.println("PORCENTAGEM DE ELEITORES\n");
		System.out.print("Digite o número de votos brancos > ");
		double branco = ler.nextDouble();
		System.out.print("Digite o número de votos núlos > ");
		double nulo = ler.nextDouble();
		System.out.print("Digite o número de votos válidos > ");
		double valido = ler.nextDouble();

		double total = branco + nulo + valido;

		System.out.println("Votos Brancos = " + (branco / total) * 100 + "%");
		System.out.println("Votos Nulos =   " + (nulo / total) * 100 + "%");
		System.out.println("Votos Válidos = " + (valido / total) * 100 + "%");

		main(null);

	}

	private static void Exercicio002() {
		System.out.println("CALCULA O PERCENTUAL DO SALÁRIO\n");

		System.out.print("Digite seu salário atual >");
		int sa = ler.nextInt();
		System.out.print("Digite em quantos porcentos será seu reajuste > ");
		int sr = ler.nextInt();

		int st = sa + (sa * sr / 100);
		System.out.println("A partir de agora seu salário será de R$" + st);

		main(null);

	}

	private static void Exercicio003() {

		System.out.println("MOSTRAR O CUSTO DE FÁBRICA\n");

		System.out.print("Quanto é o custo de fábrica? > ");
		int pd = 28, imp = 45, qf = ler.nextInt();
		System.out.println("O custo final ao consumidor é de R$" + (((qf * pd / 100) + (qf * imp / 100)) + qf));

		main(null);

	}

	private static void Exercicio004() {

		System.out.println("SALÁRIO DO VENDEDOR\n");

		System.out.print("Quantos carros foi vendido por este funcionário? > ");
		double cv = ler.nextDouble();
		System.out.print("Qual é o valor total de suas vendas? > ");
		double vt = ler.nextDouble();
		System.out.print("Qual o seu salário fixo? > ");
		double sf = ler.nextDouble();
		System.out.print("Qual o valor que ele recebe por carro vendido? > ");
		double cr = ler.nextDouble();
		System.out.println();
		System.out.println("O salário final do vendedor é de R$" + (double) (cv * 5 / 100) + vt + sf + cr);

		main(null);

	}

	private static void Exercicio005() {

		System.out.println("PESO IDEAL\n");
		System.out.print("Digite M para Masculino e F para feminino > ");
		String sexo = ler.next();

		if ("M".equalsIgnoreCase(sexo)) {

			System.out.print("Digite seu nome > ");
			String nome = ler.next();
			System.out.print("Digite seu peso atual > ");
			ler.nextDouble();
			System.out.println("Digite sua altura > ");
			double altura = ler.nextDouble();

			System.out.println(nome + " seu peso ideal é " + ((72.7 * altura) - 58));

		} else if ("F".equalsIgnoreCase(sexo)) {

			System.out.print("Digite seu nome > ");
			String nome = ler.next();
			System.out.print("Digite seu peso atual > ");
			ler.nextDouble();
			System.out.println("Digite sua altura > ");
			double altura = ler.nextDouble();

			System.out.println(nome + " seu peso ideal é " + ((62.1 * altura) - 44.7));

		} else {
			System.out.println("Não consta");
		}

		main(null);

	}

	private static void Exercicio006() {

		System.out.println("VALORES ENTRE 10 E 20\n");
		int x = 0, v = 0, vtp = 0, vti = 0;
		while (x < 10) {
			x++;

			System.out.printf("Digite o %s° valor > ", x);
			v = ler.nextInt();

			if (v >= 10 && v <= 20) {
				vtp += 1;
			} else {
				vti += 1;
			}

		}

		System.out.println("O total de valores validos é de " + vtp);
		System.out.println("O total de valores invalidos é de " + vti);

		main(null);

	}

	private static void Exercicio007() {

		System.out.println("OBTER A MÉDIA\n");
		int x = 0, vt = 0;
		while (x < 10) {
			x++;
			System.out.printf("Digite o %s° valor > ", x);
			vt += ler.nextInt();
		}
		System.out.println("A média dessas notas é " + vt / 10);

	}

	private static void Exercicio008() {

		System.out.println("MÉDIA DOS ALUNOS DA CLASSE\n");

		System.out.print("Quantos alunoa há, nesta turma? > ");
		int x = 0, nt = 0, tA = ler.nextInt();

		while (x < tA) {
			x++;
			System.out.printf("Digite a nota do %s° aluno > ", x);
			nt += ler.nextInt();
		}

		System.out.println("A média da sala é " + nt / tA);
		main(null);

	}

	private static void Exercicio009() {

		System.out.println("SOMA 10 NÚMEROS\n");

		int ns = 0, x = 0;
		while (x < 10) {
			x++;
			System.out.printf("Digite o %s° número > ", x);
			ns += ler.nextInt();
		}

		System.out.println("A soma total dos números é " + ns);
		main(null);

	}

	private static void Exercicio010() {

		System.out.println("LER 10 NÚMERO MENORES DE 40\n");
		int nantigo = 0, numero = 0, x = 0;
		while (x < 10) {
			x++;
			System.out.printf("Digiter o %s° número > ", x);
			numero = ler.nextInt();

			if (numero < 40) {
				nantigo += numero;
			}

		}

		System.out.println("A soma dos número válidos é de " + nantigo);
		main(null);

	}

	private static void Exercicio011() {
		

	}

	private static void Exercicio012() {

		System.out.println("LER O CÓDIGO E O PREÇO DOS PRODUTOS\n");
		int x = 0;
		double media = 0, p = 0, maiorP = 0;
		while (x < 15) {
			x++;

			System.out.printf("Digite o código do %s produto > ", x);
			ler.nextInt();
			System.out.printf("Digite o preço do %s produto > ", x);
			p = ler.nextInt();

			media += p;

			if (p > maiorP) {
				maiorP = p;
			}

		}

		System.out.println("O maior preço lido foi R$" + maiorP + " e a média dos preços é de R$" + media / 15);

	}

	private static void Exercicio013() {

		System.out.println("DADOS DOS HABITANTES\n");

		System.out.print("Quantos habitantes há nesta cidade? > ");
		int x = 0, pPobre = 0, mediaFilhos = 0, filhos = 0, habitantes = ler.nextInt();
		double mediaSalario = 0, salario = 0, maiorSalario = 0;

		while (x < habitantes) {
			x++;
			System.out.printf("Qual o salário do %s° habitante? > ", x);
			salario = ler.nextDouble();
			mediaSalario += salario;
			System.out.printf("Quantos filhos tem o %s° habitante? > ", x);
			filhos = ler.nextInt();
			mediaFilhos += filhos;

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if (salario < 150) {
				pPobre++;
			}

		}

		System.out.println("A média salarial da população é de R$" + mediaSalario / habitantes);
		System.out.println("A média de filhos da população é de " + mediaFilhos / habitantes);
		System.out.println("O maior do salario dos habitantes é de R$" + maiorSalario);
		System.out.println(
				"O percentual de pessoas com salário menor que R$ 150,00 é de " + pPobre * 100 / habitantes + "%");

	}

	private static void Exercicio014() {

		System.out.println("TABUADA FOR\n");

		for(int i = 1; i<11; i++){
			for(int n = 1; n<11; n++){
				System.out.println(i+" * "+n+" = "+i*n);
			}
			System.out.println();
		}
		
		main(null);

	}

	private static void Exercicio015() {

		System.out.println("TABUADA WHILE\n");
		int x =1;
		while(x<11){
			int n = 1;
			while(n<11){
				
				System.out.println(x+" * "+n+" = "+ x*n);
				n++;
			}
			
			x++;
			System.out.println();
		}
		
		main(null);
		
	}

}

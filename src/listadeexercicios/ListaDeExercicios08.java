package listadeexercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ListaDeExercicios08 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String args[]) {
        boolean rVouF = true;
        while (rVouF) {
            System.out.println("--------------------------------------------");
            System.out.printf("DIGITE O NÚMERO DA QUESTÃO > ");
            String resposta1 = ler.next();
            System.out.println("--------------------------------------------");
            switch (resposta1) {
                case "0":
                    MenuListas menu = new MenuListas();
                    menu.main(null);
                    break;
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
                case "14":
                    Exercicio14();
                    rVouF = false;
                    break;
                case "15":
                    Exercicio15();
                    rVouF = false;
                    break;
                case "16":
                    Exercicio16();
                    rVouF = false;
                    break;
                case "17":
                    Exercicio17();
                    rVouF = false;
                    break;
                case "18":
                    Exercicio18();
                    rVouF = false;
                    break;
                case "19":
                    Exercicio19();
                    rVouF = false;
                    break;
                case "20":
                    Exercicio20();
                    rVouF = false;
                    break;
                case "21":
                    Exercicio21();
                    rVouF = false;
                    break;
                case "22":
                    Exercicio22();
                    rVouF = false;
                    break;
                case "23":
                    Exercicio23();
                    rVouF = false;
                    break;
                case "24":
                    Exercicio24();
                    rVouF = false;
                    break;
                case "25":
                    Exercicio25();
                    rVouF = false;
                    break;
                case "26":
                    Exercicio26();
                    rVouF = false;
                    break;
                case "27":
                    Exercicio27();
                    rVouF = false;
                    break;
                case "28":
                    Exercicio28();
                    rVouF = false;
                    break;
                case "29":
                    Exercicio29();
                    rVouF = false;
                    break;
                case "30":
                    Exercicio30();
                    rVouF = false;
                    break;
                case "31":
                    Exercicio31();
                    rVouF = false;
                    break;
                case "32":
                    Exercicio32();
                    rVouF = false;
                    break;
                case "33":
                    Exercicio33();
                    rVouF = false;
                    break;
                case "34":
                    Exercicio34();
                    rVouF = false;
                    break;
                case "35":
                    Exercicio35();
                    rVouF = false;
                    break;
                case "36":
                    Exercicio36();
                    rVouF = false;
                    break;
                case "37":
                    Exercicio37();
                    rVouF = false;
                    break;
                case "38":
                    Exercicio38();
                    rVouF = false;
                    break;
                case "39":
                    Exercicio39();
                    rVouF = false;
                    break;
                case "40":
                    Exercicio40();
                    rVouF = false;
                    break;
                case "41":
                    Exercicio41();
                    rVouF = false;
                    break;
                default:
                    System.out.println("Questão não encontrada...");
                    main(null);
                    break;
            }
        }
    }

    private static void Exercicio01() {
        System.out.println("IMPRIMIR MAIOR QUE 20 \n");
        int numero = ler.nextInt();
        if (numero > 20) {
            System.out.println(numero + " é maior que 20");
        } else {
            System.out.println("Não é maior que 20");
        }
        main(null);
    }

    private static void Exercicio02() {
        System.out.println("SOMAR DOIS NÚMEROS, SE FOR MAIOR QUE 10, EXIBIR\n");
        System.out.print("Digite o primeiro número > ");
        int primeiroN = ler.nextInt();
        System.out.print("Digite o segundo número > ");
        int segundoN = ler.nextInt(), soma = primeiroN + segundoN;
        if (soma > 10) {
            System.out.println("A soma dos dois valores é " + soma);
        } else {
            System.out.println("A soma dos dois valores é menor que 10");
        }
        main(null);
    }

    private static void Exercicio03() {
        System.out.println("DIZER SE O NÚMER É PAR OU IMPAR\n");
        System.out.print("Digite o número > ");
        int numero = ler.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }
        main(null);
    }

    private static void Exercicio04() {
        System.out.println("INFORMAR SE NUMERO É DIVISÍVEL OU NÃO POR 5\n");
        System.out.print("Digite o número > ");
        int numero = ler.nextInt();
        if (numero % 5 == 0) {
            System.out.println(numero + " é divisivel por 5");
        } else {
            System.out.println(numero + " não é divisivel por 5");
        }
        main(null);
    }

    private static void Exercicio05() {
        System.out.println("INFORMAR SE NUMERO É DIVISÍVEL OU NÃO POR 3 e 5\n");
        System.out.print("Digite o número > ");
        int numero = ler.nextInt();
        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println(numero + " é divisivel por 3 e 5");
        } else {
            System.out.println(numero + " não é divisivel por 3 e 5");
        }
        main(null);
    }

    private static void Exercicio06() {
        System.out.println("INFORMAR SE NÚMERO É DIVISIVEL POR 10 OU 5\n");
        System.out.println("Entre com o número > ");
        int numero = ler.nextInt();
        if (numero % 5 == 0 && numero % 10 == 0) {
            System.out.println(numero + " é divisivel por 5 e 10");
        } else if (numero % 5 == 0) {
            System.out.println(numero + " é divisivel por 5");
        } else if (numero % 10 == 0) {
            System.out.println(numero + " é divisível por 10");
        } else {
            System.out.println(numero + " não é divisível por 10 nem por 5");
        }
        main(null);
    }

    private static void Exercicio07() {
        System.out.println("VERIFICAR SE NÚMERO ESTÁ ENTRE 20 E 90\n");
        System.out.print("Digite o número > ");
        int numero = ler.nextInt();
        if (numero >= 20 && numero <= 90) {
            System.out.println(numero + " está entre 20 e 90");
        } else {
            System.out.println(numero + " não está entre 20 e 90");
        }
        main(null);
    }

    private static void Exercicio08() {
        System.out.println("MAIOR, MENOR OU IGUAL A 20\n");
        System.out.println("Digite o número > ");
        int numero = ler.nextInt();
        if (numero == 20) {
            System.out.println(numero + " é igual a 20");
        } else if (numero > 20) {
            System.out.println(numero + " é maior que 20");
        } else {
            System.out.println(numero + " é menor que 20");
        }
        main(null);
    }

    private static void Exercicio09() {
        System.out.println("INFORMAR SE DIGITO DA DEZENA É PAR OU IMPAR\n");
        System.out.print("Digite um número > ");
        String numero = ler.next();
        int caracteres = numero.length();
        String dezena = numero.substring(caracteres - 2, caracteres);
        if (dezena.charAt(0) % 2 == 0) {
            System.out.println("A dezena de " + numero + " é par");
        } else {
            System.out.println("A dezena de " + numero + " é impar");
        }
        main(null);
    }

    private static void Exercicio10() {
        System.out.println("BOLETIM DO ALUNO\n");
        System.out.print("Nome do aluno: ");
        String nome = ler.next();
        System.out.print("Nota da primeira prova > ");
        double nota1 = ler.nextDouble();
        System.out.print("Nota da segunda prova > ");
        double nota2 = ler.nextDouble();
        System.out.println("\nNome: " + nome);
        System.out.println("Nota da Primeira prova: " + nota1);
        System.out.println("Nota da Segunda prova: " + nota2);
        System.out.println("Média: " + (nota1 + nota2) / 2);
        if ((nota1 + nota2) / 2 >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if ((nota1 + nota2) / 2 <= 3) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Prova Final");
        }
        main(null);
    }

    private static void Exercicio11() {
        System.out.println("MOSTRAR SE NÚMERO É DIVISÍVEL PELO ANTERIOR\n");
        System.out.print("Digite o 1° número > ");
        int n1 = ler.nextInt();
        System.out.print("Digite o 2° número > ");
        int n2 = ler.nextInt();
        if (n1 % n2 == 0) {
            System.out.println(n1 + " é divisível por " + n2);
        } else {
            System.out.println(n1 + " não é divisível por " + n2);
        }
        main(null);
    }

    private static void Exercicio12() {
        System.out.println("QUOCIENTE INTEIRO OU NÃO\n");
        System.out.print("Digite o dividendo > ");
        int dividendo = ler.nextInt();
        System.out.print("Digite o divisor > ");
        int divisor = ler.nextInt();
        if ((dividendo / divisor) % 2 == 0) {
            System.out.println("Quociente é par");
        } else {
            System.out.println("Quociente é impar");
        }
        main(null);
    }

    private static void Exercicio13() {
        System.out.println("NÚMEROS IGUAIS OU DIFERENTES\n");
        System.out.print("Digite o 1° número > ");
        int n1 = ler.nextInt();
        System.out.print("Digite o 2° número > ");
        int n2 = ler.nextInt();
        if (n1 == n2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números não são iguais");
        }
        main(null);
    }

    private static void Exercicio14() {
        System.out.println("IMPRIMIR MAIOR NÚMERO\n");
        System.out.println("Digite o 1° número > ");
        int n1 = ler.nextInt();
        System.out.println("Digite o 2° número > ");
        int n2 = ler.nextInt();
        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " é maior que " + n1);
        } else {
            System.out.println("Os números são iguais");
        }
        main(null);
    }

    private static void Exercicio15() {
        System.out.println("IMPRIMIR MENOR NÚMERO\n");
        System.out.println("Digite o 1° número > ");
        int n1 = ler.nextInt();
        System.out.println("Digite o 2° número > ");
        int n2 = ler.nextInt();
        if (n1 > n2) {
            System.out.println(n2 + " é menor que " + n1);
        } else {
            System.out.println(n1 + " é menor que " + n2);
        }
        main(null);
    }

    private static void Exercicio16() {
        System.out.println("NÚMEROS EM ORDEM CRESCENTE\n");
        System.out.print("Digite o primeiro número > ");
        int n1 = ler.nextInt();
        System.out.print("Digite o segundo número ");
        int n2 = ler.nextInt();
        if (n1 > n2) {
            System.out.println(n2 + ", " + n1);
        } else {
            System.out.println(n1 + ", " + n2);
        }
        main(null);
    }

    private static void Exercicio17() {
        System.out.println("NÚMEROS EM ORDEM DECRESCENTE\n");
        System.out.print("Digite o primeiro número > ");
        int n1 = ler.nextInt();
        System.out.print("Digite o segundo número ");
        int n2 = ler.nextInt();
        if (n1 > n2) {
            System.out.println(n1 + ", " + n2);
        } else {
            System.out.println(n2 + ", " + n1);
        }
        main(null);
    }

    private static void Exercicio18() {
        System.out.println("IMPRIMIR MAIOR DOS TRÊS NÚMEROS\n");
        System.out.print("Digite o primeiro número > ");
        int n1 = ler.nextInt();
        System.out.print("Digite o segundo número > ");
        int n2 = ler.nextInt();
        System.out.print("Digite o terceiro número > ");
        int n3 = ler.nextInt();
        int maior = 0;
        if (n1 > maior) {
            maior = n1;
            if (n2 > maior) {
                maior = n2;
            }
            if (n3 > maior) {
                maior = n3;
            }
        }
        System.out.println("O maior número é: " + maior);
        main(null);
    }

    private static void Exercicio19() {
        System.out.println("ARMAZENAR MAIOR DOS TRÊS NÚMEROS\n");
        System.out.print("Digite o primeiro número > ");
        int n1 = ler.nextInt();
        System.out.print("Digite o segundo número > ");
        int n2 = ler.nextInt();
        System.out.print("Digite o terceiro número > ");
        int n3 = ler.nextInt();
        int maior = 0;
        if (n1 > maior) {
            maior = n1;
            if (n2 > maior) {
                maior = n2;
            }
            if (n3 > maior) {
                maior = n3;
            }
        }
        System.out.println("O maior número é: " + maior);
        main(null);
    }

    private static void Exercicio20() {
        System.out.println("ORDEM CRESCENTE COM 3 NÚMEROS\n");
        int num, maior = 0, menor = 0, intermediario = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite o %s° numero > ", i);
            num = ler.nextInt();
            if (num > maior) {
                menor = intermediario;
                intermediario = maior;
                maior = num;
            } else if (num > intermediario) {
                menor = intermediario;
                intermediario = num;
            } else {
                menor = num;
            }
        }
        System.out.println(menor + ", " + intermediario + ", " + maior);
        main(null);
    }

    private static void Exercicio21() {
        System.out.println("ORDEM CRESCENTE COM 3 NÚMEROS\n");
        int num, maior = 0, menor = 0, intermediario = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite o %s° numero > ", i);
            num = ler.nextInt();
            if (num > maior) {
                menor = intermediario;
                intermediario = maior;
                maior = num;
            } else if (num > intermediario) {
                menor = intermediario;
                intermediario = num;
            } else {
                menor = num;
            }
        }
        System.out.println(maior + ", " + intermediario + ", " + menor);
        main(null);
    }

    private static void Exercicio22() {
        System.out.println("MAIOR, INTERMEDIÁRIO E MENOR\n");
        int num, maior = 0, menor = 0, intermediario = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Digite o %s° numero > ", i);
            num = ler.nextInt();
            if (num > maior) {
                menor = intermediario;
                intermediario = maior;
                maior = num;
            } else if (num > intermediario) {
                menor = intermediario;
                intermediario = num;
            } else {
                menor = num;
            }
        }
        System.out.println(menor + ", " + intermediario + ", " + maior);
        main(null);
    }

    private static void Exercicio23() {
        System.out.println("MAIOR E MENOR DE 5 NÚMEROS\n");
        int maior = 0, num = 0, menor = 999999999;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %s° número > ", i);
            num = ler.nextInt();
            if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        }
        System.out.printf("Maior: %s \nMenor:%s", maior, menor);
        main(null);
    }

    private static void Exercicio24() {
        System.out.println("PODE OU NÃO SER TRIÂNGULO\n");
        System.out.print("Digite o primeiro número > ");
        int pN = ler.nextInt();
        System.out.print("Digite o segundo número > ");
        int sN = ler.nextInt();
        System.out.print("Digite o terceiro número > ");
        int tN = ler.nextInt();
        if (pN == sN && pN == tN && sN == tN) {
            System.out.println("Ambos podem ser lados de um triângulo");
        } else {
            System.out.println("Estes números não podem ser lados de um triângulo");
        }
        main(null);
    }

    private static void Exercicio25() {

        System.out.println("CLASSIFICAÇÃO DOS TRIÂNGULOS\n");
        System.out.print("Digite o primeiro lado do triângulo > ");
        int pL = ler.nextInt();
        System.out.print("Digite o segundo lado do triângulo > ");
        int sL = ler.nextInt();
        System.out.print("Digite o terceiro lado do triângulo > ");
        int tL = ler.nextInt();
        if (pL == sL && pL == tL && tL == sL) {
            System.out.println("Com estas medidas o triângulo é equilátero");
        } else if (pL != sL && pL != tL && tL != sL) {
            System.out.println("Com estas medidas o triângulo é isósceles");
        } else {
            System.out.println("Com estas medidas o triângulo é escaleno");
        }
        main(null);
    }

    private static void Exercicio26() {
        System.out.println("CLASSIFICAÇÃO DOS TRIÂNGULOS POR ÂNGULOS\n");
        System.out.print("Digite a primeira medida > ");
        int pM = ler.nextInt();
        System.out.print("Digite a segunda medida > ");
        int sM = ler.nextInt();
        System.out.print("Digite a terceira medida > ");
        int tM = ler.nextInt();
        if (pM == sM && pM == tM && sM == tM) {
            System.out.println("O triângulo é triângulo retângulo");
        } else if (pM > sM && pM > tM || sM > pM && sM > tM || tM > sM && tM > pM) {
            System.out.println("Este triângulo chama-se obtusângula");
        } else if (pM < sM && pM < tM || sM < pM && sM < tM || tM < sM && tM < pM) {
            System.out.println("Este triângulo chama-se acutângula");
        }
        main(null);
    }

    private static void Exercicio27() {
        System.out.println("SALÁRIO COM DESCONTO DO INSS\n");
        System.out.print("Digite o salário > ");
        double salario = ler.nextDouble();
        DecimalFormat df = new DecimalFormat("R$ #,##0,00");
        if (salario < 600) {
            System.out.println("Desconto total de: " + df.format(salario));
        } else if (salario > 600 && salario <= 1200) {
            System.out.println("Desconto total de: " + df.format(salario / 100 * 20));
        } else if (salario > 1200 && salario <= 2000) {
            System.out.println("Desconto total de: " + df.format(salario / 100 * 25));
        } else if (salario > 3000) {
            System.out.println("Desconto total de: " + df.format(salario / 100 * 30));
        }
        main(null);
    }

    private static void Exercicio28() {
        System.out.println("AJUDA AO COMERCIANTE\n");
        System.out.print("Digite o valor do produto > ");
        int valor = ler.nextInt();
        if (valor < 200) {
            System.out.println("O valor de venda deve ser de: " + (valor + (valor / 100 * 20)));
        } else {
            System.out.println("O valor de venda deve ser de: " + (valor + (valor / 100 * 30)));
        }
        main(null);
    }

    private static void Exercicio29() {
        System.out.println("IDADE DE UMA PESSOA");
        System.out.print("Digite sua idade > ");
        int idade = ler.nextInt();
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade > 18 && idade < 65) {
            System.out.println("Maior de idade");
        } else if (idade > 65) {
            System.out.println("Maior de 65 anos");
        }
        main(null);
    }

    private static void Exercicio30() {
        System.out.println("IDADE A PARTIR DO ANO ATUAL\n");
        System.out.print("Digite o ano atual > ");
        int ano = ler.nextInt();
        System.out.print("Digite sua data de nascimento >");
        int nascimento = ler.nextInt();
        if (nascimento > 2016) {
            System.out.println("Digite o ano de nascimento corretamente");
        } else {
            System.out.println("A idade é: " + (ano - nascimento));
        }
        main(null);
    }

    private static void Exercicio31() {
        System.out.println("TROCA DE VALORES A E B\n");
        System.out.print("Digite o valor de A > ");
        int a = ler.nextInt();
        System.out.print("Digite o valor de B > ");
        int b = ler.nextInt();
        int c = a;
        a = a + b - a;
        b = c;
        System.out.println("A = " + a + "\nB = " + b);
        main(null);
    }

    private static void Exercicio32() {
        System.out.println("CLASSE ELEITORAL\n");
        System.out.print("Digite sua idade > ");
        int idade = ler.nextInt();
        if (idade < 16) {
            System.out.println("Não eleitor");
        } else if (idade > 18 && idade < 65) {
            System.out.println("Eleitor obrigatório");
        } else if ((idade < 18 && idade > 16) || (idade > 65)) {
            System.out.println("Eleitor facultativo");
        }
        main(null);
    }

    private static void Exercicio33() {
        System.out.println("PLANO DE SAÚDE\n");
        System.out.print("Digite seu nome: ");
        String nome = ler.next();
        System.out.print("Digite sua idade > ");
        int idade = ler.nextInt();
        DecimalFormat df = new DecimalFormat("R$ 0,00");
        if (idade < 10) {
            System.out.println(nome + " deverá pagar " + df.format(3000));
        } else if (idade > 10 && idade < 29) {
            System.out.println(nome + " deverá pagar " + df.format(6000));
        } else if (idade > 29 && idade < 45) {
            System.out.println(nome + " deverá pagar " + df.format(12000));
        } else if (idade > 45 && idade < 59) {
            System.out.println(nome + " deverá pagar " + df.format(15000));
        } else if (idade > 59 && idade < 65) {
            System.out.println(nome + " deverá pagar " + df.format(25000));
        } else if (idade > 65) {
            System.out.println(nome + " deverá pagar " + df.format(40000));
        }
        main(null);
    }

    private static void Exercicio34() {
        System.out.println("DIZER SE NÚMERO ESTÁ ENTRE ITERVALOS\n");
        System.out.print("Digite o número > ");
        int numero = ler.nextInt();
        if (numero == 5) {
            System.out.println(numero + " é igual a 5");
        } else if (numero == 200) {
            System.out.println(numero + " é igual a 200");
        } else if (numero == 400) {
            System.out.println(numero + " é igual a 400");
        } else if (numero > 500 && numero < 1000) {
            System.out.println(numero + " está entre 500 e 1000");
        } else {
            System.out.println(numero + " não é igual a 5, 200, 400 ou entre 500 e 1000");
        }
        main(null);
    }

    private static void Exercicio35() {
        System.out.println("EQUAÇÃO DE SEGUNDO GRAU");
        int a, b, c;
        double delta, x1, x2;
        System.out.print("Digite o valor de A > ");
        a = ler.nextInt();
        if (a == 0) {
            System.out.println("Não há como calcular");
        } else {
            System.out.print("Digite o valor de B > ");
            b = ler.nextInt();
            System.out.print("Digite o valor de C > ");
            c = ler.nextInt();
            delta = (Math.pow(b, 2)) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Não ha raiz");
            } else if (delta == 0) {
                x1 = (-b + (Math.sqrt(delta))) / (2 * a);
                System.out.println("X1 e X2 valem: " + x1);
            } else {
                x1 = (-b + (Math.sqrt(delta))) / (2 * a);
                x2 = (-b - (Math.sqrt(delta))) / (2 * a);
                System.out.println("Delta vale: " + delta);
                System.out.println("x1 vale: " + x1);
                System.out.println("x2 vale: " + x2);
            }
        }
    }

    private static void Exercicio36() {
        System.out.println("ESTADO CIVIL\n");
        System.out.println("------------------- MENU -----------------");
        System.out.println("1 – solteiro(a)\n2 – desquitado(a)\n3 – casado(a)\n4 – divorciado(a)\n5 – viúvo(a)\n");
        System.out.print("Digite o número respectivo ao seu estado civil > ");
        String numero = ler.next();
        switch (numero) {
            case "1":
                System.out.println("solteiro(a)");
                break;
            case "2":
                System.out.println("desquitado(a)");
                break;
            case "3":
                System.out.println("casado(a)");
                break;
            case "4":
                System.out.println("divorciado(a)");
                break;
            case "5":
                System.out.println("viúvo(a)");
                break;
            default:
                System.out.println("Digite um dos númeres respectivos");
                break;
        }
    }

    private static void Exercicio37() {
        System.out.println("DIZER O MÊS\n");
        System.out.print("Digite o número do mês > ");
        String mes = ler.next();
        switch (mes) {
            case "1":
                System.out.println("JANEIRO");
                break;
            case "2":
                System.out.println("FEVEREIRO");
                break;
            case "3":
                System.out.println("MARÇO");
                break;
            case "4":
                System.out.println("ABRIL");
                break;
            case "5":
                System.out.println("MAIO");
                break;
            case "6":
                System.out.println("JUNHO");
                break;
            case "7":
                System.out.println("JULHO");
                break;
            case "8":
                System.out.println("AGOSTO");
                break;
            case "9":
                System.out.println("SETEMBRO");
                break;
            case "10":
                System.out.println("OUTUBRO");
                break;
            case "11":
                System.out.println("NOVEMBRO");
                break;
            case "12":
                System.out.println("DEZEMBRO");
                break;
            default:
                System.out.println("Digite um número válido");
                break;
        }
        main(null);
    }

    private static void Exercicio38() {
        System.out.println("VALOR DA VENDA\n");
        System.out.print("Digite o valor da compra > ");
        float vCompra = ler.nextFloat();
        if (vCompra < 10) {
            System.out.printf("A venda deste produto deve ser de R$ %.2f\n", (((vCompra / 100) * 70) + vCompra));
        } else if (vCompra > 10 && vCompra < 30) {
            System.out.printf("A venda deste produto deve ser de R$ %.2f\n", (((vCompra / 100) * 50) + vCompra));
        } else if (vCompra > 30 && vCompra < 50) {
            System.out.printf("A venda deste produto deve ser de R$ %.2f\n", (((vCompra / 100) * 40) + vCompra));
        } else if (vCompra > 50) {
            System.out.printf("A venda deste produto deve ser de R$ %.2f\n", (((vCompra / 100) * 30) + vCompra));
        }
        main(null);
    }

    private static void Exercicio39() {
        System.out.println("IMC\n");
        System.out.print("Digite seu nome: ");
        String nome = ler.next();
        System.out.print("Digite seu peso em kg > ");
        double peso = ler.nextDouble();
        System.out.print("Digite sua altura em metros > ");
        double altura = ler.nextDouble();
        double imc = peso / (altura * altura);
        if (imc < 20) {
            System.out.println(nome + " você está: Abaixo do peso");
        } else if (imc > 20 && imc < 25) {
            System.out.println(nome + " você está: Com peso Normal");
        } else if (imc > 25 && imc < 30) {
            System.out.println(nome + " você está: Com Excesso de peso");
        } else if (imc > 30 && imc < 35) {
            System.out.println(nome + " você está: Com Obesidade");
        } else if (imc > 35) {
            System.out.println(nome + " você está: Com Obesidade mórbida");
        }
    }

    private static void Exercicio40() {
        System.out.println("DOSAGEM CORRETA\n");
        int idade = 0;
        double peso = 0, dosagem = 0;
        System.out.print("Digite seu peso > ");
        peso = ler.nextDouble();
        System.out.println("Digite sua idade > ");
        idade = ler.nextInt();
        if (idade >= 12) {
            if (peso >= 60) {
                dosagem = (1000 * 20) * 500;
            } else {
                dosagem = (875 * 20) / 500;
            }
        } else if (peso <= 9) {
            dosagem = (125 * 20) / 500;
        } else if (peso <= 16) {
            dosagem = (250 * 20) / 500;
        } else if (peso <= 24) {
            dosagem = (375 * 20) / 500;
        } else if (peso <= 30) {
            dosagem = (500 * 20) / 500;
        } else {
            dosagem = (750 * 20) / 500;
        }
        System.out.println("Dosagem > " + dosagem);
    }

    private static void Exercicio41() {
        System.out.println("POLUIÇÃO DAS FÁBRICAS");
        double poluicao = 0;
        System.out.print("Digite a poluição emitica >  ");
        poluicao = ler.nextDouble();
        if ((poluicao + 0.05) <= 0.3) {
            System.out.println("O 1° grupo deve suspender suas atividades");
        } else if ((poluicao + 0.05) <= 0.4) {
            System.out.println("O 1° e 2° grupo deve suspender suas atividades");
        } else {
            System.out.println("Todos os grupos devem suspender suas atividades");
        }
    }
}

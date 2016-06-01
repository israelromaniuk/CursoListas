package listadeexercicios;

public class ExerciciosPorFora {

    public static void main(String[] args) {

        System.out.println("Sequencia de Fibonacci\n");

        int valor[] = new int[13], antecessor = 0, total = 0;

        for (int i = 1; i <= 12; i++) {

            if (i <= 2) {
                antecessor = i;
            } else {
                antecessor+=antecessor;
                valor[i] += antecessor;
            }
            System.out.println(antecessor-1);
        }

    }

}

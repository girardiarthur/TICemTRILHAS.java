import java.util.Scanner;

public class Modulo3Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posicao = entrada.nextInt();
        if (posicao <= 0) {
            System.out.println("Posição inválida.");
        } else {
            long anterior = 1;
            long atual = 1;
            for (int i = 3; i <= posicao; i++) {
                long proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
            System.out.printf("O valor na posição %d da sequência de Fibonacci é %d%n", posicao, atual);
        }
        entrada.close();
    }
}

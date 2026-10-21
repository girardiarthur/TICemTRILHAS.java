import java.util.Scanner;

public class Modulo3Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int altura = entrada.nextInt();
        if (altura <= 0) {
            System.out.println("Triângulo inválido");
        } else {
            for (int linha = 1; linha <= altura; linha++) {
                for (int coluna = 0; coluna < linha; coluna++) {
                    if (coluna > 0) System.out.print(" ");
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        entrada.close();
    }
}

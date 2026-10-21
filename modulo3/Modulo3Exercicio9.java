import java.util.Scanner;

public class Modulo3Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base = entrada.nextInt();
        int altura = entrada.nextInt();
        if (base <= 0 || altura <= 0) {
            System.out.println("Retângulo inválido");
        } else {
            for (int linha = 0; linha < altura; linha++) {
                for (int coluna = 0; coluna < base; coluna++) {
                    if (coluna > 0) System.out.print(" ");
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        entrada.close();
    }
}

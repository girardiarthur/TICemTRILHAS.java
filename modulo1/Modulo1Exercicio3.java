import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("O(A) estudante %s ficou com média %.1f%n", nome, media);
        entrada.close();
    }
}

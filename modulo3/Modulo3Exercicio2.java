import java.util.Locale;
import java.util.Scanner;

public class Modulo3Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            opcao = entrada.nextInt();
            if (opcao >= 1 && opcao <= 4) {
                double a = entrada.nextDouble();
                double b = entrada.nextDouble();
                switch (opcao) {
                    case 1: System.out.printf("Resultado: %s + %s = %s%n", fmt(a), fmt(b), fmt(a + b)); break;
                    case 2: System.out.printf("Resultado: %s - %s = %s%n", fmt(a), fmt(b), fmt(a - b)); break;
                    case 3: System.out.printf("Resultado: %s * %s = %s%n", fmt(a), fmt(b), fmt(a * b)); break;
                    case 4:
                        if (b == 0) System.out.println("Divisão por zero não permitida");
                        else System.out.printf("Resultado: %s / %s = %s%n", fmt(a), fmt(b), fmt(a / b));
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        System.out.println("Fim.");
        entrada.close();
    }

    private static String fmt(double valor) {
        return String.format(Locale.US, "%s", valor == Math.rint(valor)
                ? String.format(Locale.US, "%.0f", valor) : Double.toString(valor));
    }
}

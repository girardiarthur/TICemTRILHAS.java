import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        double valorCompra = entrada.nextDouble();
        double descontoPercentual = entrada.nextDouble();
        double total = valorCompra * (1.0 - descontoPercentual / 100.0);

        System.out.printf("Olá %s, sua compra de R$ %.2f foi confirmada!%n", nome, valorCompra);
        System.out.printf("Foi aplicado um desconto de %s.%n", formatoPercentual(descontoPercentual));
        System.out.printf("O total final ficou em R$ %.2f%n", total);
        entrada.close();
    }

    private static String formatoPercentual(double valor) {
        if (valor == Math.rint(valor)) {
            return String.format("%.0f%%", valor);
        }
        return String.format("%s%%", valor);
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int pequeno = entrada.nextInt();
        int medio = entrada.nextInt();
        int grande = entrada.nextInt();
        double descontoPercentual = entrada.nextDouble();

        double subtotal = pequeno * 13.50 + medio * 15.00 + grande * 17.50;
        double total = subtotal * (1.0 - descontoPercentual / 100.0);

        System.out.println("Seu pedido foi registrado.");
        System.out.printf("- Açaí P: %d%n", pequeno);
        System.out.printf("- Açaí M: %d%n", medio);
        System.out.printf("- Açaí G: %d%n", grande);
        System.out.printf("Desconto de %s aplicado.%n", formatoPercentual(descontoPercentual));
        System.out.printf("Total R$ %.2f%n", total);
        entrada.close();
    }

    private static String formatoPercentual(double valor) {
        return valor == Math.rint(valor) ? String.format("%.0f%%", valor) : String.format("%s%%", valor);
    }
}

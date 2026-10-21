import java.util.Locale;
import java.util.Scanner;

public class Modulo2Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int inteiras = entrada.nextInt();
        int meias = entrada.nextInt();
        entrada.nextLine();
        String dia = entrada.nextLine().trim();
        String nacionalTexto = entrada.nextLine().trim();
        boolean nacional = nacionalTexto.equalsIgnoreCase("sim");

        double total;
        if (nacional) {
            total = (inteiras + meias) * 5.00;
        } else if (dia.equalsIgnoreCase("Quarta-feira") || dia.equalsIgnoreCase("quarta")) {
            total = (inteiras + meias) * 14.50;
        } else {
            total = inteiras * 28.50 + meias * (28.50 / 2.0);
        }
        System.out.println("Total à pagar:");
        System.out.printf("R$ %.2f%n", total);
        entrada.close();
    }
}

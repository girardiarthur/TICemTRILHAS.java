import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double reais = entrada.nextDouble();
        double dolares = reais / 5.42;

        System.out.printf("Valor em real R$ %.0f.%n", reais);
        System.out.printf("Valor em dólar $ %.2f.%n", dolares);
        entrada.close();
    }
}

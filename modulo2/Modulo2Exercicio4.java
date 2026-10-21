import java.util.Locale;
import java.util.Scanner;

public class Modulo2Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double gramas = entrada.nextDouble();
        if (gramas <= 0) {
            System.out.println("Peso inválido");
        } else {
            double precoPor100g = gramas >= 1000 ? 3.00 : 3.50;
            double total = gramas / 100.0 * precoPor100g;
            System.out.printf("O total é R$ %.2f%n", total);
        }
        entrada.close();
    }
}

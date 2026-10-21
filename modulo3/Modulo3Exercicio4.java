import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Modulo3Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        while (true) {
            double valor = entrada.nextDouble();
            if (valor == 0) break;
            if (valor < 0) System.out.println("Valor inválido: " + fmt(valor));
            else total += valor;
        }
        int parcelas = entrada.nextInt();
        if (parcelas <= 1) {
            System.out.println("Pagamento à vista: R$ " + fmt(total));
        } else {
            System.out.println("Total da compra: R$ " + fmt(total));
            System.out.printf("Parcelado em %dx de R$ %.2f%n", parcelas, total / parcelas);
        }
        entrada.close();
    }

    private static String fmt(double valor) {
        return BigDecimal.valueOf(valor).stripTrailingZeros().toPlainString();
    }
}

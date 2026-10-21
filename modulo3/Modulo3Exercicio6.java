import java.util.Locale;
import java.util.Scanner;

public class Modulo3Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double saldo = 0;
        while (true) {
            int opcao = entrada.nextInt();
            if (opcao == 0) break;
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + fmt(saldo));
                    break;
                case 2:
                case 3:
                    double valor = entrada.nextDouble();
                    if (valor < 0) {
                        System.out.println("Valor inválido");
                    } else if (opcao == 2) {
                        saldo += valor;
                        System.out.println("Saldo atual: R$ " + fmt(saldo));
                    } else if (valor > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valor;
                        System.out.println("Saldo atual: R$ " + fmt(saldo));
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        entrada.close();
    }

    private static String fmt(double valor) {
        return String.format(Locale.US, "%s", valor == Math.rint(valor)
                ? String.format(Locale.US, "%.0f", valor) : String.format(Locale.US, "%.2f", valor));
    }
}

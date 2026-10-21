import java.util.Locale;
import java.util.Scanner;

public class Modulo2Exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String sigla = entrada.nextLine().trim().toUpperCase(Locale.ROOT);
        String isentoTexto = entrada.nextLine().trim();
        double desconto = entrada.nextDouble();
        double valor;

        switch (sigla) {
            case "SI": valor = 900.00; break;
            case "ADS": valor = 750.00; break;
            case "CS": valor = 1150.00; break;
            case "EC": valor = 1300.00; break;
            case "ES": valor = 950.00; break;
            default:
                System.out.println("Curso não encontrado");
                entrada.close();
                return;
        }

        if (isentoTexto.equalsIgnoreCase("sim")) {
            valor = 0;
        } else {
            valor *= 1.0 - desconto / 100.0;
        }
        System.out.println("Valor da mensalidade:");
        System.out.printf("R$ %.2f%n", valor);
        entrada.close();
    }
}

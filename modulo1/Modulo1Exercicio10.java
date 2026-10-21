import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String descricaoMeta = entrada.nextLine();
        double valorMeta = entrada.nextDouble();
        double salario = entrada.nextDouble();
        double despesas = entrada.nextDouble();

        double saldo = salario - despesas;
        double reservaFixa = saldo * 0.30;
        double disponivelMeta = saldo - reservaFixa;
        double meses = valorMeta / disponivelMeta;

        System.out.printf("Meta: %s (R$ %.2f)%n", descricaoMeta, valorMeta);
        System.out.printf("Salário: R$ %.2f - Despesas: R$ %.2f%n", salario, despesas);
        System.out.printf("Saldo após despesas: R$ %.2f%n", saldo);
        System.out.printf("Reserva fixa (30%%): R$ %.2f%n", reservaFixa);
        System.out.printf("Valor disponível para a meta: R$ %.2f por mês%n", disponivelMeta);
        System.out.printf("Prazo estimado para atingir a meta: %.2f meses%n", meses);
        entrada.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Modulo2Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double ganhos = entrada.nextDouble();
        double gastos = entrada.nextDouble();

        if (ganhos >= gastos) {
            System.out.println("Você está dentro do orçamento!");
        } else {
            System.out.println("Você está fora do orçamento!");
            System.out.println("Não gaste mais!");
        }
        entrada.close();
    }
}

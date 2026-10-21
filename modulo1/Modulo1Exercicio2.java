import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int pessoas = entrada.nextInt();

        double carneKg = pessoas * 0.3;
        double linguicaKg = pessoas * 0.2;
        double frangoKg = pessoas * 0.15;
        double custoCarne = carneKg * 50.0;
        double custoLinguica = linguicaKg * 28.0;
        double custoFrango = frangoKg * 22.0;
        double total = custoCarne + custoLinguica + custoFrango;

        System.out.println("Quantidades:");
        System.out.printf("Carne: %.1f kg - Linguiça: %.1f kg - Frango: %.1f kg%n",
                carneKg, linguicaKg, frangoKg);
        System.out.println("Custo total:");
        System.out.printf("Carne: R$ %.2f - Linguiça: R$ %.2f - Frango: R$ %.2f%n",
                custoCarne, custoLinguica, custoFrango);
        System.out.printf("%nCusto total do churrasco: R$ %.2f%n", total);
        System.out.printf("Cada pessoa deve contribuir com: R$ %.2f%n", total / pessoas);
        entrada.close();
    }
}

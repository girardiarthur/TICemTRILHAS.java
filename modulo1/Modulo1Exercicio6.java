import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        double altura = entrada.nextDouble();
        double peso = entrada.nextDouble();
        double imc = peso / (altura * altura);

        System.out.printf("%s, seu IMC é de %.4f%n", nome, imc);
        entrada.close();
    }
}

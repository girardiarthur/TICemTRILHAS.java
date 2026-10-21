import java.util.Locale;
import java.util.Scanner;

public class Modulo2Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        entrada.nextLine();
        String operacao = entrada.nextLine().trim();
        String chave = operacao.toLowerCase(Locale.ROOT);

        switch (chave) {
            case "1": case "soma": case "adição": case "adicao":
                System.out.printf("%.1f + %.1f = %.1f%n", a, b, a + b); break;
            case "2": case "subtração": case "subtracao":
                System.out.printf("%.1f - %.1f = %.1f%n", a, b, a - b); break;
            case "3": case "multiplicação": case "multiplicacao":
                System.out.printf("%.1f * %.1f = %.1f%n", a, b, a * b); break;
            case "4": case "divisão": case "divisao":
                if (b == 0) System.out.println("Não é possível dividir por zero");
                else System.out.printf("%.1f / %.1f = %.1f%n", a, b, a / b);
                break;
            case "5": case "resto":
                if (b == 0) System.out.println("Não é possível calcular o resto por zero");
                else System.out.printf("%.1f mod %.1f = %.1f%n", a, b, a % b);
                break;
            case "6": case "potência": case "potencia":
                System.out.printf("%.1f ^ %.1f = %.1f%n", a, b, Math.pow(a, b)); break;
            default: System.out.println("Operação não suportada");
        }
        entrada.close();
    }
}

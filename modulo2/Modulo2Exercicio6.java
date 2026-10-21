import java.util.Locale;
import java.util.Scanner;

public class Modulo2Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String cor1 = entrada.nextLine().trim();
        String cor2 = entrada.nextLine().trim();
        String resultado = combinar(cor1, cor2);

        if (resultado == null) {
            System.out.println("Apenas cores primárias são aceitas.");
        } else {
            System.out.println("A combinação resulta em:");
            System.out.println(resultado);
        }
        entrada.close();
    }

    private static String combinar(String a, String b) {
        if (!primaria(a) || !primaria(b)) return null;
        if (a.equalsIgnoreCase(b)) return normalizar(a);
        if ((a.equalsIgnoreCase("Vermelho") && b.equalsIgnoreCase("Azul"))
                || (a.equalsIgnoreCase("Azul") && b.equalsIgnoreCase("Vermelho"))) return "Roxo";
        if ((a.equalsIgnoreCase("Vermelho") && b.equalsIgnoreCase("Amarelo"))
                || (a.equalsIgnoreCase("Amarelo") && b.equalsIgnoreCase("Vermelho"))) return "Laranja";
        return "Verde";
    }

    private static boolean primaria(String cor) {
        return cor.equalsIgnoreCase("Vermelho") || cor.equalsIgnoreCase("Azul")
                || cor.equalsIgnoreCase("Amarelo");
    }

    private static String normalizar(String cor) {
        return cor.substring(0, 1).toUpperCase(Locale.ROOT) + cor.substring(1).toLowerCase(Locale.ROOT);
    }
}

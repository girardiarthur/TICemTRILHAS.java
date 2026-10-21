import java.util.Locale;
import java.util.Scanner;

public class Modulo2Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double nota = entrada.nextDouble();
        double notaCorte = entrada.nextDouble();
        double notaMinima = entrada.nextDouble();
        String situacao;

        if (nota < notaCorte) {
            situacao = "Reprovado";
        } else if (nota >= notaMinima) {
            situacao = "Aprovado";
        } else {
            situacao = "Lista de Espera";
        }
        System.out.println("Situação candidato:");
        System.out.println(situacao);
        entrada.close();
    }
}

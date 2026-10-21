import java.util.Locale;
import java.util.Scanner;

public class Modulo2Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        int faltas = entrada.nextInt();
        double media = (nota1 + nota2 + nota3) / 3.0;

        if (faltas < 0 || media < 0 || media > 10) {
            System.out.println("Parâmetros inválidos");
        } else {
            String situacao;
            if (faltas > 4) {
                situacao = "Reprovado por Falta";
            } else if (media == 0) {
                situacao = "Desistente";
            } else if (media >= 8) {
                situacao = "Aprovado com sucesso";
            } else if (media >= 6) {
                situacao = "Aprovado";
            } else {
                situacao = "Recuperação";
            }
            System.out.printf("Média: %.1f.%n", media);
            System.out.println("Situação: " + situacao);
        }
        entrada.close();
    }
}

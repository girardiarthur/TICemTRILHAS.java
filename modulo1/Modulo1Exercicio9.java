import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double tamanhoPista = entrada.nextDouble();
        int voltas = entrada.nextInt();
        double tempoVolta = entrada.nextDouble();

        double distanciaKm = tamanhoPista * voltas / 1000.0;
        double tempoMinutos = tempoVolta * voltas / 60.0;

        System.out.println("Análise Preditiva Concluída");
        System.out.printf("-Distância total a ser percorrida: %.2f km.%n", distanciaKm);
        System.out.printf("Previsão de conclusão: %.1f minutos.%n", tempoMinutos);
        entrada.close();
    }
}

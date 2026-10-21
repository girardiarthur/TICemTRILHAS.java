import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        String livro = entrada.nextLine();
        int paginas = entrada.nextInt();
        double segundosPorPagina = entrada.nextDouble();
        double horas = paginas * segundosPorPagina / 3600.0;

        System.out.printf("%s, você finalizará a leitura do livro %s%n", nome, livro);
        System.out.printf("em aproximadamente %.2f horas.%n", horas);
        entrada.close();
    }
}

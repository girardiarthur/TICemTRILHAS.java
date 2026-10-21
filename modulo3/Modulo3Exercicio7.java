import java.util.Scanner;

public class Modulo3Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if (numero <= 0) {
            System.out.println("Parâmetro inválido.");
        } else {
            long fatorial = 1;
            for (int i = 2; i <= numero; i++) fatorial *= i;
            System.out.printf("O fatorial de %d é %d.%n", numero, fatorial);
        }
        entrada.close();
    }
}

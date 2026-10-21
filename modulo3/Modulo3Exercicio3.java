import java.util.Scanner;

public class Modulo3Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        boolean registrou = false;
        while (true) {
            int temperatura = entrada.nextInt();
            if (temperatura == 0) break;
            if (temperatura < -50 || temperatura > 60) {
                System.out.println("Temperatura inválida");
            } else {
                maior = Math.max(maior, temperatura);
                menor = Math.min(menor, temperatura);
                registrou = true;
            }
        }
        if (registrou) {
            System.out.println("Maior temperatura: " + maior);
            System.out.println("Menor temperatura: " + menor);
        }
        entrada.close();
    }
}

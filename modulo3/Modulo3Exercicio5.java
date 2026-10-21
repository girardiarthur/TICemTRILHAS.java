import java.util.Scanner;

public class Modulo3Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String original = entrada.nextLine();
        StringBuilder soletrada = new StringBuilder();
        while (true) {
            String letra = entrada.nextLine();
            if (letra.equals("0")) break;
            soletrada.append(letra);
        }
        System.out.println("Palavra original: " + original);
        System.out.println("Palavra soletrada: " + soletrada);
        entrada.close();
    }
}

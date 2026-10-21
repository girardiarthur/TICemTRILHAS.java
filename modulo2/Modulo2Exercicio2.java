import java.util.Scanner;

public class Modulo2Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cor = entrada.nextLine().trim();
        if (cor.equalsIgnoreCase("Vermelho")) {
            System.out.println("Espere");
        } else if (cor.equalsIgnoreCase("Verde")) {
            System.out.println("Atravesse");
        } else {
            System.out.println("Farol inoperante");
        }
        entrada.close();
    }
}

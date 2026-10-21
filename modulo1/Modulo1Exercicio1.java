import java.util.Locale;
import java.util.Scanner;

public class Modulo1Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        String curso = entrada.nextLine();
        int semestre = entrada.nextInt();
        entrada.nextLine();
        String hobby = entrada.nextLine();

        System.out.printf("Prazer, eu sou o(a) %s!%n", nome);
        System.out.printf("Atualmente estou no %dº semestre de %s e meu hobby favorito é %s.%n",
                semestre, curso, hobby);
        entrada.close();
    }
}

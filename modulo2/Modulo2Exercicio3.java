import java.util.Scanner;

public class Modulo2Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia = entrada.nextInt();
        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira",
                "Quinta-feira", "Sexta-feira", "Sábado"};
        if (dia >= 0 && dia < dias.length) {
            System.out.println(dias[dia]);
        } else {
            System.out.println("Dia da semana inválido");
        }
        entrada.close();
    }
}

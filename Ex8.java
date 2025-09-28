import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, media;

        for (int i = 1; i <= 5; i++) {
            do {
                System.out.print("Digite a primeira nota do aluno " + i + " (0 a 10): ");
                nota1 = leitor.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Digite a segunda nota do aluno " + i + " (0 a 10): ");
                nota2 = leitor.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno " + i + " é: " + media);
            System.out.println();
        }
    }
}

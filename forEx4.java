import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;
        double altura;
        double somaAlturas = 0;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = leitor.nextInt();

            System.out.print("Digite a altura da pessoa " + i + " (em metros, ex: 1.75): ");
            altura = leitor.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contador++;
            }
        }

        if (contador > 0) {
            double media = somaAlturas / contador;
            System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + media);
        } else {
            System.out.println("Não houve pessoas com mais de 50 anos.");
        }
    }
}

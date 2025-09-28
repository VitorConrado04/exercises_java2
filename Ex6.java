import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;
        int i = 1;
        int menor = Integer.MAX_VALUE;

        while (i <= 10) {
            System.out.print("Digite o " + i + "º número inteiro e positivo: ");
            numero = leitor.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            i++;
        }

        System.out.println("O menor número digitado é: " + menor);
    }
}

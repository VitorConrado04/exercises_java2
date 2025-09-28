import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();

        System.out.print("Sequência: ");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
    }
}

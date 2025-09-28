import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = leitor.nextInt();

        int valor = 1;

        while (valor <= limite) {
            System.out.println(valor);
            valor = valor * 2;
        }
    }
}

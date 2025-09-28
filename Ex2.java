import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;
        int pares = 0, impares = 0;
        int i = 1;

        while (i <= 10) {
            System.out.print("Digite o " + i + "º número: ");
            numero = leitor.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            i++;
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);
    }
}

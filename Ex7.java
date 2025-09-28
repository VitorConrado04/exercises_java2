import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double altura, peso, imc;
        int pessoasSemObesidade = 0;
        int i = 1;

        while (i <= 10) {
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            altura = leitor.nextDouble();

            System.out.print("Digite o peso da pessoa " + i + " (em kg): ");
            peso = leitor.nextDouble();

            imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
                pessoasSemObesidade++;
            }

            i++;
        }

        System.out.println("Quantidade de pessoas com IMC entre 18,5 e 24,9: " + pessoasSemObesidade);
    }
}

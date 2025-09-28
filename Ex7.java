import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;
        double altura, peso;
        int maiores50 = 0;
        double somaAlturas10a20 = 0;
        int contador10a20 = 0;
        int pesoMenor40 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            idade = leitor.nextInt();

            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            altura = leitor.nextDouble();

            System.out.print("Digite o peso da pessoa " + i + " (em kg): ");
            peso = leitor.nextDouble();

            if (idade > 50) {
                maiores50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas10a20 += altura;
                contador10a20++;
            }

            if (peso < 40) {
                pesoMenor40++;
            }
        }

        double mediaAlturas10a20 = (contador10a20 > 0) ? somaAlturas10a20 / contador10a20 : 0;
        double percentualPesoMenor40 = (pesoMenor40 * 100.0) / 10;

        System.out.println("Quantidade de pessoas maiores de 50 anos: " + maiores50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas10a20);
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: " + percentualPesoMenor40 + "%");
    }
}

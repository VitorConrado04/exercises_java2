import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, media, somaMedias = 0;
        int aprovados = 0, exames = 0, reprovados = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a primeira nota do aluno " + i + ": ");
            nota1 = leitor.nextDouble();

            System.out.print("Digite a segunda nota do aluno " + i + ": ");
            nota2 = leitor.nextDouble();

            media = (nota1 + nota2) / 2;
            somaMedias += media;

            System.out.println("Média do aluno " + i + ": " + media);

            if (media <= 3) {
                System.out.println("REPROVADO");
                reprovados++;
            } else if (media < 7) {
                System.out.println("EXAME");
                exames++;
            } else {
                System.out.println("APROVADO");
                aprovados++;
            }

            System.out.println();
        }

        double mediaClasse = somaMedias / 6;

        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de exame: " + exames);
        System.out.println("Total de reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);
    }
}

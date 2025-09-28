import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, media, somaMedias = 0;
        int aprovados = 0, exames = 0, reprovados = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a primeira nota do aluno " + i + ": ");
            nota1 = leitor.nextDouble();

            System.out.print("Digite a segunda nota do aluno " + i + ": ");
            nota2 = leitor.nextDouble();
import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int nulos = 0, brancos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o voto do eleitor " + i + ": ");
            int voto = leitor.nextInt();

            if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else if (voto == 4) {
                candidato4++;
            } else if (voto == 5) {
                nulos++;
            } else if (voto == 6) {
                brancos++;
            } else {
                System.out.println("Voto inválido, não será contabilizado.");
            }
        }

        double percentualNulos = (nulos * 100.0) / 10;
        double percentualBrancos = (brancos * 100.0) / 10;

        System.out.println("Total de votos para o candidato 1: " + candidato1);
        System.out.println("Total de votos para o candidato 2: " + candidato2);
        System.out.println("Total de votos para o candidato 3: " + candidato3);
        System.out.println("Total de votos para o candidato 4: " + candidato4);
        System.out.println("Total de votos nulos: " + nulos);
        System.out.println("Total de votos em branco: " + brancos);
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
    }
}

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

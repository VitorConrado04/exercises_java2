import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codigo, quantidade;
        double totalCompra = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o código do produto: ");
            codigo = leitor.nextInt();
            System.out.print("Digite a quantidade: ");
            quantidade = leitor.nextInt();

            double preco = 0;
            if (codigo == 100) preco = 1.20;
            else if (codigo == 101) preco = 1.30;
            else if (codigo == 102) preco = 1.50;
            else if (codigo == 103) preco = 1.20;
            else if (codigo == 104) preco = 1.30;
            else if (codigo == 105) preco = 1.00;

            double totalProduto = preco * quantidade;
            totalCompra += totalProduto;

            System.out.printf("Total do produto: R$ %.2f%n", totalProduto);
            System.out.print("Deseja continuar comprando? (s/n): ");
            continuar = leitor.next();
        }

        System.out.printf("Total da compra: R$ %.2f%n", totalCompra);
        leitor.close();
    }
}

import java.util.Scanner;

public class Questão5 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        double valorEmprestimo, taxaJuros, valorTotal, valorParcela;
        int qtdMeses;

        System.out.println("Entre com o valor do empréstimo:");
        valorEmprestimo = scan.nextDouble();

        System.out.println("Qual a taxa de juros mensal?");
        taxaJuros = scan.nextDouble();

        System.out.println("O empréstimo foi em quantos meses?");
        qtdMeses = scan.nextInt();

//juros simples
        valorTotal = valorEmprestimo * (taxaJuros / 100) * qtdMeses;

        valorParcela = valorTotal / qtdMeses;

        System.out .println("O valor Total com juros é R$ " + valorTotal);

        System.out .println("O valor de cada parcela será de R$ " + valorParcela);
    }
}

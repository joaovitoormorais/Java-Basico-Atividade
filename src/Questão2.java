import java.util.Scanner;

public class Questão2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto:");
        double produto1 = scan.nextDouble();

        System.out.println("Digite o preço do segundo produto:");
        double produto2 = scan.nextDouble();

        double precoTotal = produto1 + produto2;

        System.out.println("O preço total dos produtos em R$ foi de:" + precoTotal);
    }
}

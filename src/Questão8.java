import java.util.Scanner;

public class Questão8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do dólar:");
        double valorDolar = scan.nextDouble();

        System.out.println("Digite o valor em real:");
        double valorReal = scan.nextDouble();

        double conversao = valorReal / valorDolar;

        System.out.printf("O valor de R$ %.2f equivale a US$ %.2f.",
                valorReal, conversao);
    }
}

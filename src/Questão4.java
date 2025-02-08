import java.util.Scanner;

public class Questão4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número de horas trabalhadas pelo funcionário:");
        int qtdHoras = scan.nextInt();

        System.out.println("Informe o valor da hora em R$ recebida pelo funcionário:");
        int valorHora = scan.nextInt();

        double salBruto = qtdHoras * valorHora;

        System.out.println("O salário bruto do trabalhado em R$ foi de:" + salBruto);
    }
}

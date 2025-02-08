import java.util.Scanner;

public class Questão7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdPeso;

        double valorFrete, valorPeso = 5;

        System.out.println("Informe o peso da encomenda (em kg):");
        qtdPeso = scan.nextInt();

        valorFrete = qtdPeso * valorPeso;

        System.out.println("O valor total do frete em R$ foi de:" + valorFrete);
    }
}

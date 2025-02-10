import java.util.Scanner;

public class Questão10 {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       double juros = 0.02;

       System.out.println("Digite o preço á vista (em reais) pagas pelo cliente:");
       double precoAVista = scan.nextDouble();

       System.out.println("Digite a quantidade de parcelas a serem pagas por ele:");
       int qtdParcelas = scan.nextInt();

       double precoAPrazo = precoAVista * (1 + juros * qtdParcelas);

       double valorParcela = precoAPrazo / qtdParcelas;

       System.out.println("O valor total de parcelas a serem pagas (em reais) é de:" +
       valorParcela);
    }
}

import java.util.Scanner;

public class Questão6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdLitros;

        double ContaAgua, valoLitro = 0.02;

        System.out.println("Digite a quantidade de litros consumidos pela casa:");
        qtdLitros = scan.nextInt();

        ContaAgua = qtdLitros * valoLitro;

        System.out.println("O valor da conta de água em R$ foi de:" + ContaAgua);
    }
}

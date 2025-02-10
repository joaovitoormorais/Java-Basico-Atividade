import java.util.Scanner;

public class Questão9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int altura, largura, qtdTinta;

        System.out.println("Digite a altura da parede (em metros):");
        altura = scan.nextInt();

        System.out.println("Digite a largura da parede (em metros):");
        largura = scan.nextInt();

        int areaTotal = altura * largura;

        qtdTinta = areaTotal / 2;

        System.out.println("A quantidade de tinta a ser pintada (em litros) é de:" + qtdTinta);
    }
}

import java.util.Scanner;

public class Questão3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distância percorrida pelo carro (em km):");
        int distanciaKm = scan.nextInt();

        System.out.println("Digite o tempo gasto pelo carro (em horas):");
        int tempoGastoHoras = scan.nextInt();

        int distanciaMetros = distanciaKm * 100;

        int tempoGastoSegundos = tempoGastoHoras * 3600;

        double velocidadeMedia = distanciaMetros / tempoGastoSegundos;

        System.out.println("A velocidade média do carro em Km foi de:" + velocidadeMedia);
    }
}

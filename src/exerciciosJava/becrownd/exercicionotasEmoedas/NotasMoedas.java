package exerciciosJava.becrownd.exercicionotasEmoedas;

import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valor = entrada.nextDouble();
        int centavos = (int) Math.round(valor * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas){
            int quantidade = centavos / nota;
            System.out.printf("%d nota(s) de R$ %.2f\n", quantidade, nota / 100.0);
            centavos %= nota;
        }
        System.out.println("MOEDAS:");
        for (int moeda : moedas){
            int quantidade = centavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidade, moeda/ 100.0);
            centavos %= moeda;
        }
    }
}

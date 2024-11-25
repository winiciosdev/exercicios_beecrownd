package exerciciosJava.becrownd.exercicio3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();

        double delta = (B * B) - (4* A * C);

        if (delta < 0){
            System.out.println("Impossivel calcular");
        } else {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }
    }
}

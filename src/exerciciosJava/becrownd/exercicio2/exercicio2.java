package exerciciosJava.becrownd.exercicio2;
import  java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        //Calcular a área de um circulo

        Scanner entrada = new Scanner(System.in);

        double raio = entrada.nextDouble();
        double n = 3.14159;

        double calculoArea = n * (raio*raio);

        System.out.printf("A=%.4f%n" , calculoArea);
    }



}

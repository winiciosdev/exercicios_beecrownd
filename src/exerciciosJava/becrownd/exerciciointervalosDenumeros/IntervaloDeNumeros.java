package exerciciosJava.becrownd.exerciciointervalosDenumeros;
import java.util.Scanner;

public class IntervaloDeNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor = entrada.nextDouble();
    if (valor >= 0.00 && valor <= 25.00){
        System.out.println("Intervalo [0,25]");
    } else if (valor >=25.01 && valor <= 50.00){
        System.out.println("Intervalo (25,50]");
    } else if (valor>= 50.01 && valor <= 75.00){
        System.out.println("Intervalo (50,75]");
    } else if (valor >= 75.01 && valor <= 100){
        System.out.println("Intervalo (75,100]");
    }else{
        System.out.println("Fora de intervalo");
    }
    }
}

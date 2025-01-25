package exerciciosJava.becrownd.shortsimples;

/*
* O Exercício pede que o programa receba 3 números inteiros, e os imprima em ordem crescente, pule uma linha
* e imprima os números na ordem em que foram inseridos.
*  */

import java.util.Arrays;
import java.util.Scanner;

public class ShortSimples {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();

        //inseri as variaveis dentro de um array para ordenalos em ordem crescente
        int[] numeros = {num1, num2,num3};

        //ordenando os números em ordem crescente
        Arrays.sort(numeros);

        //for para percorrer os elementos do array
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //Imprime uma linha em branco
        System.out.println();

        //copia do array porem sem a modificação do "Arrays.sort"
        int[] numOriginais = {num1,num2,num3};

        //imprimindo na ordem em que foram inseridos
        for (int i = 0; i < numOriginais.length; i++){
            System.out.println(numOriginais[i]);
        }
    }
}

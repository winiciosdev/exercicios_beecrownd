package exerciciosJava.becrownd.exercicio4;

import java.util.Scanner;

/* enunciado do exercício: Leia 4 valores inteiros
 A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
  e a soma de C com D for maior que a soma de A e B e se C e D
  , ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos". */
public class VerificacaoDeValores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores  aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }

    }
}

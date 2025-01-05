package exerciciosJava.becrownd.ExercicioRpg;


import java.util.Scanner;

public class RpgVampiros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while (true){

            //energia vital vampiro1
            int EV1 = entrada.nextInt();

            //energia vital vampiro2
            int EV2 = entrada.nextInt();

            int AT = entrada.nextInt();

            int D = entrada.nextInt();

            //condição para parar o programa
            if (EV1 == 0 && EV2 == 0 && AT == 0 & D == 0){
                break;
            }

            double P1 = AT / 6.0;
            double P2 = 1 - P1;

            int T1 = (int) Math.ceil((double) EV2/ D);
            int T2 = (int) Math.ceil((double) EV1/ D);

            double vitoriavamp1 = Math.pow(P1, T1) / (Math.pow(P1,T1) + Math.pow(P2,T2));

            double porcentagemVamp1 = vitoriavamp1 * 100;
            System.out.printf("%.1f%n", porcentagemVamp1);
        }
    }
}
/*
 O calculo da probabilidade do vampiro 1 vencer o duelo está com uma pequena variação
no caso que o becrownd fornece, que tem as entradas: 8 5 3 1.
a saida esperada é 61.5 mas está retornando 88.9
 */

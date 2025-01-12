package exerciciosJava.becrownd.contadorDehoras;

/* O exercício pede um programa que leia dois núemros inteiros, e com base nesses números calcular a duração de um jogo */

import java.util.Scanner;
public class ContadorDeHoras {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //entrada dos dois números representando as horas de inicio e fim da partida
        int horaInicio = entrada.nextInt();
        int horaFim = entrada.nextInt();

        /*condição para que se o jogo tiver ultrapassado as meia noite seja calculado adicionando 24 horas
         subtraindo a hora de inicio */
        if (horaFim<=horaInicio){
            int tempoJogo = horaFim + 24 - horaInicio;
            System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");
        }else{
            int tempoJogo = horaFim - horaInicio;
            System.out.println("O JOGO DUROU " + tempoJogo + " HORA(S)");
        }
    }
}

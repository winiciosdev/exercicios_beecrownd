package exerciciosJava.becrownd.exercicio1;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double n1 = l.nextDouble();
        double n2 = l.nextDouble();
        double n3 = l.nextDouble();
        double n4 = l.nextDouble();

        double notaCompeso1 = n1 * 2;
        double notaCompeso2 = n2 * 3;
        double notaCompeso3 = n3 * 4;
        double notaCompeso4 = n4 * 1;

        double somaNotas = notaCompeso1 + notaCompeso2 + notaCompeso3 + notaCompeso4;
        double totalPesos = 10;


        double resultado = Math.round((somaNotas/totalPesos)*10)/10.0;

        if (resultado >= 7){
            System.out.printf("Media: %.1f%n", resultado);
            System.out.println("Aluno aprovado.");
        } else if (resultado >= 5 && resultado <= 6.9) {
            System.out.printf("Media: %.1f%n", resultado);
            System.out.println("Aluno em exame.");
            double notaExame = l.nextDouble();
            System.out.printf("Nota do exame: %.1f%n",notaExame);
            double mediaFinal = (resultado + notaExame) / 2;
            if (mediaFinal >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", mediaFinal);
            }else {
                System.out.println("Aluno reprovado.");
            }

        }else{
            System.out.printf("Media: %.1f%n", resultado);

            System.out.println("Aluno reprovado.");
        }

    }
}
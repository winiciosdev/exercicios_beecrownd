package exerciciosJava.becrownd.tipostriangulos;
import java.util.Arrays;
import java.util.Scanner;
public class TiposDeTriangulos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        Double[] ordemLados = {a,b,c};

        //ordenando em ordem crescente
        Arrays.sort(ordemLados);

        //Ordenando em ordem decrescente garantindo que "A" seja o maior valor
        double A = ordemLados[2];
        double B = ordemLados[1];
        double C = ordemLados[0];

        //Gerando os valores elevados a 2
        double aElevado2 = A * A;
        double bElevado2 = B * B;
        double cElevado2 = C * C;


        if (A >= (B + C)){
            System.out.println("NAO FORMA TRIANGULO");
            //usando o return para finalizar as verificações caso "A" seja maior que a soma de B + C
            return;
            //verificações utilizando apenas if para checar todos os triangulos que os valores podem gerar.
        }if (aElevado2 == (bElevado2 + cElevado2)){
            System.out.println("TRIANGULO RETANGULO");
        }if (aElevado2 > (bElevado2 + cElevado2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if(aElevado2 < (bElevado2 + cElevado2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        //condição separada para verificar se os valores podem gerar triangulos equilateros e isosceles
        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        }else if (A == B || B == C|| A == C){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}

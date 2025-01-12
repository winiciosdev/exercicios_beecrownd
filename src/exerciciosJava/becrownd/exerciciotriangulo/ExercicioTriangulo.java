package exerciciosJava.becrownd.exerciciotriangulo;

import java.util.Scanner;
public class ExercicioTriangulo {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        double a = l.nextDouble();
        double b = l.nextDouble();
        double c = l.nextDouble();

        if(a + b > c && a + c > b && b + c > a){
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        }else{
            double area = ((a + b) * c)/2;
            System.out.printf("Area = %.1f%n", area);
        }

    }
}

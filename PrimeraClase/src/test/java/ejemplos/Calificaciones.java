package ejemplos;

import java.util.Scanner;

public class Calificaciones {

    public static void main(String [] args) {

        //Dato con decimales
        float nota;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la calificacion: ");
        nota = scanner.nextFloat();

        while (nota < 0 || nota > 10) {
            System.out.println("La calificacion no es valida, introduce otra: ");
            nota = scanner.nextFloat();
        }

        if (nota < 5)
            System.out.println("Reprobado");
        else if (nota >= 5 && nota < 6)
            System.out.println("Paso de panzaso!");
        else if (nota >= 6 && nota < 7)
            System.out.println("Paso casi de panzaso");
        else if (nota >= 7 && nota < 8)
            System.out.println("Nota Buena");
        else if (nota >= 8 && nota < 9)
            System.out.println("Muy Bien!");
        else if (nota >= 9 && nota < 10)
            System.out.println("Felicidades!!");
        else
            System.out.println("Wow!!!!");

    }

}

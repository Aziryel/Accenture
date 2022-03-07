package ejemplos;

import java.util.Scanner;

public class Dias_if_else {

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        int  N = 0;
        System.out.println("Introduce un numero: ");
        N = reader.nextInt();

        if (N == 1)
            System.out.println("Hoy es Lunes");
        else if (N == 2)
            System.out.println("Hoy es Martes");
        else if (N == 3)
            System.out.println("Hoy es Miercoles");
        else if (N == 4)
            System.out.println("Hoy es Jueves");
        else if (N == 5)
            System.out.println("Hoy es Viernes");
        else if (N == 6)
            System.out.println("Hoy es Sabado");
        else if (N == 7)
            System.out.println("Hoy es Domingo");
        else
            System.out.println("Ese numero no es valido");

    }

}

import java.util.Scanner;
import java.util.Random;

public class array{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" Que materia es? ");
        String materia = leer.nextLine();

        System.out.println(" Escriba la cantidad de notas: ");
        int tamaño = leer.nextInt();


        int[] notas = new int[tamaño];

        double[] porcentaje = new double[tamaño];




        for( int i = 0; i < tamaño ; i++ ){

            int numMin = 0, numMax = 5;
            int range = (numMax - numMin) +1;
            cant_notas [i] = (int)(Math.random()* range) + numMin;


            System.out.println(cant_notas[i]);

        }

        for(double nTotal = 0; nTotal < cant_notas.length; )
        
        nTotal = nTotal + cant_notas.length



    }

}
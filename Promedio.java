import java.util.Scanner;

public class Promedio{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println(" Que materia es? ");
        String materia = leer.nextLine();

        System.out.println(" Escriba la cantidad de notas: ");
        int tamaño = leer.nextInt();

        System.out.println("Ingrese la cantidad de materias: ");
        int cantidadMaterias = leer.nextInt();
        leer.nextLine();

        double[] promediosMaterias = new double[cantidadMaterias];


        for( int i = 0; i < cantidadMaterias ; i++ ){

            System.out.println("Ingrese el nombre de la materia " + (i+1) + " : ");
            String nombreMateria = leer.nextLine();

            System.out.println("Ingrese la cantidad de notas para la materia " + nombreMateria + " : ");
            int cantidadNotas = leer.nextInt();
            leer.nextLine();

            double[] notas = new double[cantidadNotas];
            double[] porcentajes = new double[cantidadNotas];

        }

        int cantidadNotas;
        String nombreMateria;
        double porcentajes;
        double notas;
        int i = 0, j=0;


        for (int j = 0; j < cantidadNotas; j++) {
            
            System.out.print("Ingrese la nota " + (j+1) + " para la materia " + nombreMateria + ": ");


            System.out.print("Ingrese el porcentaje de la nota " + (j+1) + " para la materia " + nombreMateria + ": ");
            leer.nextLine();

            double promedioMateria = 0;
            for (int j= 0; j < cantidadNotas; j++) {
                promedioMateria += notas[j] * (porcentajes[j] / 100);
            }
            promediosMaterias[i] = promedioMateria;

            System.out.println("Nota final para la materia " + nombreMateria + ": " + promedioMateria);
        }

        double promedioTotal = 0;

        for (double promedio : promediosMaterias) {

            promedioTotal += promedio;

        }

        promedioTotal /= promediosMaterias.length;

        System.out.println("Promedio del semestre es " + promedioTotal);

    }

}
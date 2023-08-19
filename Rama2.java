import java.util.Scanner;
//JOSE MANUEL MEJIA CORREDOR
public class Rama2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double num1= 0, num2 = 0;
        
        
        System.out.println("Introduce el primer numero");
        num1 = leer.nextDouble();

        System.out.println("Introduce el segundo numero");
        num2 = leer.nextDouble();

        //SUMA
        double suma = num1 + num2;
        System.out.println("El resultado final es: " + suma);

        //RESTA
        double resta = num1 - num2;
        System.out.println("El resultado final es: " + resta);

        //MULTIPLICA
        double multiplica = num1 * num2;
        System.out.println("El resultado final es: " + multiplica);

        //DIVIDE
        double divide = num1 / num2;
        System.out.println("El resultado final es: " + divide);

    }
}


import java.util.Scanner;

public class Rama1 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        
        int num1= 0, num2 = 0;
        
        
        System.out.println("Introduce el primer numero");
        num1 = leer.nextInt();

        System.out.println("Introduce el segundo numero");
        num2 = leer.nextInt();

        int suma = num1 + num2;
        System.out.println("El resultado final es: " + suma);


    }
}

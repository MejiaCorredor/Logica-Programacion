public class CalculadoraFun {
    static int suma(int i, int b) {
       
        return i + b;
        
    }

    static int resta(int i, int b) {
        return i - b;
    }

    static int multiplica(int i, int b) {
        return i * b;
    }

    static double dividir(double i, double b) {
        if (i == 0 && b == 0) {
            return 0;
        }
        return i / b;

    }
    
    static double division(int operador, int operando){
        return operando;
        
    }

    public static void main(String[] args) {
        System.out.println(suma(0, 0)); 

        System.out.println(resta(0, 0));

        System.out.println(multiplica(0, 0));
        
        System.out.println(dividir(0, 0));
    }

}

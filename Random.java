import java.util.Random;

public class nombres {

    private static final String[] nombres = {"Pepe", "Jose", "fausto", "isaac", "lionel", "messi" , "cristiano", "Ronaldo"};
    private static final Random rand = new Random();
    public static void main(String []args) {
        System.out.println("Nombre Generado: " + nombresgeneradosgeneradito()); 
    }

    public static String nombresgeneradosgeneradito() {
        int IndiceAleaotorioAleatorito = rand.nextInt(nombres.length);
        return nombres [IndiceAleaotorioAleatorito];
    }

}

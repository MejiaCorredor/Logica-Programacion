import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

//Jose MANUEL MEJÍA CORREDOR

public class Taller4 {

    static String getNombreDeCasa() {
        Random random = new Random();

        String[] prefijos = { "la", "una" };
        String[] mid = { "cueva", "casa", "mansión" };
        String[] suf = {
                "de la montaña",
                "del bosque",
                "del pantano",
                "del desierto",
                "de Drácula",
                "de la bruja",
                "del vampiro",
        };

        int randPref = random.nextInt(prefijos.length);
        int randMid = random.nextInt(mid.length);
        int randSuf = random.nextInt(suf.length);
        return prefijos[randPref] + " " + mid[randMid] + " " + suf[randSuf];
    }

    static int getPrecio() {
        Random random = new Random();
        return random.nextInt(1000000);
    }

    static int getPrecioConPeso(String barrio, int precio) {
        HashMap<String, Integer> pesos = new HashMap<>();
        pesos.put("Floresta", 3); // Asigna pesos según los barrios

        int peso = pesos.getOrDefault(barrio, 1); // Si el barrio no tiene peso, se asigna 1

        return precio * peso;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scner = new Scanner(System.in);

        // Asociadas
        HashMap<String, Integer> ventas = new HashMap<String, Integer>();

        String[] nombreBarrios = {
                "Floresta",
                "Aranjuez",
                "Manrique",
                "Carlos E",
                "Robledo",
        };

        for (String barrio : nombreBarrios) {
            ventas.put(barrio, 0);
        }

        int userEntry = 0;

        System.out.println("¡Hola te doy la bienvenida a Tinder House!");
        System.out.println("El juego consiste en hacer match con cada casa que te guste");
        
        System.out.println("presiona 0 para descartar, 1 para comprar y 2 para terminar el juego");

        do {
            // Aqui va el juego
            String nombreCasa = getNombreDeCasa();
            int randBarrio = rnd.nextInt(nombreBarrios.length);
            int precio = getPrecio();
            int precioConPeso = getPrecioConPeso(nombreBarrios[randBarrio], precio);

            System.out.println("------*-------");
            System.out.println(nombreCasa);
            System.out.println(nombreBarrios[randBarrio]);
            System.out.println(precioConPeso + " Bolivares");
            System.out.println("------*-------");

            userEntry = scner.nextInt();

            if (userEntry == 1) {
                int actualVenta = ventas.get(nombreBarrios[randBarrio]);
                int newVenta = actualVenta + precioConPeso;
                ventas.replace(nombreBarrios[randBarrio], newVenta);
            }

        } while (userEntry != 2);

        System.out.println("Reporte de ventas:");

        int maxGanancia = Integer.MIN_VALUE;
        int minGanancia = Integer.MAX_VALUE;
        int maxCasasVendidas = Integer.MIN_VALUE;

        String barrioMaxGanancia = "";

        String barrioMinGanancia = "";
        String barrioMaxCasas = "";

        for (String barrio : ventas.keySet()) {
            int ganancia = ventas.get(barrio);

            if (ganancia > maxGanancia || (ganancia == maxGanancia && barrio.length() < barrioMaxGanancia.length())) {
                maxGanancia = ganancia;
                barrioMaxGanancia = barrio;
            }

            if (ganancia < minGanancia || (ganancia == minGanancia && barrio.length() < barrioMinGanancia.length())) {
                minGanancia = ganancia;
                barrioMinGanancia = barrio;
            }

            if (ganancia > maxCasasVendidas || (ganancia == maxCasasVendidas && barrio.length() < barrioMaxCasas.length())) {
                maxCasasVendidas = ganancia;
                barrioMaxCasas = barrio;
            }

            System.out.println(barrio + " vendió " + ganancia);
        }

        System.out.println("Barrio que más dinero ganó: " + barrioMaxGanancia);
        System.out.println("Barrio que menos dinero ganó: " + barrioMinGanancia);
        System.out.println("Barrio que más casas vendió: " + barrioMaxCasas);
    }
}

import java.util.*;
//JOSE MANUEL MEJÍA CORREDOR
class Item {
    double costo;
    int horas;

    public Item(double costo, int horas) {
        this.costo = costo;
        this.horas = horas;
    }
    public double getCostoTotal() {
        return this.costo * this.horas;
    }
}
class Lugar {
    String nombre;
    List<Item> items;

    public Lugar(String nombre, List<Item> items) {
        this.nombre = nombre;
        this.items = items;
    }

    public double getCostoTotal() {
        double total = 0.0;
        for (Item item : this.items) {
            total += item.getCostoTotal();
        }
        return total;
    }
}

public class Parcial2 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Lugar> lugares = new ArrayList<>();

        String[] nombresLugares = {"1", "2", "3", "4", "5"};

        for (String nombreLugar : nombresLugares) {
            List<Item> items = new ArrayList<>();
            for (int j = 0; j < rand.nextInt(10); j++) {
                items.add(new Item(rand.nextDouble(), rand.nextInt(24)));
            }
            lugares.add(new Lugar(nombreLugar, items));
        }
        double maxCosto = 0.0;
        String maxLugar = "";
        int totalHoras = 0;

        for (Lugar lugar : lugares) {
            double costoTotalLugar = lugar.getCostoTotal();
            System.out.println("El " + lugar.nombre + " ha gastado " + costoTotalLugar + ".");

            if (costoTotalLugar > maxCosto) {
                maxCosto = costoTotalLugar;
                maxLugar = lugar.nombre;
            }

            for (Item item : lugar.items) {
                totalHoras += item.horas;
            }
        }

        System.out.println("El lugar que más ha gastado es: " + maxLugar);
        System.out.println("El total de horas es: " + totalHoras);
    }
}
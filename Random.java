import java.util.Random;

public class Random {

    /*private static final String[] nombres = {"Pepe", "Jose", "fausto", "isaac", "lionel", "messi" , "cristiano", "Ronaldo"};
    private static final Random rand = new Random();
    public static void main(String []args) {
        System.out.println("Nombre Generado: " + nombresgeneradosgeneradito()); 
    }

    public static String nombresgeneradosgeneradito() {
        int IndiceAleaotorioAleatorito = rand.nextInt(nombres.length);
        return nombres [IndiceAleaotorioAleatorito];
    }

}*/

    static String getRandomSong(){

        String[] cancion = {"la gozadera", "rhapsody", "la grupie", "thriller", "josefina"};

        System.out.println( "mi cancion es : " + getRandomSong(songName))
        
        int index = (int)(Math.Random()* (cancion.length-1)) + cancion.length-1;

        String responseCancion = cancion[index];
        return responseCancion;
    }


    static String getDuration(){
        int minutes = (int)(Math.random()*10)+1;

        int seconds = (int)(Math.random()*60);

        String response = minutes + ":" + seconds;
        //retornar
        return response;
    }


    public int nextInt(int i) {
        return 0;
    }


    public double nextDouble() {
        return 0;
    }


    }
}

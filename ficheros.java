import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.*;


public class ficheros {

    public static void main (String []args){

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        String path = getPath();

        try {
            archivo = new File("sample.txt");
            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null)
            System.out.println(linea);



        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error al leer el archivo");

        } finally{
            try {
                if(null != fr){
                    fr.close();
                }

            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }


        }


    }

    private static String getPath() {
        return null;
    }

}

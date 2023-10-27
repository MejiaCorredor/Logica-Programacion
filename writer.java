import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class writer {
    public static void main(String[] args) {
        try{

        FileWriter fw = new FileWriter("sample.txt");
            PrintWriter pw = new PrintWriter(fw);

        try {
            
            for (int id = 0; id < 100000; id++) {
                Random random = new Random();
                pw.println("000000" + (id + 1) + "-");

            }
            /*
             * pw.println("hola en bloque");
             * pw.print("si salto de linea");
             */

        } catch (Exception e) {

        } finally {
            try {
                fw.close();

            } catch (Exception e) {
                // TODO: handle exception
            }

        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("algo");

    }catch{

    }
}
}

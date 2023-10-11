import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excepciones {
    public static void main(String []args){
        
        
        
        FileReader myFileReader = null;
        try {
            myFileReader = new FileReader("Something.txt");
            
        } catch (FileNotFoundException ioE) {
            // TODO: handle exception
        } catch (Exception e){

        }
        

        int [] myArray = new int[3];
        int counter = 0;
        System.out.println("voy a intentar llenar");
        try {
            while(counter < myArray.length){
                myArray[counter] = counter * 10;
                counter++;
            }
            
            
            /*for (int i = 0; i <= myArray.length; i++){
                myArray[i] = i*10;
            }*/
        } catch (Exception e) {
            System.out.println("Emcontre una excepcion");
        } finally{
            System.out.println("esto se ejecuto");
        }
        System.out.println("Inicia la pintada del array ");
        for(int element : myArray){

        }

        
    }
}

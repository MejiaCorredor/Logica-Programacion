import java.util.Scanner;

public class piramide {
    public static void main(String []args){
        Scanner leer = new Scanner(System.in);

        System.out.println(" frase: ");
        String frase = leer.nextLine();

        int filas = 4;
        


        boolean[][] asteriscos = new boolean[filas][];


        for(int i = 0; i < asteriscos.length ; i++){

            for(int j = 0; j < asteriscos[i].length; j++){

                if(asteriscos[i][j] == true){
                    System.out.println("*");
                    
                }else{

                    System.out.println(" ");
                }
            }


            
        }
    }
}


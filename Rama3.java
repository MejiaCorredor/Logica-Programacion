import java.util.Scanner;

public class Rama3{  
  public static void main(String[] args){
    Scanner leer = new Scanner(System.in);


    String passwordCorrecto = "jose1234";
    String usuarioCorrecto = "josemanuel";
    
    String usuario;
    String password;
    
    do {
      System.out.println("Ingresa el usuario");  
      usuario = leer.nextLine();

      System.out.println("Ingresa el password");
      password = leer.nextLine();

      
    } while(!usuario.equals(usuarioCorrecto) && !password.equals(passwordCorrecto));
    
  }
}
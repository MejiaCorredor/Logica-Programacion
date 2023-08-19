import java.util.Scanner;
//JOSE MANUEL MEJIA CORREDOR
public class Rama3{  
  public static void main(String[] args){
    Scanner leer = new Scanner(System.in);


    String passwordCorrecto = "jose1234";
    String usuarioCorrecto = "josemanuel";
    
    String usuario;
    String password;
    boolean credencialesCorrectos;
    
    do {
      credencialesCorrectos = true;
      
        System.out.println("Ingresa el usuario");  
      usuario = leer.nextLine();

      System.out.println("Ingresa el password");
      password = leer.nextLine();

      if (!usuario.equals(usuarioCorrecto) || !password.equals(passwordCorrecto)) {
        credencialesCorrectos = false;
        System.out.println("Usuario o password incorrecto. \n Vuelve a intentar. ");
    }
      
    } while(!credencialesCorrectos);
    
    leer.close();
  }
}
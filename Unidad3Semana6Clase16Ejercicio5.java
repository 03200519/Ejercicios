
package unidad3semana6clase16ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Edwin Alejandro
 */
public class Unidad3Semana6Clase16Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int password;
        do{
         System.out.println("Introduzca su contraseña  numérica: ");
         password = keyboard.nextInt();
         if (password !=1234)
             System.out.println("La contraseña no es válida. ");
        }
        while  (password != 1234);
    }
    }
    

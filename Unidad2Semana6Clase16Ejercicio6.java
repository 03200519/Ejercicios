
package unidad2semana6clase16ejercicio6;
import java.util.Scanner;
/**
 *
 * @author Edwin Alejandro
 */
public class Unidad2Semana6Clase16Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int fact=1;
     int num=0;
      System.out.println("Introduce numero");
      num = teclado.nextInt();
      for(int ind=1;ind<=num;ind++){
     fact*=ind;
      }
      System.out.println("El factorial es"+fact);
 
    }
    
}

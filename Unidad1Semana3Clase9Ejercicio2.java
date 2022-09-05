
package unidad1.semana3.clase9.ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Edwin Alejandro
 */
public class Unidad1Semana3Clase9Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner entrada = new Scanner(System.in);
            
            int numero1;
            int numero2;
            
            
              System.out.print("Escribe el primer entero:");
        numero1 = entrada.nextInt ();
        
        System.out.print("Escribe el segundo entero:");
        numero2 = entrada.nextInt ();
        
        if (numero1 == numero2)
         System.out.print("El numero " + numero1 + " es igual a " + numero2);
        
        if (numero1 != numero2)
         System.out.print("El numero " + numero1 + " es distinto a " + numero2);
         
         if (numero1 < numero2)
         System.out.print("El numero " + numero1 + " es menor a " + numero2);
         
         if (numero1 > numero2)
         System.out.print("El numero " + numero1 + " es mayor a " + numero2);
         
         if (numero1 <= numero2)
         System.out.print("El numero " + numero1 + " es menor o igual a " + numero2);
         
         if (numero1 >= numero2)
         System.out.print("El numero " + numero1 + " es mayor o igual a " + numero2);
    }
    
}


package unidad1semana4clase11ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Edwin Alejandro
 */
public class Unidad1Semana4Clase11Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Entrada = new Scanner(System.in);
         
         float nota1, nota2, nota3, promedio;
         
         System.out.print("Ingrse la primera nota:");
        nota1 = Entrada.nextFloat ();
        System.out.print("Ingrese la segunda nota:");
        nota2 = Entrada.nextFloat ();
System.out.print("Ingrese la tercera nota:");
        nota3 = Entrada.nextFloat ();
        
        promedio = (nota1+nota2+nota3) /3;

        System.out.print("El promedio es:"+ promedio);
        if (promedio>=7){
             System.out.print("promocionado");
        } else if (promedio >=4){
             System.out.print("Regular:");
        } else{
          System.out.print("Reprobado");
         
        }   
         
    }
    
}

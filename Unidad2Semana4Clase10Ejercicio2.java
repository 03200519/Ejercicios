package unidad2semana4clase10ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Edwin Alejandro
 */
public class Unidad2Semana4Clase10Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int suma = 0, num;
       double promedio;
       Scanner ingresar = new Scanner(System.in);
       for(int i=1; i<=5; i++){
           System.out.println("Ingresar el numero" + i);
           num = ingresar.nextInt();
           suma = suma + num;   
       }
       promedio = suma / 5;
       System.out.println("El promedio es:" + promedio);
    }
    
}

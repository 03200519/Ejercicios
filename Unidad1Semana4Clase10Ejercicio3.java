
package unidad1semana4clase10.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Edwin Alejandro
 */
public class Unidad1Semana4Clase10Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                  Scanner Entrada = new Scanner(System.in);
          
           System.out.print("Ingrese el numero de meses :");
           float NM = Entrada.nextFloat();
           double precio, prima, descuento, deuda ,cuota;
           if(NM >=1 && NM <=65){
               precio= 23000 *1.13;
               descuento = 0;
               if (NM == 36){
                   descuento = precio * 0.2;
                   prima = (precio - descuento) * 0.15;
                   deuda = (precio - descuento) - prima;
           }else {
                   prima = precio * 0.15;
                   deuda = precio - prima;
   
               }
               cuota= deuda / NM;
               System.out.print("Precio:" + precio);
               System.out.print("Descuento:" + descuento);
               System.out.print("Deuda:" + deuda);
               System.out.print("Cuota:" + cuota);
               
           }else{
                  System.out.print("Lo siento corazon lea por favor");
               
               
           }
    }
    
}

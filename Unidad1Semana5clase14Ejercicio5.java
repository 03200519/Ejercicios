
package unidad1semana5clase14ejercicio5;
import java.util.Scanner;

/**
 *
 * @author Edwin Alejandro
 */
public class Unidad1Semana5clase14Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int reglas;
        double nota;
         System.out.print("Usted cumple las reglas de la universidad:");
          System.out.print("Ingrese un numero: \n 1. Siempre \n 2. Aveces \n 3. Nunca");
        reglas = Entrada.nextInt();
         System.out.print("Que nota obtuvo en el laboratorio:");
         nota = Entrada.nextInt();
        if (reglas == 1){
            if (nota >= 8 & nota <=10){
                nota = 10;
            }else{
                System.out.print("Nota no valida");
            }
        } else if (reglas == 2){
           if (nota< 6){
               nota = nota + 0.5;
           } else if ( nota >=6 & nota <8){
               nota = nota + 0.7;
           } else {
               System.out.print("Nota invalida");
           }
        } else {
            System.out.print(" Usted debe cumplir las reglas");
        }
        System.out.print("La nueva nota es :" + nota);
            
            
            
            }
        }
  
    

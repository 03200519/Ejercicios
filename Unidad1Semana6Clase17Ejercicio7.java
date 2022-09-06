
package unidad1semana6clase17ejercicio7;
import java.util.Scanner;
/**
 *
 * @author Edwin Alejandro
 */
public class Unidad1Semana6Clase17Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre,clave;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Ingrese Nombre de usuario:");
        nombre = Entrada.nextLine();
        System.out.print("Ingrese Clave de usuario:");
        clave = Entrada.nextLine();
        if(nombre.equals("Juan") && clave.equals("123456")){
        }
        else{
        System.out.print("Nombre de Usuario o contraseña Incorracto");
        }
        }
    }
    


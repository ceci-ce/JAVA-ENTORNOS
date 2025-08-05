package pajareria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase encargada de gestionar el catálogo de la pajarería.
 *
 * Esta clase sirve para registrar, buscar y gestionar pájaros en el catálogo: alta de pájaros,
 * búsqueda por especie y listado.
 *
 * @author Cecilia
 * @version 1.0
 */


public class GestionPajaros {
    private ArrayList<Pajaro> catalogo = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    /**
     * Da de alta un nuevo pájaro en el catálogo disponible.
     *
     * Solicita al usuario que introduzca los datos del pájaro (especie, color y precio) a través de la consola,
     * crea un objeto con esos datos y lo añade al catálogo de pájaros.
     *
     */

    public void altaPajaros(){
        System.out.println("Especie: ");
        String especie = scanner.nextLine();
        System.out.println("Color: ");
        String color = scanner.nextLine();
        System.out.println("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        catalogo.add(new Pajaro(especie, color, precio));
        System.out.println("Pájaro añadido al catálogo con éxito.");
    }

    /**
     * Función que busca un pajaro en el catálogo por su especie.
     * @param especie Especie del pájaro que se quiere buscar.
     * @return String que devuelve la especie del pájaro, si no existe devuelve null.
     */

    public Pajaro buscarPajaroPorEspecie(String especie){
        for(Pajaro p: catalogo){
            if(p.getEspecie().equalsIgnoreCase(especie)){
                return p;
            }
        }
        return null;
    }

    /**
     * Muestra por pantalla el catálogo de todos los pájaros registrados.
     * Para ello, recorre la lista de pájaros y llama al método (mostrarInfo()) de cada uno.
     */

    public void listadoPajaros(){
        for(Pajaro p: catalogo){
            p.mostrarInfo();
        }
    }
}

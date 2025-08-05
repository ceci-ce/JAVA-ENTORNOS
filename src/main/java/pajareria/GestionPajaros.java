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
}

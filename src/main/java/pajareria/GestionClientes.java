package pajareria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase encargada de gestionar los clientes de la pajarería.
 *
 * Esta clase sirve para registrar, buscar y gestionar clientes en el sistema: alta de clientes, baja, modificación,
 * búsqueda por DNI y listado.
 *
 * @author Cecilia
 * @version 1.0
 */

public class GestionClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
}

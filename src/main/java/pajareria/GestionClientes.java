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

    // Funcion dar de alta cliente

    public void altaCliente(){
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("DNI: ");
        String dni = scanner.nextLine();
        System.out.println("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();

        clientes.add(new Cliente(nombre, dni, telefono, email)); // Se crea un objeto cliente con los datos que el usuario ha escrito
        System.out.println("Cliente añadido con éxito.");
    }
}

package pajareria;

import java.sql.SQLOutput;
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

    /**
     * Este metodo solicita los datos del cliente por consola y añade un nuevo cliente a la lista.
     * Una vez recogidos los datos, crea un nuevo objeto Cliente y lo añade a la lista.
     *
     * @author Cecilia
     * @version 1.0
     */

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

    /**
     * Elimina a un cliente de la lista a partir de su DNI.
     *
     * Solicita al usuario el DNI del cliente a eliminar y busca al cliente en la lista mediante la función (buscarClientePorDNI)
     */

    public void bajaCliente(){
        System.out.println("Introduce el DNI del cliente a dar de baja: ");
        String dni = scanner.nextLine();
        Cliente c = buscarClientePorDNI(dni);
        if(c!=null){
            clientes.remove(c);
            System.out.println("Cliente" + c + " dado de baja con éxito.");
        }else{
            System.out.println("Cliente no encontrado.");
        }
    }

    /**
     * Función que busca un cliente en la lista por su DNI.
     * @param dni DNI del cliente que se quiere buscar.
     * @return String que devuelve el DNI del cliente, si no existe devuelve null.
     */

    public Cliente buscarClientePorDNI(String dni){
        for(Cliente c: clientes){
            if(c.getDni().equalsIgnoreCase(dni)){
                return c;
            }
        }
        return null;
    }

    /**
     * Función que modifica el nombre, teléfono y email de un cliente.
     * Pide el DNI por consola para buscar al cliente en la lista y actualiza sus datos con el setter.
     */

    public void modificarCliente(){
        System.out.println("Introduce el DNI del cliente a modificar: ");
        String dni = scanner.nextLine();
        Cliente c = buscarClientePorDNI(dni);
        if(c!= null){
            System.out.println("Nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();
            c.setNombre(nuevoNombre);
            System.out.println("Nuevo teléfono: ");
            String nuevoTelefono = scanner.nextLine();
            c.setTelefono(nuevoTelefono);
            System.out.println("Nuevo email: ");
            String nuevoEmail = scanner.nextLine();
            c.setEmail(nuevoEmail);
            System.out.println("Cliente actualizado ");
        }else{
            System.out.println("Cliente no encontrado.");
        }
    }

    /**
     * Muestra por pantalla el listado de todos los clientes registrados.
     * Para ello, recorre la lista de clientes y llama al método (mostrarInfo()) de cada uno.
     */

    public void listadoClientes(){
        for (Cliente c: clientes){
            c.mostrarInfo();
        }
    }
}

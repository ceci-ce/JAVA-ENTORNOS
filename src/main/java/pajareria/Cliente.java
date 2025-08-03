package pajareria;

/**
 * Representa a un cliente de la pajarería.
 *
 * Atributos: nombre, DNI, teléfono y correo electrónico.
 *
 * Esta clase sirve para registrar, buscar y gestionar clientes en el sistema.
 *
 * @author Cecilia
 * @version 1.0
 */

public class Cliente {
    private String nombre;
    private String dni;
    private String telefono;
    private String email;

    /**
     * Constructor de la clase cliente.
     * Crea un cliente con los datos proporcionados
     * @param nombre Nombre completo del cliente
     * @param dni Documento nacional de identidad
     * @param telefono Número de teléfono
     * @param email Correo electrónico
     */
    public Cliente(String nombre, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }
}

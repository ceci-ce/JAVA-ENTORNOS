package pajareria;

/**
 * Representa un pájaro disponible en la pajarería.
 *
 * Contiene información como especie, precio, y stock.
 *
 * @author Cecilia
 * @version 1.0
 */

public class Pajaro {
    private String especie;
    private String color;
    private double precio;

    /**
     * Constructor de la clase pajaro.
     * Crea un pajaro con los datos proporcionados
     * @param especie Tipo de especio del pajaro.
     * @param color Color del pajaro.
     * @param precio Precio del pajaro.
     */

    public Pajaro(String especie, String color, double precio) {
        this.especie = especie;
        this.color = color;
        this.precio = precio;
    }

    // Getters

    public String getEspecie() {
        return especie;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Muestra por pantalla la información básica del pájaro: especie, color y precio.
     */

    public void mostrarInfo(){
        System.out.println("\n Especie: " + this.especie + "\n color: " + this.color + "\n precio: " + this.precio);
    }

    @Override
    public String toString(){
        return "Pájaro{" +
                "especie='" + especie + '\'' +
                ", color='" + color + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}



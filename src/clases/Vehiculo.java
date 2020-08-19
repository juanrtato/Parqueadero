package clases;

/**
 * Clase que contiene la estructura y los datos del vehiculo
 *
 * @author Angel Gomez y Juan Albarracin
 * @version 1.0 (8-08-2020)
 */
public class Vehiculo {

    private String placa;
    private String tipo; //Puede ser CARRO,MOTO o BICICLETA
    private String marca;
    private String color;
    private String descripcion;

    /**
     * Constructor de objetos de la clase Vehiculo
     *
     * @param placa del vehiculo en formato String
     * @param marca del vehiculo en formato String
     * @param color del vehiculo en formato String
     * @param tipo del vehiculo en formato String
     * @param descripcion del vehiculo en formato String
     */
    public Vehiculo(String placa, String tipo, String marca, String color, String descripcion) {
        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el número de la placa del vehiculo
     *
     * @return placa del vehiculo en formato String
     */
    public String getPlaca() {

        return this.placa;
    }

    /**
     * Establece el número de la placa del vehiculo
     *
     * @param placa del vehiculo que ocupará la plaza en formato String
     */
    public void setPlaca(String placa) {

        this.placa = placa;
    }

    /**
     * Obtiene el tipo de vehiculo
     *
     * @return tipo del vehiculo en formato String
     */
    public String getTipo() {

        return tipo;
    }

    /**
     * Establece el tipo de vehiculo
     *
     * @param tipo del vehiculo que ocupará la plaza en formato String
     */
    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    /**
     * Obtiene la marca del vehiculo
     *
     * @return marca del vehículo ocupante en formato String
     */
    public String getMarca() {

        return this.marca;
    }

    /**
     * Establece la marca del vehiculo
     *
     * @param marca del vehículo que ocupara la plaza en formato String
     */
    public void setMarca(String marca) {

        this.marca = marca;
    }

    /**
     * Obtiene el color del vehiculo
     *
     * @return color del vehiculo ocupante en formato String
     */
    public String getColor() {

        return this.color;
    }

    /**
     * Establece el color del vehiculo
     *
     * @param color en formato String
     */
    public void setColor(String color) {

        this.color = color;
    }

    /**
     * Obtiene la descripción del vehiculo
     *
     * @return descripción del vehiculo ocupante en formato String
     */
    public String getDescripcion() {

        return this.descripcion;
    }

    /**
     * Establece la descripción del vehiculo
     *
     * @param descripcion en formato String
     */
    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }

    /**
     * Imprime los datos del vehiculo en formato texto
     *
     * @return cadena de texto con placa, tipo, marca, color y descripción del
     * vehiculo
     */
    @Override
    public String toString() {

        return "\nPlaca:" + this.placa + "\nMarca:" + this.marca + "\nColor:" + this.color;
    }
}

package clases;

import java.util.Date;

/**
 * Clase que contiene la estructura y los datos de la plaza o lugar de parqueo
 *
 * @author Angel Gomez y Juan Albarracin
 * @version 1.0 (8-08-2020)
 */
public class Plaza {

    private int numero;
    private boolean estado;//True libre, false ocupado
    private String sitioInteres;
    private Ticket ocupante;

    /**
     * Constructor de objectos de la clase Plaza para plazas sin definir
     * Atributos por defecto
     */
    public Plaza() {

        this.estado = false; //siempre empieza estando ocupado si no esta debidamente definida.
        this.sitioInteres = "por definir";
        this.ocupante = null;
    }

    /**
     * Constructor de objectos de la clase Plaza para plazas ya definidas
     *
     * @param numero de la plaza en formato int //@param estado de la plaza en
     * formato boolean
     * @param sitioInteres de la plaza en formato String //@param ocupante
     * actual de la plaza en formato String
     */
    public Plaza(int numero, String sitioInteres) {

        this.numero = numero;
        this.estado = true; //siempre empieza estando libre
        this.sitioInteres = sitioInteres;
        this.ocupante = null;
    }

    /**
     * Obtiene el numero de la plaza
     *
     * @return numero del lugar de parqueo en formato int
     */
    public int getNumero() {

        return this.numero;
    }

    /**
     * Establece el orden numerico de la plaza
     *
     * @param numero que se asignara a la plaza en formato int
     */
    public void setNumero(int numero) {

        this.numero = numero;
    }

    /**
     * Obtiene el estado actual de la plaza
     *
     * @return estado (True libre o False ocupada)
     */
    public boolean getEstado() {

        return this.estado;
    }

    /**
     * Establece el estado actual de la plaza. Es privado porque solo el metodo
     * asignar y desasignar ocupante puede acceder a el
     *
     * @param estado de la plaza en formato boolean (True libre, False ocupada)
     */
    private void setEstado(boolean estado) {

        this.estado = estado;
    }

    /**
     * Obtienes el sitio de interes mas cercano a la plaza
     *
     * @return sitio de interes en formato string
     */
    public String getSitioInteres() {

        return this.sitioInteres;
    }

    /**
     * Establece el sitio de interes mas cercano a la plaza
     *
     * @param sitioInteres en formato String
     */
    public void setSitioInteres(String sitioInteres) {

        this.sitioInteres = sitioInteres;
    }

    /**
     * Obtiene el ocupante de la plaza
     *
     * @return ocupante
     */
    public Ticket getOcupante() {

        return this.ocupante;
    }

    /**
     * Asigna un ocupante a la plaza
     *
     * @param ocupante de la plaza
     */
    public void asignarOcupante(Ticket ocupante) {

        this.ocupante = ocupante;
        this.setEstado(false);
    }

    /**
     * Desasigna un ocupante de la plaza
     */
    public void desasignarOcupante() {

        Date ahora = new Date();
        this.ocupante.setFechaSalida(ahora);
        this.ocupante = null;
        this.setEstado(true);

    }
}

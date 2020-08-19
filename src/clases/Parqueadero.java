package clases;

import java.util.ArrayList;

/**
 * Contiene la estructura de la clase Parqueadero.
 *
 * @author Angel Gomez y Juan Albarracin
 * @version 1.0 (8-08-2020)
 */
public class Parqueadero {

    private String mensajeGeneral;
    private boolean estadoGeneral;
    private ArrayList<Plaza> plazas;

    /**
     * Constructor de objetos de la clase Parqueadero
     */
    public Parqueadero() {
        this.estadoGeneral = false; //Por defecto siempre empazara¡ en este estado
        this.mensajeGeneral = "Sin mensajes...";
        plazas = new ArrayList<Plaza>();

        //Creación de las plazas para el parqueadero, serán 10 por sitio de interes
        int i;
        for (i = 1; i <= 15; i++) {
            plazas.add(new Plaza(i, "COMUNEROS"));
        }
        for (i = 16; i <= 30; i++) {
            plazas.add(new Plaza(i, "SAN FRANCISCO"));
        }
        for (i = 31; i <= 45; i++) {
            plazas.add(new Plaza(i, "DIAMANTE II"));
        }
        for (i = 46; i <= 60; i++) {
            plazas.add(new Plaza(i, "PIEDECUESTA"));
        }
        for (i = 61; i <= 75; i++) {
            plazas.add(new Plaza(i, "CABECERA"));
        }
        for (i = 76; i <= 90; i++) {
            plazas.add(new Plaza(i, "REAL DE MINAS"));
        }
    }

    /**
     * Obtiene el estado general del parqueadero.
     *
     * @return True si esta disponible o False si no disponible.
     */
    public String getEstadoGeneral() {
        if (this.estadoGeneral == true) {
            return "Disponible";
        } else {
            return "No disponible";
        }
    }

    /**
     * Establece el estado general del parqueadero, True para disponible y False
     * para no disponible.
     */
    public void setEstadoGeneral() {
        if (this.estadoGeneral == true) {
            this.estadoGeneral = false;
        } else {
            this.estadoGeneral = true;
        }
    }

    /**
     * Obtiene el mensaje general del parqueadero.
     *
     * @return mensajeGeneral que es el mensaje general.
     */
    public String getMensajeGeneral() {
        return this.mensajeGeneral;
    }

    /**
     * Establece el estado general del parqueadero, True para disponible y False
     * @param mensaje que es el mensaje que se quiere establecer como general.
     */
    public void setMensajeGeneral(String mensaje) {
        this.mensajeGeneral = mensaje;
    }

    /**
     * Obtiene el numero total de plazas
     *
     * @return numero total de plazas en formato ArrayList de Plazas
     */
    public ArrayList<Plaza> getPlazas() {
        return this.plazas;
    }

    /**
     * Obtenemos el numero de las plazas que estan libres
     *
     * @return numero de plazas libres en formato int
     */
    public ArrayList<Plaza> getPlazasLibres() {
        ArrayList<Plaza> libres = new ArrayList<Plaza>();
        for (Plaza plaza : plazas) {
            if (plaza.getEstado() == true) {
                libres.add(plaza);
            }
        }
        return libres;
    }

    /**
     * Obtenemos el numero de las plazas que estan ocupadas
     *
     * @return numero de plazas ocupadas en formato int
     */
    public ArrayList<Plaza> getPlazasOcupadas() {
        ArrayList<Plaza> ocupadas = new ArrayList<Plaza>();
        for (Plaza plaza : plazas) {
            if (plaza.getEstado() == false) {
                ocupadas.add(plaza);
            }
        }
        return ocupadas;
    }
}

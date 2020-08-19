package clases;

import java.util.Date;

/**
 * Clase que contiene la estructura y los datos del ticket.
 *
 * @author Angel Gomez y Juan Albarracin
 * @version 1.0 (8-08-2020)
 */
public class Ticket {

    private static double valorPorMinutoCarros = 110; //Pesos colombianos
    private static double valorPorMinutoMotos = 77; //Pesos colombianos

    private int id;
    private String fechaEntrada;
    private String fechaSalida;
    private Vehiculo vehiculo;
    private double precio; //Siempre inicia su valor en 0, cuando se genere la fecha de salida se puede calcular

    /**
     * Constructor de objetos de la clase Ticket para usar dentro de la App.
     *
     * @param id es el identificador numérico del ticket.
     * @param vehiculo es el vehiuculo al cual se le adjudica el ticket.
     */
    public Ticket(int id, Vehiculo vehiculo) {
        this.id = id;

        Date ahora = new Date(); //Tomamos la fecha del momento en que se crea el objeto.
        this.fechaEntrada = Integer.toString(ahora.getHours()) + ":" + Integer.toString(ahora.getMinutes()) + ":" + Integer.toString(ahora.getSeconds()) + "  " + Integer.toString(ahora.getDate()) + "/" + Integer.toString(ahora.getMonth() + 1) + "/" + Integer.toString(ahora.getYear() + 1900);

        this.fechaSalida = "NO HA SALIDO DEL PARQUEADERO";
        this.vehiculo = vehiculo;
        this.precio = 0;
    }

    /**
     * Constructor de objetos de la clase Ticket para persistencia de datos
     * (Datos pertinentes de la BD).
     *
     * @param id es el identificador numérico del ticket.
     * @param vehiculo es el vehiuculo al cual se le adjudica el ticket
     * @param fechaEntrada es la fecha de entrada del vehículo en formato String
     */
    public Ticket(int id, Vehiculo vehiculo, String fechaEntrada) {
        this.id = id;

        Date ahora = new Date(); //Tomamos la fecha del momento en que se crea el objeto.
        this.fechaEntrada = fechaEntrada;

        this.fechaSalida = "NO HA SALIDO DEL PARQUEADERO";
        this.vehiculo = vehiculo;
        this.precio = 0;
    }

    /**
     * Obtiene el valor de costo por minuto para carros.
     *
     * @return valorPorMinutoCarros en formato double.
     */
    public static double getValorPorMinutoCarros() {
        return valorPorMinutoCarros;
    }

    /**
     * Establece el valor de costo por minuto para carros.
     *
     * @param valorPorMinutoCarros es un número double que será el el nuevo
     * valor por minuto para carros
     */
    public static void setValorPorMinutoCarros(double valorPorMinutoCarros) {
        Ticket.valorPorMinutoCarros = valorPorMinutoCarros;
    }

    /**
     * Obtiene el valor de costo por minuto para motos.
     *
     * @return valorPorMinutoCarros en formato double.
     */
    public static double getValorPorMinutoMotos() {
        return valorPorMinutoMotos;
    }

    /**
     * Establece el valor de costo por minuto para carros.
     *
     * @param valorPorMinutoMotos es un número double que será el el nuevo valor
     * por minuto para motos
     */
    public static void setValorPorMinutoMotos(double valorPorMinutoMotos) {
        Ticket.valorPorMinutoMotos = valorPorMinutoMotos;
    }

    /**
     * Obtiene el ID del ticket (transaccion).
     *
     * @return id asignado al ticket en formato int.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Establece el ID del ticket (transacción).
     *
     * @param id es un número entero que será el identificador de cada ticket
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la fecha y hora de entrada.
     *
     * @return fecha y hora en formato Date.
     */
    public String getFechaEntrada() {
        return this.fechaEntrada;
    }

    /**
     * Establece la fecha y hora de entada. Este método es para usar dentro de
     * la App
     *
     * @param fecha en formato Date.
     */
    public void setFechaEntrada(Date fecha) {
        String fechaFormato = Integer.toString(fecha.getHours()) + ":" + Integer.toString(fecha.getMinutes()) + ":" + Integer.toString(fecha.getSeconds()) + "  " + Integer.toString(fecha.getDate()) + "/" + Integer.toString(fecha.getMonth() + 1) + "/" + Integer.toString(fecha.getYear() + 1900);
        this.fechaEntrada = fechaFormato;
    }

    /**
     * Establece la fecha y hora de entada. Este método es para usar con la BD
     *
     * @param fecha en formato String.
     */
    public void setFechaEntrada(String fecha) {
        this.fechaEntrada = fecha;
    }

    /**
     * Obtiene la fecha y hora de salida.
     *
     * @return fecha y hora en formato Date.
     */
    public String getFechaSalida() {
        return this.fechaSalida;
    }

    /**
     * Establece la fecha y hora de salida. Este método es para usar dentro de
     * la App
     *
     * @param fecha en formato Date.
     */
    public void setFechaSalida(Date fecha) {
        String fechaFormato = Integer.toString(fecha.getHours()) + ":" + Integer.toString(fecha.getMinutes()) + ":" + Integer.toString(fecha.getSeconds()) + "  " + Integer.toString(fecha.getDate()) + "/" + Integer.toString(fecha.getMonth() + 1) + "/" + Integer.toString(fecha.getYear() + 1900);
        this.fechaSalida = fechaFormato;
        this.setPrecio(); //Cada vez que se genere la fecha de salida se le asignará el valor a pagar al atributo respectivo
    }

    /**
     * Establece la fecha y hora de salida. Este método es para usar con la BD
     *
     * @param fecha en formato String.
     */
    public void setFechaSalida(String fecha) {
        this.fechaSalida = fecha;
        this.setPrecio(); //Cada vez que se genere la fecha de salida se le asignará el valor a pagar al atributo respectivo
    }

    /**
     * Obtiene los datos del vehiculo.
     *
     * @return vehículo ocupante.
     */
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    /**
     * Obtiene el precio a pagar por el ticket.
     *
     * @return precio a pagar por el ticket.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece la precio a pagar por el ocupante del ticket, depende de la
     * fecha de entrada y de salida del ocupante de la plaza.
     */
    public void setPrecio() {
        double precio = 0;
        if (!(this.fechaSalida.equals("NO HA SALIDO DEL PARQUEADERO"))) { //Se verifica que el vehiculo ya haya salido del parqueadero
            if (this.vehiculo.getTipo().equals("CARRO")) { //Se establece el tipo de vehiculo que se encontraba en él para establecer el valor a cobrar
                precio = Ticket.valorPorMinutoCarros;
            } else {
                precio = Ticket.valorPorMinutoMotos;
            }
            double minutosEntrada = convertirFechaAMinutos(this.fechaEntrada);
            double minutosSalida = convertirFechaAMinutos(this.fechaSalida);
            this.precio = (minutosSalida - minutosEntrada) * precio;
        }
    }

    /**
     * Convierte la fecha almacenada (ya sea de entrada o de salida) a minutos
     * en formato double para poder determinar el tiempo que tardó el ocupante
     * en la plaza
     *
     * @param fecha en formato String.
     */
    private double convertirFechaAMinutos(String fecha) { //Halla los minutos contenidos en una fecha
        double valores[] = new double[6];
        int a;
        for (int i = 0; i < 2; i++) {
            a = fecha.indexOf(":");
            valores[i] = Double.parseDouble(fecha.substring(0, a));
            fecha = fecha.substring(a + 1);
        }
        a = fecha.indexOf(" ");
        valores[2] = Double.parseDouble(fecha.substring(0, a));
        fecha = fecha.substring(a + 1);
        for (int i = 3; i < 5; i++) {
            a = fecha.indexOf("/");
            valores[i] = Double.parseDouble(fecha.substring(0, a));
            fecha = fecha.substring(a + 1);
        }
        valores[5] = Double.parseDouble(fecha);
        return (valores[0] * 60) + valores[1] + (valores[3] * 1440) + (valores[4] * 43200) + (valores[5] * 518400);
    }
}

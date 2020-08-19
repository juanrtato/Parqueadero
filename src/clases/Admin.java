package clases;

/**
 * Clase que contiene la información del administrador que ingresa al sistema.
 *
 * @author Angel Gomez y Juan Albarracin
 * @version 1.0 (8-08-2020)
 */
public class Admin {

    private int ccAdmin;
    private String usuario;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String cargo;

    /**
     * Constructor de objetos de la clase Admin para establecer un admin por
     * defecto
     *
     * Sin parametros
     
    public Admin() {
        this.usuario = "por definir";
    }
    */
    /**
     * Constructor de objetos de la clase Admin
     *
     * @param ccAdmin es el identificador numérico del Admin
     * @param usuario es el usuario al cual se le adjudica el Admin loggeado en
     * la BD
     * @param primerNombre es el primer nombre del administrador
     * @param segundoNombre es el segundo nombre del administrador
     * @param primerApellido es el primer apellido del administrador
     * @param segundoApellido es el segundo apellido del administrador
     * @param cargo es la sede que tiene a cargo el administrador loggeado
     */
    public Admin(int ccAdmin, String usuario, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String cargo) {

        this.ccAdmin = ccAdmin;
        this.usuario = usuario;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cargo = cargo;
    }

    /**
     * Obtiene la CC del Administrador
     *
     * @return cc asignado al administrador en formato int.
     */
    public int getCcAdmin() {
        return ccAdmin;
    }

    /**
     * Establece la CC del Administrador
     *
     * @param ccAdmin es un número entero que será el identificador del administrador
     */
    public void setCcAdmin(int ccAdmin) {
        this.ccAdmin = ccAdmin;
    }

    /**
     * Obtiene el user del Administrador con el que se le reconoce en la BD
     *
     * @return usuario asignado al administrador en formato String.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece un User del Administrador
     *
     * @param usuario es un String que será el identificador del administrador
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene el primer nombre del Administrador
     *
     * @return primerNombre del administrador en formato String.
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Establece el primer nombre del Administrador
     *
     * @param primerNombre es un String que será el primer nombre del administrador
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * Obtiene el segundo nombre del Administrador
     *
     * @return segundoNombre del administrador en formato String.
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Establece el segundo nombre del Administrador
     *
     * @param segundoNombre es un String que será el segundo nombre del administrador
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * Obtiene el primer apellido del Administrador
     *
     * @return primerApellido del administrador en formato String.
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Establece el primer apellido del Administrador
     *
     * @param primerApellido es un String que será el primer apellido del administrador
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

     /**
     * Obtiene el segundo apellido del Administrador
     *
     * @return segundoApellido del administrador en formato String.
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Establece el segundo apellido del Administrador
     *
     * @param segundoApellido es un String que será el segundo apellido del administrador
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * Obtiene el parqueadero a cargo que tiene el administrador
     * Este lo podemos modificar a futuro para que sea un vector de Parqueadero y colocar todos los parqueaderos que tiene a cargo
     * aunque debemos tener en cuenta que si dice ADMIN GENERAL tendrá acceso a todos los parqueaderos
     * @return cargo , es el parqueadero a cargo del administrador en formato String.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el parqueadero a cargo del administrador
     *
     * @param cargo es un String que será el nombre del parqueadero a cargo del administrador
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

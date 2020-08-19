package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Clase necesaria para establecer la conexión entre el programa y la BD
 *
 * @author Angel Gomez y Juan Albarracin
 * @version 1.0 (8-08-2020)
 */
public class Conectar {

    //Objeto de la misma clase con la que se realizara la conexión a la BD
    private Connection conn;

    //Valores constantes para establecer la conexión (puede variar de acuerdo con cada gestor de BD)
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/parqueaderodb";

    /**
     * Establece la conexión entre el programa y la BD al inicializar el
     * atributo Conectar con los demas atributos constantes establecidos
     */
    public Conectar() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conexion Establecida");
            }
        } catch (Exception e) {
            System.out.println("Error al conectar" + e);
        }

    }

    /**
     * Retorna el estado actual de la conexión con la BD
     *
     * @return conn que es el atributo de la clase relacionada con la conexión a
     * la BD
     */
    public Connection getConnection() {
        return conn;
    }

    /**
     * Desconecta el programa con la BD
     */
    public void desconectar() {
        conn = null;
        if (conn == null) {
            System.out.println("Conexion Terminada");
        }
    }
}

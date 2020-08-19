package clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.VentanaRegistros;

/**
 * CLASE PARA LA PERSISTECIA DE LOS OBJETOS: establece algunos objetos
 * pertinentes ubicados en la BD relacionados con los ocupantes dentro del
 * parqueadero, estos se crean cada vez que se ejecute el programa
 *
 * @author Angel Gomez y Juan Albarracin
 * @version 1.0 (8-08-2020)
 */
public class Fabrica {

    /**
     * Crea los objetos de los vehiculos que siguen dentro del parqueadero según
     * la BD, y los asigna a Parqueadero.
     *
     * @param parqueadero es el parqueadero al que se le asigna los ocupantes
     * registrados en la base de datos
     */
    public Fabrica(Parqueadero parqueadero) {
        Conectar conexion = new Conectar();
        Connection reg = conexion.getConnection();

        String sql = "SELECT * FROM ocupante WHERE fecha_salida='NO HA SALIDO DEL PARQUEADERO'";
        String datos[] = new String[9];
        Statement st;
        try {
            st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);//idTicket
                datos[1] = rs.getString(2);//Placa
                datos[2] = rs.getString(3);//Tipo de vehiculo
                datos[3] = rs.getString(4);//Num de plaza ocupada
                datos[4] = rs.getString(5);//Color de vehiculo
                datos[5] = rs.getString(6);//Marca de vehículo
                datos[6] = rs.getString(7);//Descripción de vehículo
                datos[7] = rs.getString(8);//Fecha de Ingreso

                parqueadero.getPlazas().get(Integer.parseInt(datos[3]) - 1).asignarOcupante(new Ticket(Integer.parseInt(datos[0]), new Vehiculo(datos[1], datos[2], datos[5], datos[4], datos[6]), datos[7]));
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentanaRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexion.desconectar();
    }
}

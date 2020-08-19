package ventanas;
import clases.Parqueadero;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.WindowConstants;

/**
 *
 * @author Juan Ricardo
 */
public class VentanaPlazas extends javax.swing.JFrame {

    //Objetos
    protected Parqueadero parqueadero;
    protected InterfazPrincipal interfaz; //Está será la interfaz principal que llama a esta ventana, la uso para cambiar la ventana de disponibilidad
    
    public VentanaPlazas(Parqueadero parqueadero, InterfazPrincipal interfaz) {
        this.parqueadero=parqueadero;
        this.interfaz=interfaz;
    }
    public void actualizarVentana(){
        //La dejo sin nada para poder sobreescribirla en las clases hijas
    }
    
    //la uso para obtener el contador de registros en la base de datos para el id de los tickets.
    public InterfazPrincipal getInterfaz(){
        return this.interfaz;
    }
    public Parqueadero getParqueadero(){
        return this.parqueadero;
    }
    private javax.swing.JButton actualizar;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
}
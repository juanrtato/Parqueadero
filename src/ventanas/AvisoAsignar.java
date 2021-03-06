/**
 * FUNCIONALIDAD:YA ESTÁ TERMINADA
 * APARIENCIA:SIN TERMINAR
 */
package ventanas;

import clases.Vehiculo;
import clases.Plaza;
import clases.Conectar;
import clases.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author angel y juan
 */
public class AvisoAsignar extends javax.swing.JFrame {

    private Plaza plaza;
    private VentanaPlazas ventanaPlazas; //Está será la interfaz principal que llama a esta ventana, la uso para cambiar la ventana de disponibilidad
    private VentanaDisponible ventanaDisponible;
    private VentanaOcupado ventanaOcupado;
    
    private String placa;
    private String marca;
    private String color;
    private String descripcion;
    private String tipo;
            
                    
    /**
     * Creates new form avisoEstadoGeneral
     * @param parqueadero
     */
    public AvisoAsignar(Plaza plaza, VentanaPlazas ventanaPlazas, VentanaDisponible ventanaDisponible, String placa, String marca, String color, String descripcion, String tipo) {
        this.plaza=plaza;
        this.ventanaPlazas=ventanaPlazas;
        this.ventanaDisponible=ventanaDisponible;
        this.ventanaOcupado=null;
        this.placa=placa;
        this.marca=marca;
        this.color=color;
        this.descripcion=descripcion;
        this.tipo=tipo;
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Está a punto de asignar la plaza.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Está seguro de realizar el cambio?");

        jButton1.setText("Sí");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("No");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {                                         
            //Asignacion en la base de datos            
            Conectar conexion = new Conectar();
            Connection reg = conexion.getConnection();
            Statement stat = reg.createStatement();
            //Consulto el numero de registros actuales en la bd para establecer el proximo id
            String consulta = "SELECT count(*) FROM ocupante";
            ResultSet rs = stat.executeQuery(consulta);
            rs.first(); //Mueve el cursos a la primera linea de la consulta (No sé pa que pero toca)
            
            
            this.plaza.asignarOcupante(new Ticket(Integer.parseInt(rs.getString(1)), new Vehiculo(placa, tipo, marca,color,descripcion)));
            
            String numPlaza = Integer.toString(this.plaza.getNumero());
            String fecha = this.plaza.getOcupante().getFechaEntrada();
            String id = rs.getString(1);
            
            String sql = "INSERT INTO ocupante(id_ocup, placa_ocup, tipo_ocup, num_plaza_ocup, color_ocup, marca_ocup, descrip_ocu, fecha_ingreso) VALUES (?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement psd = reg.prepareStatement(sql);
                psd.setString(1, id);
                psd.setString(2, placa);
                psd.setString(3, tipo);
                psd.setString(4, numPlaza);
                psd.setString(5, color);
                psd.setString(6, marca);
                psd.setString(7, descripcion);
                psd.setString(8, fecha);
                
                
                int n = psd.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Registro guardado con éxito en la base de datos");
                    this.ventanaOcupado=new VentanaOcupado(this.ventanaPlazas);
                    this.ventanaOcupado.actualizarVentana(this.plaza);
                    this.ventanaOcupado.setVisible(true);
                    this.ventanaDisponible.setVisible(false);
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Error de conexión, no se ha asignado la plaza");
                    this.plaza.desasignarOcupante();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(VentanaDisponible.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error de conexión, no se ha asignado la plaza");
                this.plaza.desasignarOcupante();
                this.setVisible(false);
            }
            
            conexion.desconectar();
            //Cambio de ventana
            this.setVisible(false);
            
        } catch (SQLException ex) {
            Logger.getLogger(AvisoAsignar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

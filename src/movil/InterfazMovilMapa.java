/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movil;

import java.awt.Color;
import clases.Parqueadero;
import ventanas.InterfazPrincipal;

/**
 *
 * @author angel
 */
public class InterfazMovilMapa extends javax.swing.JFrame {

    protected InterfazMovil interfazMovil; 
    /**
     * Creates new form Interfaz
     */
    public InterfazMovilMapa(InterfazMovil interfazMovil) {
        
        this.interfazMovil=interfazMovil;
        
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

        jLabelConsultarRuta1 = new javax.swing.JLabel();
        jComboBoxRutas = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelConsultarRuta1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabelConsultarRuta1.setText("Consultar Ruta:");
        getContentPane().add(jLabelConsultarRuta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jComboBoxRutas.setBackground(new java.awt.Color(51, 153, 0));
        jComboBoxRutas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luis A. Calvo (1-15)", "Administración (16-30)", "Bienestar Universitario (31-45)", "Jardín de las Orquídeas (46-60)", "Escuela de Música (61-75)", "Laboratorios Livianos (76-90)" }));
        jComboBoxRutas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxRutasItemStateChanged(evt);
            }
        });
        jComboBoxRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRutasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 270, 30));

        jButtonBuscar.setBackground(new java.awt.Color(51, 153, 0));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 80, 30));

        jButtonSalir.setBackground(new java.awt.Color(51, 153, 0));
        jButtonSalir.setText("Volver");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_movil/mapaBienestarUniversitario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_movil/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxRutasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxRutasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRutasItemStateChanged

    private void jComboBoxRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRutasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRutasActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        this.actualizarVentana();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.interfazMovil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    public void actualizarVentana(){
        //this.jComboBoxRutas.setSelectedIndex(interfazMovil.getJComboBoxRutas().getSelectedIndex());
        int eleccion=this.jComboBoxRutas.getSelectedIndex();
        javax.swing.ImageIcon imagen;
        switch(eleccion){
            case 0:
                imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes_movil/mapaLuisACalvo.png"));
                this.jLabel1.setIcon(imagen);
                break;
            case 1:
                imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes_movil/mapaAdministracion.png"));
                this.jLabel1.setIcon(imagen);
                break;
            case 2:
                imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes_movil/mapaBienestarUniversitario.png"));
                this.jLabel1.setIcon(imagen);
                break;
            case 3:
                imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes_movil/mapaJardinOrquideas.png"));
                this.jLabel1.setIcon(imagen);
                break;
            case 4:
                imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes_movil/mapaEscuelaMusica.png"));
                this.jLabel1.setIcon(imagen);
                break;
            case 5:
                imagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes_movil/mapaLaboratoriosLivianos.png"));
                this.jLabel1.setIcon(imagen);
                break;
        }
    }
    
    public void setJComboBox(javax.swing.JComboBox jComboBox){
        this.jComboBoxRutas.setSelectedIndex(jComboBox.getSelectedIndex());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxRutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConsultarRuta1;
    // End of variables declaration//GEN-END:variables
}

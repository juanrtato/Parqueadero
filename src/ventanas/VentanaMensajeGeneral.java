package ventanas;

/**
 *
 * @author Juan Ricardo
 */    
public class VentanaMensajeGeneral extends javax.swing.JFrame {
    
    private InterfazPrincipal interfaz;
    /**
     * Creates new form VentanaDisponible
     */
    
    public VentanaMensajeGeneral(InterfazPrincipal interfaz) {
        
        this.interfaz=interfaz;
        
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cajaDesc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(255, 153, 0));
        jToggleButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_left_opt.png"))); // NOI18N
        jToggleButton1.setText("Volver");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 110, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel5.setText("todos los usuarios de la App movil puedan ver.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 204, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 520, 20));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel7.setText("Notificación para Moviles");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 380, -1));

        cajaDesc.setToolTipText("");
        cajaDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cajaDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDescActionPerformed(evt);
            }
        });
        getContentPane().add(cajaDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 440, 50));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setText("Mensaje nuevo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jToggleButton2.setBackground(new java.awt.Color(255, 153, 0));
        jToggleButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jToggleButton2.setText("Enviar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 90, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel11.setText("En el recuadro inferior podrá digitar un mensaje que quiera que ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jTextArea1.setColumns(1);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setText(this.interfaz.getParqueadero().getMensajeGeneral());
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 450, 80));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setText("Mensaje actual:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gradient-highlight-linear-white-green-1920x1080-c2-66cdaa-ffffff-l-67-a-345-f-21.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        interfaz.actualizarInterfaz();
        interfaz.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void cajaDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDescActionPerformed
        // TODO add your handling code here
        
    }//GEN-LAST:event_cajaDescActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        this.interfaz.getParqueadero().setMensajeGeneral(this.cajaDesc.getText());
        this.interfaz.getInterfazMovil().actualizarVentana();
        this.actualizarVentana();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    //Como quiero usar esta ventana de forma general, le iré cambiando la plaza dinámicamente al mismo objeto
    public void actualizarVentana(){
        this.jTextArea1.setText(this.interfaz.getParqueadero().getMensajeGeneral());
        this.cajaDesc.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajaDesc;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}

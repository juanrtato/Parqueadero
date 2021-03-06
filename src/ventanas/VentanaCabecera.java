/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import clases.Parqueadero;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.WindowConstants;

/**
 *
 * @author Juan Ricardo
 */
public class VentanaCabecera extends VentanaPlazas {
    
    //Ventanas
    protected VentanaDisponible ventanaDisponible;
    protected VentanaOcupado ventanaOcupado;
    
    public VentanaCabecera(Parqueadero parqueadero, InterfazPrincipal interfaz) {
        super(parqueadero,interfaz);
        initComponents();
        
        this.ventanaDisponible=new VentanaDisponible(this);
        this.ventanaDisponible.setLocationRelativeTo(null);
                
        this.ventanaOcupado=new VentanaOcupado(this);
        this.ventanaOcupado.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton0.setBackground(new java.awt.Color(255, 204, 0));
        jButton0.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jButton0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_left_opt.png"))); // NOI18N
        jButton0.setText("Regresar");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 120, 40));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel1.setText("PARQUEADERO: CABECERA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, 20));

        jButton1.setBackground((parqueadero.getPlazas().get(0).getEstado()==true)? Color.green : Color.red);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText(Integer.toString(parqueadero.getPlazas().get(0).getNumero()));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 50, 40));

        jButton2.setBackground((parqueadero.getPlazas().get(1).getEstado()==true)? Color.green : Color.red);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText(Integer.toString(parqueadero.getPlazas().get(1).getNumero()));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 50, 40));

        jButton3.setBackground((parqueadero.getPlazas().get(2).getEstado()==true)? Color.green : Color.red);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText(Integer.toString(parqueadero.getPlazas().get(2).getNumero()));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 50, 40));

        jButton4.setBackground((parqueadero.getPlazas().get(3).getEstado()==true)? Color.green : Color.red);
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText(Integer.toString(parqueadero.getPlazas().get(3).getNumero()));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 50, 40));

        jButton5.setBackground((parqueadero.getPlazas().get(4).getEstado()==true)? Color.green : Color.red);
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText(Integer.toString(parqueadero.getPlazas().get(4).getNumero()));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 50, 40));

        jButton6.setBackground((parqueadero.getPlazas().get(5).getEstado()==true)? Color.green : Color.red);
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText(Integer.toString(parqueadero.getPlazas().get(5).getNumero()));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 50, 40));

        jButton7.setBackground((parqueadero.getPlazas().get(6).getEstado()==true)? Color.green : Color.red);
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText(Integer.toString(parqueadero.getPlazas().get(6).getNumero()));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 50, 40));

        jButton8.setBackground((parqueadero.getPlazas().get(7).getEstado()==true)? Color.green : Color.red);
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText(Integer.toString(parqueadero.getPlazas().get(7).getNumero()));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 50, 40));

        jButton9.setBackground((parqueadero.getPlazas().get(8).getEstado()==true)? Color.green : Color.red);
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText(Integer.toString(parqueadero.getPlazas().get(8).getNumero()));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 50, 40));

        jButton10.setBackground((parqueadero.getPlazas().get(9).getEstado()==true)? Color.green : Color.red);
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText(Integer.toString(parqueadero.getPlazas().get(9).getNumero()));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 50, 40));

        jButton11.setBackground((parqueadero.getPlazas().get(10).getEstado()==true)? Color.green : Color.red);
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText(Integer.toString(parqueadero.getPlazas().get(10).getNumero()));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 50, 40));

        jButton12.setBackground((parqueadero.getPlazas().get(11).getEstado()==true)? Color.green : Color.red);
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText(Integer.toString(parqueadero.getPlazas().get(11).getNumero()));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 50, 40));

        jButton13.setBackground((parqueadero.getPlazas().get(12).getEstado()==true)? Color.green : Color.red);
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setText(Integer.toString(parqueadero.getPlazas().get(12).getNumero()));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 50, 40));

        jButton14.setBackground((parqueadero.getPlazas().get(13).getEstado()==true)? Color.green : Color.red);
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setText(Integer.toString(parqueadero.getPlazas().get(13).getNumero()));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 50, 40));

        jButton15.setBackground((parqueadero.getPlazas().get(14).getEstado()==true)? Color.green : Color.red);
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setText(Integer.toString(parqueadero.getPlazas().get(14).getNumero()));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 50, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/parking-lot-wallpaper-4.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
       interfaz.actualizarInterfaz();
       interfaz.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(parqueadero.getPlazas().get(61).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(61));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(61));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(parqueadero.getPlazas().get(60).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(60));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(60));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(parqueadero.getPlazas().get(62).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(62));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(62));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(63).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(63));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(63));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(64).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(64));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(64));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(65).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(65));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(65));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(66).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(66));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(66));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(67).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(67));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(67));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(68).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(68));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(68));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(69).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(69));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(69));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(70).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(70));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(70));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(71).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(71));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(71));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(72).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(72));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(72));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(73).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(73));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(73));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if(parqueadero.getPlazas().get(74).getEstado()==true){
            ventanaDisponible.actualizarVentana(parqueadero.getPlazas().get(74));
            ventanaDisponible.setVisible(true);
            this.setVisible(false);      
        }
        else{
            ventanaOcupado.actualizarVentana(parqueadero.getPlazas().get(74));
            ventanaOcupado.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton15ActionPerformed
    
    @Override
    public void actualizarVentana(){
        jButton1.setBackground((parqueadero.getPlazas().get(60).getEstado()==true)? Color.green : Color.red);
        jButton1.setText(Integer.toString(parqueadero.getPlazas().get(60).getNumero()));
        
        jButton2.setBackground((parqueadero.getPlazas().get(61).getEstado()==true)? Color.green : Color.red);
        jButton2.setText(Integer.toString(parqueadero.getPlazas().get(61).getNumero()));
        
        jButton3.setBackground((parqueadero.getPlazas().get(62).getEstado()==true)? Color.green : Color.red);
        jButton3.setText(Integer.toString(parqueadero.getPlazas().get(62).getNumero()));
        
        jButton4.setBackground((parqueadero.getPlazas().get(63).getEstado()==true)? Color.green : Color.red);
        jButton4.setText(Integer.toString(parqueadero.getPlazas().get(63).getNumero()));
        
        jButton5.setBackground((parqueadero.getPlazas().get(64).getEstado()==true)? Color.green : Color.red);
        jButton5.setText(Integer.toString(parqueadero.getPlazas().get(64).getNumero()));
        
        jButton6.setBackground((parqueadero.getPlazas().get(65).getEstado()==true)? Color.green : Color.red);
        jButton6.setText(Integer.toString(parqueadero.getPlazas().get(65).getNumero()));
        
        jButton7.setBackground((parqueadero.getPlazas().get(66).getEstado()==true)? Color.green : Color.red);
        jButton7.setText(Integer.toString(parqueadero.getPlazas().get(66).getNumero()));
        
        jButton8.setBackground((parqueadero.getPlazas().get(67).getEstado()==true)? Color.green : Color.red);
        jButton8.setText(Integer.toString(parqueadero.getPlazas().get(67).getNumero()));
        
        jButton9.setBackground((parqueadero.getPlazas().get(68).getEstado()==true)? Color.green : Color.red);
        jButton9.setText(Integer.toString(parqueadero.getPlazas().get(68).getNumero()));
        
        jButton10.setBackground((parqueadero.getPlazas().get(69).getEstado()==true)? Color.green : Color.red);
        jButton10.setText(Integer.toString(parqueadero.getPlazas().get(69).getNumero()));
        
        jButton11.setBackground((parqueadero.getPlazas().get(70).getEstado()==true)? Color.green : Color.red);
        jButton11.setText(Integer.toString(parqueadero.getPlazas().get(70).getNumero()));
        
        jButton12.setBackground((parqueadero.getPlazas().get(71).getEstado()==true)? Color.green : Color.red);
        jButton12.setText(Integer.toString(parqueadero.getPlazas().get(71).getNumero()));
        
        jButton13.setBackground((parqueadero.getPlazas().get(72).getEstado()==true)? Color.green : Color.red);
        jButton13.setText(Integer.toString(parqueadero.getPlazas().get(72).getNumero()));
        
        jButton14.setBackground((parqueadero.getPlazas().get(73).getEstado()==true)? Color.green : Color.red);
        jButton14.setText(Integer.toString(parqueadero.getPlazas().get(73).getNumero()));
        
        jButton15.setBackground((parqueadero.getPlazas().get(74).getEstado()==true)? Color.green : Color.red);
        jButton15.setText(Integer.toString(parqueadero.getPlazas().get(74).getNumero()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}

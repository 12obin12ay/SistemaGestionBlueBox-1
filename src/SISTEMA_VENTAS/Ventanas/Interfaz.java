/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SISTEMA_VENTAS.Ventanas;

import SISTEMA_VENTAS.Usuarios;
import javax.swing.JOptionPane;
import sun.security.util.Password;
import SISTEMA_VENTAS.Software;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;

import SISTEMA_VENTAS.Software;



//Chanchito feliz;



/**
 *
 * @author lgust
 */
public class Interfaz extends javax.swing.JFrame {

  
    public Interfaz() {
        initComponents();
        
        //Esto sirve para centrar la pantalla inicial;
        this.setLocationRelativeTo(null);
        
        
       
        
            
    }

    public void close()
    {
            
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        
        
    }
    
    
   
    
    
    
          
    
    
    
    
    
    
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcono = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        JlabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SISTEMA_VENTAS/Imagenes/User.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 250, 320));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        txtUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 230, 30));

        txtpassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 230, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 110, 30));

        JlabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SISTEMA_VENTAS/Imagenes/Almacen Foto.jpg"))); // NOI18N
        getContentPane().add(JlabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 662, 566));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //VALIDACION PARA EL BOTON SALIR;
       int res = JOptionPane.showConfirmDialog(Interfaz.this, "¿Estas seguro que deseas salir ?", "Mensaje Confirmación", JOptionPane.YES_NO_OPTION);
            if ( res == 0 ) { //Si es si manda 
                // dispose method issues the WINDOW_CLOSED event
                Interfaz.this.dispose();
            }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Declarando variables
        
        String userValue = txtUser.getText();        //get user entered username from the textField1  
        String passValue = txtpassword.getText();        //get user entered pasword from the textField2  
     
        
        //Login para cajero
        if (userValue.equals("cajero") && passValue.equals("123")) 
        {
            Software x = new Software();
            
            //Desabilitando los textbox correspondientes
            x.DisableTextBoxes();
            
            
     
            x.setVisible(true);
            
            
            
            
          close();
        }
        
        
        
        //Login para administrador;
        
        if (userValue.equals("admin") && passValue.equals("123")) 
        {
            Software x = new Software();
            
            x.LoginAdministrador();
     
            x.setVisible(true);
            
            
            
            
          close();
        }
        
        
        
        
        
        
        
        
        
        
   

        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}

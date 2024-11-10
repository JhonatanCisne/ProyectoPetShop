package Vistas;
import Controlador.ListaEnlazada;
import Controlador.Usuario;
import Modelo.crud;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class AgregarEliminar extends javax.swing.JFrame {
  private String usuario;
  
  public void setUsuario(String admin){
      this.usuario=admin;
  }
    
    /*public String usuario;

    public AgregarEliminar( ) {
        this.usuario = getUsuario();

        System.out.println("Usuario: " + this.usuario);
    }

    public void recibir(Usuario usuarioObjeto){
        this.usuario = usuarioObjeto.getUsuario();

        System.out.println("Usuario (recibido): " + this.usuario);
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }*/


    
        private ListaEnlazada lista = new ListaEnlazada();
        public AgregarEliminar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        content12 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        modificarEliminar = new javax.swing.JButton();
        modificarNombre = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        modificarGuardar = new javax.swing.JButton();
        modificarAgregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1150, 620));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        content12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setBackground(new java.awt.Color(0, 0, 0));
        jLabel61.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel61.setText("Nombre:");

        jLabel63.setBackground(new java.awt.Color(0, 0, 0));
        jLabel63.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel64.setBackground(new java.awt.Color(0, 0, 0));
        jLabel64.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel64.setText("Cantidad");

        modificarEliminar.setBackground(new java.awt.Color(204, 255, 255));
        modificarEliminar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        modificarEliminar.setText("ELIMINAR");
        modificarEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarEliminarMouseClicked(evt);
            }
        });

        modificarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNombreActionPerformed(evt);
            }
        });

        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        modificarGuardar.setText("jButton6");
        modificarGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarGuardarMouseClicked(evt);
            }
        });

        modificarAgregar.setBackground(new java.awt.Color(0, 153, 153));
        modificarAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modificarAgregar.setForeground(new java.awt.Color(255, 255, 255));
        modificarAgregar.setText("Agregar");
        modificarAgregar.setBorderPainted(false);
        modificarAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout content12Layout = new javax.swing.GroupLayout(content12);
        content12.setLayout(content12Layout);
        content12Layout.setHorizontalGroup(
            content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content12Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel63)
                .addGap(63, 63, 63)
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content12Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(modificarEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarAgregar)
                .addGap(114, 114, 114)
                .addComponent(modificarGuardar)
                .addGap(158, 158, 158))
        );
        content12Layout.setVerticalGroup(
            content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content12Layout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content12Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content12Layout.createSequentialGroup()
                        .addComponent(modificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(content12Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(content12Layout.createSequentialGroup()
                        .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                        .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificarEliminar)
                            .addComponent(modificarGuardar)
                            .addComponent(modificarAgregar))
                        .addGap(91, 91, 91))))
        );

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Lista");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registro");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agregar/Eliminar");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(content12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modificarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarNombreActionPerformed
 
    }//GEN-LAST:event_modificarNombreActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
    }//GEN-LAST:event_CantidadActionPerformed
       
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void modificarGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarGuardarMouseClicked
    Connection con = crud.getConexion();

    if (con != null) {
        lista.ejecutarInstrucciones(con);

        JOptionPane.showMessageDialog(this, "Se modificaron los productos", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        lista = new ListaEnlazada(); 
    } else {
        JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_modificarGuardarMouseClicked

    private void modificarEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarEliminarMouseClicked

        String nombre = Cantidad.getText().trim();
        String nombreAdmin= usuario;
    if (!nombre.isEmpty()) {
    try {
        int cantidad = Integer.parseInt(Cantidad.getText());
        
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Obtener la conexión
        Connection con = crud.getConexion();
        
        if (con != null) {
            String sql = "{CALL sp_restar_producto(?, ?, ?)}"; 
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                // Establecer los parámetros
                stmt.setString(1, nombre);    
                stmt.setInt(2, cantidad);     
                stmt.setString(3, nombreAdmin); 
                
                // Ejecutar el procedimiento
                stmt.executeUpdate();
                
                // Mostrar un mensaje de éxito
                JOptionPane.showMessageDialog(this, "Producto modificado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                // En caso de error con el procedimiento
                JOptionPane.showMessageDialog(this, "Error al ejecutar el procedimiento", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this, "Ingrese el nombre del producto", "Error", JOptionPane.ERROR_MESSAGE);
}

            
    }//GEN-LAST:event_modificarEliminarMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void modificarAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarAgregarMouseClicked
Inicio ini=new Inicio();
 String nombre = modificarNombre.getText().trim();  
String cantidades = Cantidad.getText().trim();  
String admin = usuario;
System.out.println(admin);


if (!nombre.isEmpty() && !cantidades.isEmpty()) {
    try {
        int cantidad = Integer.parseInt(cantidades);  


        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String sqlActualizarProducto = "UPDATE Producto " +
                                       "SET cantidad = cantidad + " + cantidades + " " +
                                       "WHERE id_nombreprod = (SELECT id_nombreprod FROM Producto_Nombre WHERE nombreprod = '" + nombre + "')";
        
         String sqlInsertRegistro = "INSERT INTO registro (usuario, id_producto, cantidad) " +
                                   "VALUES (" +
                                   "(SELECT usuario FROM Administrador WHERE nombre = '" + this.usuario + "'), " +
                                   "(SELECT id_producto FROM Producto WHERE id_nombreprod = " +
                                   "(SELECT id_nombreprod FROM Producto_Nombre WHERE nombreprod = '" + nombre + "')), " +
                                   cantidad + ")";

        lista.addInstruccion(sqlInsertRegistro);
        lista.addInstruccion(sqlActualizarProducto); 

        JOptionPane.showMessageDialog(this, "Instrucción almacenada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} else {
    JOptionPane.showMessageDialog(this, "Ingrese el nombre del producto y la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_modificarAgregarMouseClicked

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
            java.util.logging.Logger.getLogger(AgregarEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AgregarEliminar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Cantidad;
    private javax.swing.JPanel content12;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton modificarAgregar;
    public javax.swing.JButton modificarEliminar;
    private javax.swing.JButton modificarGuardar;
    public javax.swing.JTextField modificarNombre;
    // End of variables declaration//GEN-END:variables
}

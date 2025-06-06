package Vistas;
import Controlador.ListaEnlazada;
import Modelo.crud;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.ArrayList;

public class AgregarEliminar extends javax.swing.JFrame {
  private String usuario;
  public void setUsuario(String admin){
      this.usuario=admin;
  }
        private ListaEnlazada lista = new ListaEnlazada();
        ArrayList<String> productos = new ArrayList<>();
        public AgregarEliminar() {
            initComponents();
            setLocationRelativeTo(null);

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
        Ver = new javax.swing.JButton();
        listaBoton = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
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

        modificarEliminar.setBackground(new java.awt.Color(0, 153, 153));
        modificarEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modificarEliminar.setForeground(new java.awt.Color(255, 255, 255));
        modificarEliminar.setText("Eliminar");
        modificarEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarEliminarMouseClicked(evt);
            }
        });

        modificarNombre.setBackground(new java.awt.Color(255, 255, 255));
        modificarNombre.setForeground(new java.awt.Color(0, 0, 0));
        modificarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNombreActionPerformed(evt);
            }
        });

        Cantidad.setBackground(new java.awt.Color(255, 255, 255));
        Cantidad.setForeground(new java.awt.Color(0, 0, 0));
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        modificarGuardar.setBackground(new java.awt.Color(0, 153, 153));
        modificarGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modificarGuardar.setForeground(new java.awt.Color(255, 255, 255));
        modificarGuardar.setText("Guardar");
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

        Ver.setBackground(new java.awt.Color(0, 153, 153));
        Ver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Ver.setForeground(new java.awt.Color(255, 255, 255));
        Ver.setText("Ver");
        Ver.setBorderPainted(false);
        Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout content12Layout = new javax.swing.GroupLayout(content12);
        content12.setLayout(content12Layout);
        content12Layout.setHorizontalGroup(
            content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content12Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modificarEliminar)
                    .addGroup(content12Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(63, 63, 63)
                        .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel64))))
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(content12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166))
                    .addGroup(content12Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(modificarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(modificarGuardar)
                        .addGap(45, 45, 45))))
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
                            .addComponent(modificarAgregar)
                            .addComponent(Ver))
                        .addGap(91, 91, 91))))
        );

        listaBoton.setBackground(new java.awt.Color(0, 153, 153));
        listaBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listaBoton.setForeground(new java.awt.Color(255, 255, 255));
        listaBoton.setText("Lista");
        listaBoton.setBorderPainted(false);
        listaBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaBotonMouseClicked(evt);
            }
        });
        listaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaBotonActionPerformed(evt);
            }
        });

        botonRegistro.setBackground(new java.awt.Color(0, 153, 153));
        botonRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("Registro");
        botonRegistro.setBorderPainted(false);
        botonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistroMouseClicked(evt);
            }
        });
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 153, 153));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar Precio");
        btnActualizar.setBorderPainted(false);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(content12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(listaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaBoton)
                    .addComponent(botonRegistro)
                    .addComponent(jButton5)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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

    private void listaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaBotonActionPerformed

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void modificarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarNombreActionPerformed
 
    }//GEN-LAST:event_modificarNombreActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
    }//GEN-LAST:event_CantidadActionPerformed
       
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void modificarGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarGuardarMouseClicked
        Connection con = crud.getConexion();
        if (con != null) {
            lista.ejecutarInstrucciones(con);
            productos.clear();
            JOptionPane.showMessageDialog(this, "Se modificaron los productos", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            lista = new ListaEnlazada(); 
         } else {
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_modificarGuardarMouseClicked

    private void modificarEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarEliminarMouseClicked
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
                                       "SET cantidad = cantidad - " + cantidades + " " +
                                       "WHERE id_nombreprod = (SELECT id_nombreprod FROM Producto_Nombre WHERE nombreprod = '" + nombre + "')";       
            String sqlInsertRegistro = "INSERT INTO registro (usuario, id_producto, cantidad) " +
                                   "VALUES (" +
                                   "(SELECT usuario FROM Administrador WHERE nombre = '" + this.usuario + "'), " +
                                   "(SELECT id_producto FROM Producto WHERE id_nombreprod = " +
                                   "(SELECT id_nombreprod FROM Producto_Nombre WHERE nombreprod = '" + nombre + "')), -" +
                                   cantidad + ")";
            lista.addInstruccion(sqlInsertRegistro);
            lista.addInstruccion(sqlActualizarProducto); 
            int cantidadArray=cantidad-(cantidad*2);
            productos.add("Producto: " + nombre + ", Cantidad: " + cantidadArray);
            JOptionPane.showMessageDialog(this, "Indicación enlistada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del producto y la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
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
                                    "WHERE id_nombreprod = (SELECT id_nombreprod FROM Producto_Nombre WHERE nombreprod = '" 
                                    + nombre + "')";
                String sqlInsertRegistro = "INSERT INTO registro (usuario, id_producto, cantidad) " +
                                   "VALUES (" +
                                   "(SELECT usuario FROM Administrador WHERE nombre = '" + this.usuario + "'), " +
                                   "(SELECT id_producto FROM Producto WHERE id_nombreprod = " +
                                   "(SELECT id_nombreprod FROM Producto_Nombre WHERE nombreprod = '" + nombre + "')), " +
                                   cantidad + ")";
            lista.addInstruccion(sqlInsertRegistro);
            lista.addInstruccion(sqlActualizarProducto); 
            productos.add("Producto: " + nombre + ", Cantidad: " + cantidad);
            JOptionPane.showMessageDialog(this, "Indicación enlistada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese el nombre del producto y la cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_modificarAgregarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        Actualizar ac=new Actualizar();
        ac.setUsuario(usuario);  
        ac.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void listaBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaBotonMouseClicked
        Lista listaver=new Lista();
        listaver.setUsuario(usuario); 
        listaver.setVisible(true); 
        this.dispose();   
    }//GEN-LAST:event_listaBotonMouseClicked

    private void botonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMouseClicked
         Registro registro=new Registro();
        registro.setUsuario(usuario); 
        registro.setVisible(true); 
        this.dispose();   
    }//GEN-LAST:event_botonRegistroMouseClicked

    private void VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMouseClicked
    Inicio ini = new Inicio();
    if (productos.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay productos registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
    } else {
        StringBuilder sb = new StringBuilder();
        for (String producto : productos) {
            sb.append(producto).append("\n");
        }
        int option = JOptionPane.showConfirmDialog(this, sb.toString() + "\nEliminar última instrucción", 
                                                   "Eliminar última instrucción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            lista.eliminarUltimoNodo();
            if (!productos.isEmpty()) {
                productos.remove(productos.size() - 1);
            }
            JOptionPane.showMessageDialog(this, "última instrucción eliminados.", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_VerMouseClicked

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
    public javax.swing.JButton Ver;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JPanel content12;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton listaBoton;
    private javax.swing.JButton modificarAgregar;
    public javax.swing.JButton modificarEliminar;
    private javax.swing.JButton modificarGuardar;
    public javax.swing.JTextField modificarNombre;
    // End of variables declaration//GEN-END:variables
}
